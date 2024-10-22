package com.senderThread.sender.senderThread;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageSenderThread extends Thread{
	private Logger log = LoggerFactory.getLogger(MessageSenderThread.class);
	
	
	
	@Override
	public void run()
	{
		log.info("The Thread is started");
		
		boolean msgStatus=sendMessage("Hello".getBytes());
		
		System.out.print(msgStatus);
	}
	
	
	public boolean sendMessage( byte[] messageToSend) {
		//
		//log.info("Send Message");
		//
		try {
			SocketChannel receiverChannel = SocketChannel.open(new InetSocketAddress("localhost",8081));
		    
			ByteBuffer sendBuffer = null;
			Integer bytesTransfered;
			Integer messageTotalBytes = messageToSend.length;
			Integer remainingBytes = messageTotalBytes;
			sendBuffer = ByteBuffer.wrap(messageToSend);

			while (remainingBytes != 0) {
				bytesTransfered = receiverChannel.write(sendBuffer);
				if (bytesTransfered > 0) {
					remainingBytes = remainingBytes - bytesTransfered;
					sendBuffer.compact();
					System.out.print("semded");
				}
			}
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}
