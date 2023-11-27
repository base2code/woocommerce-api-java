package de.base2code.woocommerce.model.order;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Billing {
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    private String company;
    @SerializedName("address_1")
    private String address1;
    @SerializedName("address_2")
    private String address2;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String email;
    private String phone;
}
