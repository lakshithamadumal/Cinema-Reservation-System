/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class GrnItem {
    
    private String MRNId;
    private String supplierMobile;
    private String Movie;
    private double buyingprice;

    /**
     * @return the MRNId
     */
    public String getMRNId() {
        return MRNId;
    }

    /**
     * @param MRNId the MRNId to set
     */
    public void setMRNId(String MRNId) {
        this.MRNId = MRNId;
    }

    /**
     * @return the supplierMobile
     */
    public String getSupplierMobile() {
        return supplierMobile;
    }

    /**
     * @param supplierMobile the supplierMobile to set
     */
    public void setSupplierMobile(String supplierMobile) {
        this.supplierMobile = supplierMobile;
    }

    /**
     * @return the Movie
     */
    public String getMovie() {
        return Movie;
    }

    /**
     * @param Movie the Movie to set
     */
    public void setMovie(String Movie) {
        this.Movie = Movie;
    }

    /**
     * @return the buyingprice
     */
    public double getBuyingprice() {
        return buyingprice;
    }

    /**
     * @param buyingprice the buyingprice to set
     */
    public void setBuyingprice(double buyingprice) {
        this.buyingprice = buyingprice;
    }
    
    
}
