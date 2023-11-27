package de.base2code.woocommerce;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.base2code.woocommerce.model.http.HttpResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;

public class WooCommerceAPI {
    private final WooCommerceAPIProperties properties;
    private final OkHttpClient client;
    private final Gson gson;

    public WooCommerceAPI(WooCommerceAPIProperties properties) {
        this.properties = properties;
        client = new OkHttpClient();
        gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .create();
    }

    public HttpResponse get(String path) throws IOException {
        Request request = new Request.Builder()
                .url(properties.getFullUrl() + path)
                .addHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString((properties.getConsumerKey() + ":" + properties.getConsumerSecret()).getBytes()))
                .build();
        try (Response response = client.newCall(request).execute()) {
            return new HttpResponse(response);
        }
    }


    public WooOrderAPI wooOrderAPI() {
        return new WooOrderAPI(this);
    }

    public Gson getGson() {
        return gson;
    }
}
