package com.tarya.Message.Producer.service;


import com.tarya.Message.Producer.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class EventPublisher {

private static final Logger LOGGER = Logger.getLogger(EventPublisher.class.getName());
    private static final String TIME_RATE_IN_MILLISECONDS = "120000";
    private static final String TOPIC = "email-out-0";
    private static final String TOPIC2 = "sms-out-0";

    private static final String TOPIC3 = "notification-out-0";
    private final StreamBridge streamBridge;


    @Scheduled(fixedRateString = TIME_RATE_IN_MILLISECONDS)
    void publishEvent(){
//        EmailNotificationRequest emailNotificationRequest = new EmailNotificationRequest();
//        emailNotificationRequest.setRecipientEmailAddress("erastus.doh@peswa.finance");
//        emailNotificationRequest.setEmailSubject("Test Email event");
//        emailNotificationRequest.setEmailText("Welcome home to the world of amazing financial products");
//        LOGGER.info(emailNotificationRequest.toString());
////        streamBridge.send(TOPIC, emailNotificationRequest);
//        SMSNotificationRequest smsNotificationRequest = new SMSNotificationRequest();
//        smsNotificationRequest.setMessage("This is a test sms");
//        smsNotificationRequest.setRecipientContact("+233241406244");
//        smsNotificationRequest.setSender("support@peswa.finance");
//        LOGGER.info(smsNotificationRequest.toString());


        RecipientDetails recipientDetails = new RecipientDetails();
        recipientDetails.setRecipientEmail("erastus.doh@peswa.finance");
        recipientDetails.setRecipientName("Elinam");
        recipientDetails.setRecipientPhoneNumber("+233241406244");

//        LoanClosedNotification loanClosedNotification = new LoanClosedNotification();
        DefaultNotification defaultNotification = new DefaultNotification();
        defaultNotification.setLoanId("122222");
        defaultNotification.setLoanAmount(120000.00);
        defaultNotification.setMessageType("Loan-Closed-Notification");
        defaultNotification.setRecipientDetails(recipientDetails);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        defaultNotification.setDateOfClosure(formatter.format(date));
        LOGGER.info(defaultNotification.toString());

        streamBridge.send(TOPIC3, defaultNotification);
    }
}
