package config;

public class BaseUrl {

    String base = "https://oms-prd-api.ctdigital.id";

    public String urls(String slash) {
        return base + slash;
    }
}
