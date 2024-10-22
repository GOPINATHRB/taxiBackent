package com.senderThread.sender.resource;

import com.senderThread.sender.domain.LoginRequest;
import org.apache.juli.logging.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentDeatailsResource {



    @GetMapping("/message")
    public String simpleMessage(){
       return "hi";
    }


    @PostMapping("/createNewMessage")
    public String createNewMessage(@RequestParam String message){
        return message;

    }

    @PostMapping("/welcome")
    public ResponseEntity<String> welcomeMEssage(@RequestParam String message){
        return ResponseEntity.ok().body(message);

    }

    @PostMapping("/createNewMessageRequest")
    public List<LoginRequest> createNewMessageRequest(@RequestBody LoginRequest request){
       // LoginRequest gopiRequest = request;
        LoginRequest gopiRequest = new LoginRequest();

        System.out.println("just sending data");
        gopiRequest.setUsername(request.getUsername());
        gopiRequest.setPassword(request.getPassword());

        List<LoginRequest> requests = new ArrayList<>();


        requests.add(request);

        gopiRequest.setUsername("sanker");
        gopiRequest.setPassword("sankerPassword");


        requests.add(gopiRequest);


        return requests;
    }


}
