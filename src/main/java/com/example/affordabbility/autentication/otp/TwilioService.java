package com.example.affordabbility.autentication.otp;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class TwilioService {
    private static final String TWILIO_ACCOUNT_SID = "AC013dbd148519a8b8cd3ef4e8bb99d08d";
    private static final String TWILIO_AUTH_TOKEN = "b2bb079c660841e75b30ebf42556102c";
    private static final String TWILIO_PHONE_NUMBER = "+16822975503";

    public void sendSms(String toPhoneNumber, String message) {
        Twilio.init(TWILIO_ACCOUNT_SID, TWILIO_AUTH_TOKEN);
        Message.creator(
                new PhoneNumber(toPhoneNumber),
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                message)
                .create();
    }
}
