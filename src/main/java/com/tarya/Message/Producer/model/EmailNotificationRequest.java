package com.tarya.Message.Producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailNotificationRequest {
    public String recipientEmailAddress;
    public String emailSubject;
    public String emailText;
    public List<String> emailCCList;
}
