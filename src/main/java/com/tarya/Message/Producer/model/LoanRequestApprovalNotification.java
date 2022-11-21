package com.tarya.Message.Producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanRequestApprovalNotification {
    private String loanId;
    private String messageType;
    private Date nextPaymentDueDate;
    private Double amountApproved;
    private Double totalAmountToBePaid;
    private int tenure;
    private Double interestAmount;
    private Double feeAmount;
    private RecipientDetails recipientDetails;
}
