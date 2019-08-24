package org.fastrackit;

//import java.text.SimpleDateFormat;
import java.util.Date;

//public class SimpleDateFormatExample {

    public class Foodforanimals {
        private String name;
        private double pricePerKg;
        private double quantity;
        private Date expirationDate ;
        /*SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        String strDate = formatter.format(Date);*/
        private Date manufacturingDate;
        private double quantiyAvailable;
        private String brand;
        private double contentProteinPerKg;
        private double contentFatPerKg;
        private double contentSweetPerKg;
        private double caloriesPerKg;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPricePerKg() {
            return pricePerKg;
        }

        public void setPricePerKg() {
            this.pricePerKg = pricePerKg;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity() {
            this.quantity = quantity;
        }

        public Date getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
        }

        public Date getManufacturingDate() {
            return manufacturingDate;
        }

        public void setManufacturingDate(Date manufacturingDate) {
            this.manufacturingDate = manufacturingDate;
        }

        public double getQuantiyAvailable() {
            return quantiyAvailable;
        }

        public void setQuantiyAvailable() {
            this.quantiyAvailable = quantiyAvailable;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public double getContentProteinPerKg() {
            return contentProteinPerKg;
        }

        public void setContentProteinPerKg(double contentProteinPerKg) {
            this.contentProteinPerKg = contentProteinPerKg;
        }

        public double getContentFatPerKg() {
            return contentFatPerKg;
        }

        public void setContentFatPerKg(double contentFatPerKg) {
            this.contentFatPerKg = contentFatPerKg;
        }

        public double getContentSweetPerKg() {
            return contentSweetPerKg;
        }

        public void setContentSweetPerKg(double contentSweetPerKg) {
            this.contentSweetPerKg = contentSweetPerKg;
        }

        public double getCaloriesPerKg() {
            return caloriesPerKg;
        }

        public void setCaloriesPerKg() {
            this.caloriesPerKg = caloriesPerKg;
        }

        // System.out.println(expirationDate);
        public Foodforanimals(double quantity, double pricePerKg, double caloriesPerKg) {
            //this.expirationDate = expirationDate;
            this.quantity = quantity;
            this.pricePerKg = pricePerKg;
            this.caloriesPerKg = caloriesPerKg;

        }

        public void setExpirationDate(int i, int i1, int i2, int i3, int i4, int i5) {
        }

        public void setManufacturingDate(int i, int i1, int i2, int i3, int i4, int i5) {
        }
    }
//}