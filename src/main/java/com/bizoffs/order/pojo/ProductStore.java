package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the PRODUCT_STORE database table.
 * 
 */
@Data
public class ProductStore implements Serializable{

	private static final long serialVersionUID = 1L;
		private String productStoreId;
		private String addToCartRemoveIncompat;
		private String addToCartReplaceUpsell;
		private String allocateInventory;
		private String allowComment;
		private String allowPassword;
		private String authDeclinedMessage;
		private String authErrorMessage;
		private String authFraudMessage;
		private String autoApproveInvoice;
		private String autoApproveOrder;
		private String autoApproveReviews;
		private String autoInvoiceDigitalItems;
		private String autoOrderCcTryExp;
		private BigDecimal autoOrderCcTryLaterMax;
		private String autoOrderCcTryLaterNsf;
		private String autoOrderCcTryOtherCards;
		private String autoSaveCart;
		private String balanceResOnOrderCreation;
		private String checkGcBalance;
		private String checkInventory;
		private String companyName;
		private Timestamp createdStamp;
		private Timestamp createdTxStamp;
		private BigDecimal daysToCancelNonPay;
		private String defaultLocaleString;
		private String defaultPassword;
		private String defaultTimeZoneString;
		private String digProdUploadCategoryId;
		private String enableAutoSuggestionList;
		private String enableDigProdUpload;
		private String explodeOrderItems;
		private String isDemoStore;
		private String isImmediatelyFulfilled;
		private Timestamp lastUpdatedStamp;
		private Timestamp lastUpdatedTxStamp;
		private String managedByLot;
		private String manualAuthIsCapture;
		private String oneInventoryFacility;
		private String orderDecimalQuantity;
		private String orderNumberPrefix;
		private String prodSearchExcludeVariants;
		private String prorateShipping;
		private String prorateTaxes;
		private String reqReturnInventoryReceive;
		private String reqShipAddrForDigItems;
		private String requireCustomerRole;
		private String requireInventory;
		private String reserveInventory;
		private String retryFailedAuths;
		private String selectPaymentTypePerItem;
		private String setOwnerUponIssuance;
		private String shipIfCaptureFails;
		private String showCheckoutGiftOptions;
		private String showOutOfStockProducts;
		private String showPricesWithVatTax;
		private String showTaxIsExempt;
		private String splitPayPrefPerShpGrp;
		private BigDecimal storeCreditValidDays;
		private String storeName;
		private String subtitle;
		private String title;
		private String usePrimaryEmailUsername;
		private String viewCartOnAdd;
		private String visualThemeId;
}