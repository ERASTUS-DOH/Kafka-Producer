package com.tarya.Message.Producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanDisbursedNotification {
    private String loanId;
    private String messageType;
    private Double loanAmountDisbursed;
    private Date dateDisbursed;
    private RecipientDetails recipientDetails;
}
