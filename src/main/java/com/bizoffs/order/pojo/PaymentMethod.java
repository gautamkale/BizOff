package com.bizoffs.order.pojo;

import com.bizoffs.order.entities.OrderPaymentPreference;
import com.bizoffs.order.entities.ReturnHeader;
import com.bizoffs.order.entities.ShoppingList;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

;

@Data
public class PaymentMethod implements Serializable {
    private static final long serialVersionUID = 1L;
    private String paymentMethodId;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String description;
    private Timestamp fromDate;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp thruDate;
    private CheckAccount checkAccount;
    private CreditCard creditCard;
    private EftAccount eftAccount;
    //private List<FinAccount> finAccounts;
   // private GiftCard giftCard;
    private List<OrderPaymentPreference> orderPaymentPreferences;
   // private List<PartyAcctgPreference> partyAcctgPreferences;
    private List<Payment> payments;
   // private List<PaymentGatewayResponse> paymentGatewayResponses;
   // private FinAccount finAccount;
   // private GlAccount glAccount;
  //  private Party party;
  //  private PaymentMethodType paymentMethodType;
  //  private PayPalPaymentMethod payPalPaymentMethod;
    private List<ReturnHeader> returnHeaders;
    private List<ShoppingList> shoppingLists;
}