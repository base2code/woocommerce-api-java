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
public class TaxLine {
    private int id;
    @SerializedName("rate_code")
    private String rateCode;
    @SerializedName("rate_id")
    private int rateId;
    private String label;
    private boolean compound;
    @SerializedName("tax_total")
    private String taxTotal;
    @SerializedName("shipping_tax_total")
    private String shippingTaxTotal;
    @SerializedName("meta_data")
    private List<Object> metaData;
}
