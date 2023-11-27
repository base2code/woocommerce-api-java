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
public class ShippingLine {
    private int id;
    @SerializedName("method_title")
    private String methodTitle;
    @SerializedName("method_id")
    private String methodId;
    private String total;
    @SerializedName("total_tax")
    private String totalTax;
    private List<Taxes> taxes;
    @SerializedName("meta_data")
    private List<MetaData> metaData;
}
