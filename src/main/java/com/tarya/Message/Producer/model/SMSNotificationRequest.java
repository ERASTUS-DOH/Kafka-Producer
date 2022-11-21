package com.tarya.Message.Producer.model;

import lombok.*;

import java.util.List;


public class SMSNotificationRequest {
    private String sender;
    private String message;
    private String recipientContact;

    public SMSNotificationRequest(){

    }

    public SMSNotificationRequest(String sender, String message, String recipientContact) {
        this.sender = sender;
        this.message = message;
        this.recipientContact = recipientContact;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipientContact() {
        return recipientContact;
    }

    public void setRecipientContact(String recipientContact) {
        this.recipientContact = recipientContact;
    }

    @Override
    public String toString() {
        return "SMSNotificationRequest{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", recipientContact='" + recipientContact + '\'' +
                '}';
    }
}
