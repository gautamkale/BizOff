package com.bizoffs.order.pojo;

import com.bizoffs.order.entities.OrderPaymentPreference;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.List;

;

@Data
public class PaymentGatewayResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String paymentGatewayResponseId;
    private String altReference;
    private BigDecimal amount;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String gatewayAvsResult;
    private String gatewayCode;
    private String gatewayCvResult;
    private String gatewayFlag;
    private String gatewayMessage;
    private String gatewayScoreResult;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private String referenceNum;
    private String resultBadCardNumber;
    private String resultBadExpire;
    private String resultDeclined;
    private String resultNsf;
    private String subReference;
    private Timestamp transactionDate;
   /* private List<Payment> payments;
    private Enumeration enumeration1;
    private Enumeration enumeration2;
    private OrderPaymentPreference orderPaymentPreference;
    private PaymentMethod paymentMethod;
    private PaymentMethodType paymentMethodType;
    private Uom uom;
    private List<PaymentGatewayRespMsg> paymentGatewayRespMsgs;*/
}