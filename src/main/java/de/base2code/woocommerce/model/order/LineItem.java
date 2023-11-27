package de.base2code.woocommerce.model.order;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class LineItem {
    private int id;
    private String name;
    @SerializedName("product_id")
    private int productId;
    @SerializedName("variation_id")
    private int variationId;
    private int quantity;
    @SerializedName("tax_class")
    private String taxClass;
    private String subtotal;
    @SerializedName("subtotal_tax")
    private String subtotalTax;
    private String total;
    @SerializedName("total_tax")
    private String totalTax;
    private List<Taxes> taxes;
    @SerializedName("meta_data")
    private List<MetaData> metaData;
    private String sku;
    private int price;
}
