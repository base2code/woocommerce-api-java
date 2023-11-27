package de.base2code.woocommerce.model.order;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Taxes {
    private int id;
    private String total;
    private String subtotal;
}
