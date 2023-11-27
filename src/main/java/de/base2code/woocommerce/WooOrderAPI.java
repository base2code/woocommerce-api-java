package de.base2code.woocommerce;

import de.base2code.woocommerce.model.http.HttpResponse;
import de.base2code.woocommerce.model.order.WooOrder;
import okhttp3.Response;

import java.io.IOException;

public class WooOrderAPI {
    private final WooCommerceAPI wooCommerceAPI;

    public WooOrderAPI(WooCommerceAPI wooCommerceAPI) {
        this.wooCommerceAPI = wooCommerceAPI;
    }

    public WooOrder getOrder(int id) throws IOException {
        HttpResponse response = wooCommerceAPI.get("/orders/" + id);
        if (response.isSuccessful()) {
            return wooCommerceAPI.getGson().fromJson(response.getBody(), WooOrder.class);
        } else {
            return null;
        }
    }
}
