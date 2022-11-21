package com.tarya.Message.Producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DefaultNotification {
    private String loanId;
    private Double loanAmount;
    private String dateOfClosure;
    private String reasonOfClosure;
    private String messageType;
    private RecipientDetails recipientDetails;

    private Double loanAmountDisbursed;
    private String dateDisbursed;

    private Double amountPaid;
    private String repaymentDate;
    private Double amountOutstanding;
    private Double totalAmountPaidAsOfNow;
    private String nextRepaymentDueDate;

    private String nextPaymentDueDate;
    private Double amountApproved;
    private Double totalAmountToBePaid;
    private int tenure;
    private Double interestAmount;
    private Double feeAmount;
}
