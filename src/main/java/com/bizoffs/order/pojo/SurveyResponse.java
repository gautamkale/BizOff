package com.bizoffs.order.pojo;

import com.bizoffs.order.entities.ShoppingListItemSurvey;
import com.bizoffs.order.entities.StatusItem;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

;

@Data
public class SurveyResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String surveyResponseId;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String generalFeedback;
    private Timestamp lastModifiedDate;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private String orderId;
    private String orderItemSeqId;
    private String partyId;
    private String referenceId;
    private Timestamp responseDate;
  /*  private List<DataResource> dataResources;
    private List<GiftCardFulfillment> giftCardFulfillments;
    private List<ShoppingListItemSurvey> shoppingListItemSurveys;
    private StatusItem statusItem;
    private Survey survey;
    private List<SurveyResponseAnswer> surveyResponseAnswers;*/
}