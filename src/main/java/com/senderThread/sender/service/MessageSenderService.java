package com.senderThread.sender.service;

import org.springframework.stereotype.Service;

import com.senderThread.sender.senderThread.*;


@Service
public class MessageSenderService {
	
	
	public String sendMessage() {
		
		MessageSenderThread senderThread =  new MessageSenderThread();

		MessageSenderThread senderThread2 =  new MessageSenderThread();
		// start the thread
		senderThread.start();
		senderThread2.start();
		return null;
		
	}

}
