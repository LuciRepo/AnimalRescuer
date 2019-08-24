package org.fastrackit;

//import java.text.SimpleDateFormat;
import java.util.Date;

//public class SimpleDateFormatExample {

    public class Foodforanimals {
        String name;
        double pricePerKg;
        double quantity;
        Date expirationDate ;
        /*SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        String strDate = formatter.format(Date);*/
        Date manufacturingDate;
        double quantiyAvailable;
        String brand;
        double contentProteinPerKg;
        double contentFatPerKg;
        double contentSweetPerKg;
        double caloriesPerKg;

        // System.out.println(expirationDate);
        public Foodforanimals(double quantity, double pricePerKg, double caloriesPerKg) {
            //this.expirationDate = expirationDate;
            this.quantity = quantity;
            this.pricePerKg = pricePerKg;
            this.caloriesPerKg = caloriesPerKg;

        }
    }
//}