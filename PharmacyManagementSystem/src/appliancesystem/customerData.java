package appliancesystem;

import java.sql.Date;


public class customerData {
    
    private Integer customerId;
    private Integer applianceId;
    private String brand;
    private String productName;
    private Integer quantity;
    private Double power;
    private Date date;
    
    public customerData(Integer customerId, Integer applianceId
            , String brand, String productName, Integer quantity, Double power, Date date){
        this.customerId = customerId;
        this.applianceId = applianceId;
        this.brand = brand;
        this.productName = productName;
        this.quantity = quantity;
        this.power = power;
        this.date = date;
    }
    
    public Integer getCustomerId(){
        return customerId;
    }
    public Integer getMedicineId(){
        return applianceId;
    }
    public String getBrand(){
        return brand;
    }
    public String getProductName(){
        return productName;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public Double getPrice(){
        return power;
    }
    public Date getDate(){
        return date;
    }
    
}
