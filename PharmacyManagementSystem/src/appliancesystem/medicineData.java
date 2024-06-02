package appliancesystem;

import java.sql.Date;


public class medicineData {
    
    private Integer applianceId;
    private String brand;
    private String productName;
    private String status;
    private Double power;
    private Date date;
    private String image;
    // MAKE SURE YOU  WILL FOLLOW THESE DATA TYPES
    public medicineData(Integer applianceId, String brand ,String productName,
                        String status, Double power, String image, Date date){
        this.applianceId = applianceId;
        this.brand = brand;
        this.productName = productName;
        this.status = status;
        this.power = power;
        this.date = date;
        this.image = image;
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
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return power;
    }

    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }
    
}
