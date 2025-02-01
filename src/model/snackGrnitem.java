
package model;

import java.util.Date;

/**
 *
 * @author heshan Nawarathna
 */
public class snackGrnitem {
    
    private String productId;
    private String brand;
    private String productname;
    private String stockId;
    private double qty;
    private double buyingPrice;
    private double sellingPrice;
    private Date mfd;
    private Date exp;

    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

   
    public String getBrand() {
        return brand;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    public String getProductname() {
        return productname;
    }

   
    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getStockId() {
        return stockId;
    }

   
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

   
    public double getQty() {
        return qty;
    }

    
    public void setQty(double qty) {
        this.qty = qty;
    }

    
    
    public double getBuyingPrice() {
        return buyingPrice;
    }

    
    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    
    public double getSellingPrice() {
        return sellingPrice;
    }

 
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    
    public Date getMfd() {
        return mfd;
    }

    
    public void setMfd(Date mfd) {
        this.mfd = mfd;
    }

   
    public Date getExp() {
        return exp;
    }

    
    public void setExp(Date exp) {
        this.exp = exp;
    }
    
}
