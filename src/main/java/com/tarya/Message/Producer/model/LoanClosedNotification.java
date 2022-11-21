package com.tarya.Message.Producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanClosedNotification {
    private String loanId;
    private Double loanAmount;
    private String dateOfClosure;
    private String reasonOfClosure;
    private String messageType;
    private RecipientDetails recipientDetails;
}
