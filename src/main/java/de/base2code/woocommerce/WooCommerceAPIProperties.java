package de.base2code.woocommerce;

public class WooCommerceAPIProperties {
    private final String baseUrl;
    private final String consumerKey;
    private final String consumerSecret;

    public WooCommerceAPIProperties(String baseUrl, String consumerKey, String consumerSecret) {
        if (baseUrl.endsWith("/")) {
            baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
        }
        this.baseUrl = baseUrl;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    // TODO: Make configurable
    public String getFullUrl() {
        return baseUrl + "/wp-json/wc/v3";
    }
}
