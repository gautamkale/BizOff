package com.bizoffs.order.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
public class Product {
    private static final long serialVersionUID = 1L;
    private String productId;
    private String autoCreateKeywords;
    private BigDecimal billOfMaterialLevel;
    private String brandName;
    private String chargeShipping;
    private String comments;
    private String configId;
    private Timestamp createdDate;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String description;
    private String detailImageUrl;
    private String detailScreen;
    private BigDecimal fixedAmount;
    private String inShippingBox;
    private String includeInPromotions;
    private String internalName;
    private Timestamp introductionDate;
    private String inventoryMessage;
    private String isVariant;
    private String isVirtual;
    private String largeImageUrl;
    private Timestamp lastModifiedDate;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private String longDescription;
    private String lotIdFilledIn;
    private String mediumImageUrl;
    private String orderDecimalQuantity;
    private String originalImageUrl;
    private Long piecesIncluded;
    private String priceDetailText;
    private BigDecimal productDepth;
    private BigDecimal productDiameter;
    private BigDecimal productHeight;
    private String productName;
    private BigDecimal productRating;
    private BigDecimal productWeight;
    private BigDecimal productWidth;
    private BigDecimal quantityIncluded;
    private Timestamp releaseDate;
    private String requireAmount;
    private String requireInventory;
    private BigDecimal reservMaxPersons;
    private BigDecimal reservNthPPPerc;
    private BigDecimal reserv2ndPPPerc;
    private String returnable;
    private String salesDiscWhenNotAvail;
    private Timestamp salesDiscontinuationDate;
    private BigDecimal shippingDepth;
    private BigDecimal shippingHeight;
    private BigDecimal shippingWeight;
    private BigDecimal shippingWidth;
    private String smallImageUrl;
    private Timestamp supportDiscontinuationDate;
    private String taxable;

    private boolean shippingApplies;
    private ProductType productType;

//    private List<ProductAssoc> productAssocs;*/
}
