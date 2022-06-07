/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

/**
 *
 * @author phung
 */
public class Product {
    private int productID;
    private String productName;
    private double productPrice;
    private String productImg;
    private String productDes;
    private int cateID;
    private int cateID1;
    private int totalQuantity;
    private int discount;
    private Boolean inSale;
    private Boolean isActive;

    public Product() {
    }

    public Product(int productID, String productName, double productPrice, String productImg, String productDes, int cateID, int cateID1, int totalQuantity, int discount, Boolean inSale, Boolean isActive) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImg = productImg;
        this.productDes = productDes;
        this.cateID = cateID;
        this.cateID1 = cateID1;
        this.totalQuantity = totalQuantity;
        this.discount = discount;
        this.inSale = inSale;
        this.isActive = isActive;
    }
    
}
