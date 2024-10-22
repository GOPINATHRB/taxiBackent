/*
package com.senderThread.sender.service;

import com.senderThread.sender.conf.TwilioConfig;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WhatsAppService {

    private final TwilioConfig twilioConfig;

    @Autowired
    public WhatsAppService(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }

    public String sendWhatsAppMessage(String to, String messageBody) {
        try {
            Message message = Message.creator(
                    new PhoneNumber("whatsapp:+91" + to),  // Receiver's WhatsApp number
                    "MG358f92e95f2936ea2870c7d810b4c97f",  // Sender's WhatsApp number
                    messageBody
            ).create();

            return "Message sent successfully with SID: " + message.getSid();
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to send message: " + e.getMessage();
        }
    }
}
*/
