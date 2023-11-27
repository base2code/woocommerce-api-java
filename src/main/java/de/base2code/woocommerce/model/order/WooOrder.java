package de.base2code.woocommerce.model.order;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class WooOrder{
    private int id;
    @SerializedName("parent_id")
    private int parentId;
    private String number;
    @SerializedName("order_key")
    private String orderKey;
    @SerializedName("created_via")
    private String createdVia;
    private String version;
    private String status;
    private String currency;
    @SerializedName("date_created")
    private Date dateCreated;
    @SerializedName("date_created_gmt")
    private Date dateCreatedGmt;
    @SerializedName("date_modified")
    private Date dateModified;
    @SerializedName("date_modified_gmt")
    private Date dateModifiedGmt;
    @SerializedName("discount_total")
    private String discountTotal;
    @SerializedName("discount_tax")
    private String discountTax;
    @SerializedName("shipping_total")
    private String shippingTotal;
    @SerializedName("shipping_tax")
    private String shippingTax;
    @SerializedName("cart_tax")
    private String cartTax;
    private String total;
    @SerializedName("total_tax")
    private String totalTax;
    @SerializedName("prices_include_tax")
    private boolean pricesIncludeTax;
    @SerializedName("customer_id")
    private int customerId;
    @SerializedName("customer_ip_address")
    private String customerIpAddress;
    @SerializedName("customer_user_agent")
    private String customerUserAgent;
    @SerializedName("customer_note")
    private String customerNote;
    private Billing billing;
    private Shipping shipping;
    @SerializedName("payment_method")
    private String paymentMethod;
    @SerializedName("payment_method_title")
    private String paymentMethodTitle;
    @SerializedName("transaction_id")
    private String transactionId;
    @SerializedName("date_paid")
    private Date datePaid;
    @SerializedName("date_paid_gmt")
    private Date datePaidGmt;
    @SerializedName("date_completed")
    private Object dateCompleted;
    @SerializedName("date_completed_gmt")
    private Object dateCompletedGmt;
    @SerializedName("cart_hash")
    private String cartHash;
    @SerializedName("meta_data")
    private ArrayList<MetaData> metaData;
    @SerializedName("line_items")
    private ArrayList<LineItem> lineItems;
    @SerializedName("tax_lines")
    private ArrayList<TaxLine> taxLines;
    @SerializedName("shipping_lines")
    private ArrayList<ShippingLine> shippingLines;
    @SerializedName("fee_lines")
    private ArrayList<Object> feeLines;
    @SerializedName("coupon_lines")
    private ArrayList<Object> couponLines;
    private ArrayList<Object> refunds;
}



