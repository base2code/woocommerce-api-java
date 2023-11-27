package de.base2code.woocommerce.model.order;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class MetaData {
    private int id;
    private String key;
    private String value;
}
