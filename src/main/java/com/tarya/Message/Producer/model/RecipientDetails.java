package com.tarya.Message.Producer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipientDetails {
    private String recipientName;
    private String recipientEmail;
    private String recipientPhoneNumber;
}
