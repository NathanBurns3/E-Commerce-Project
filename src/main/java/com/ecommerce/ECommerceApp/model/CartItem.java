package com.ecommerce.ECommerceApp.model;

public interface CartItem {
    int getProductID();
    void setProductID(int productID);
    
    int getQuantity();
    void setQuantity(int quantity);
    
    double getPrice();
    void setPrice(double price);
}
