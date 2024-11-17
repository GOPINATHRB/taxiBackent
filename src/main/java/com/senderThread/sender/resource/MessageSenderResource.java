
package com.senderThread.sender.resource;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.senderThread.sender.conf.JwtAuthenticationFilter;
import com.senderThread.sender.conf.JwtUtil;
import com.senderThread.sender.domain.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import com.senderThread.sender.service.MessageSenderService;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

@RestController
public class MessageSenderResource {


	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserDetailsService userDetailsService;


	/*@Autowired
	private WhatsAppService whatsAppService;*/


	@Autowired
	private MessageSenderService messageSenderService;

	private JwtAuthenticationFilter jwtAuthenticationFilter;


	@PostMapping("/login")
	public String login(@RequestBody LoginRequest loginRequest ) {

		try {

			System.out.println(loginRequest.getUsername()+" "+loginRequest.getPassword());

			vrsslm92@gmail.com

			if(loginRequest.getUsername().equals("shanjeyshanjey0@gmail.com") && loginRequest.getPassword().equals("Gopinath0@") || loginRequest.getUsername().equals("vrsslm92@gmail.com") && loginRequest.getPassword().equals("vrsslm92") ){
				return jwtUtil.generateToken(loginRequest.getUsername());
			}
			return "invalid credentials";
		} catch (AuthenticationException e) {
            throw new RuntimeException(e);
        }
        //call the sender message


	}




	@GetMapping("/messageLogin")
	public String loginMessage() {

		//call the sender message

	//	messageSenderService.sendMessage();
		return "connected";
		//return jwtAuthenticationFilter.generateToken("shanjeyshanjey0@gmail.com");
	}


/*
    * send business message via whatsapp using
    * mobile number
    *
    * */





	@PostMapping("/send")
	public String sendWhatsAppMessage(@RequestParam String to, @RequestParam String message) {
		//return whatsAppService.sendWhatsAppMessage(to, message);
        return "message";
	}



	@PostMapping("/authenticate")
	public String authenticate(@RequestBody LoginRequest authRequest) throws Exception {
		try {

         Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
			);
			return "validation success";
		} catch (AuthenticationException e) {
			throw new Exception("Invalid username or password", e);
		}
	}


	@PostMapping("/refresh-token")
	public ResponseEntity<?> refreshToken(@RequestHeader("Authorization") String token) {
		if (token != null && token.startsWith("Bearer ")) {
			token = token.substring(7);
		} else {
			return ResponseEntity.badRequest().body("Invalid token");
		}

		String username = jwtUtil.extractUsername(token);
		UserDetails userDetails = userDetailsService.loadUserByUsername(username);

		if (jwtUtil.validateToken(token, userDetails.getUsername())) {
			String newToken = jwtUtil.generateToken(userDetails.getUsername());
			return ResponseEntity.ok(newToken);
		} else {
			return ResponseEntity.status(403).body("Token expired or invalid");
		}
	}



}

