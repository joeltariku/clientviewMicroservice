package com.example.clientviewMicroservice;

public class AdditionalInfo {
    long userId;
    String productName;
    String additionalContent;

    public AdditionalInfo(long userId, String productName, String additionalContent) {
        this.userId = userId;
        this.productName = productName;
        this.additionalContent = additionalContent;
    }

    public AdditionalInfo() {}

    public long getUserId() {return userId;}
    public void setUserId(long userId) {}
    public String getProductName() {return productName;}
    public void setProductName(String productName) {}
    public String getAdditionalContent() {return additionalContent;}
    public void setAdditionalContent(String additionalContent) {}
}
