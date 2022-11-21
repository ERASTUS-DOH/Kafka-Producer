package com.tarya.Message.Producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanRepaymentNotification {
    private String loanId;
    private Double amountPaid;
    private Date repaymentDate;
    private Double amountOutstanding;
    private String messageType;
    private Double totalAmountPaidAsOfNow;
    private Date nextRepaymentDueDate;
    private RecipientDetails recipientDetails;
}
