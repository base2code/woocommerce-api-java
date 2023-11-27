package de.base2code.woocommerce.model.http;

import lombok.*;
import okhttp3.Response;

import java.io.IOException;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class HttpResponse {
    private int code;
    private String body;

    public HttpResponse(Response response) throws IOException {
        this.code = response.code();
        this.body = response.body().string();
    }

    public boolean isSuccessful() {
        return code >= 200 && code < 300;
    }
}
