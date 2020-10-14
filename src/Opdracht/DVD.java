
package Opdracht;

import java.util.HashMap;
import java.util.Map;

public class DVD {

    private String nameClient;
    private String nameDVD;
    private Double price;
    private boolean discount;
    private String genreDVD;
    private String date;

    public DVD(String nameClient, String nameDVD, Double price, String date, boolean discount, String genreDVD) {
        this.nameClient = nameClient;
        this.nameDVD = nameDVD;
        this.price = price;
        this.date = date;
        this.discount = discount;
        this.genreDVD = genreDVD;
    }

    public String getGenreDVD() {
        return genreDVD;
    }

    public void setGenreDVD(String genreDVD) {
        this.genreDVD = genreDVD;
    }

    public String getNameClient() {
        return nameClient;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNameDVD() {
        return nameDVD;
    }

    public void setNameDVD(String nameDVD) {
        this.nameDVD = nameDVD;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInformationDVD() {

        String videotheekTicket = " -> ";
        String spaties = " - ";
        Double discountprice;
        Double newPrice = null;
        String genresOpTicket = "";
        Double roundedTest = price;



        if (nameClient == "") {
            return "Cancellation ticket";
        }
        if (nameDVD == "") {
            return "Cancellation ticket";
        }
        if (price == null) {
            return "Cancellation ticket";
        }
        if (discount == true) {
            discountprice = price*0.2;
            newPrice = price -discountprice;
        }
        if (date == "") {
            return "Cancellation ticket";
        }
        if (discount == true) {
            discountprice = price*0.2;
            newPrice = price - discountprice;
        }
        if(discount == false){
            newPrice = price;
        }
        if(this.genreDVD.equals("A")){
            genresOpTicket = "action";
        }
        if(this.genreDVD.equals("C")){
            genresOpTicket = "comedy";
        }
        if(this.genreDVD.equals("H")){
            genresOpTicket = "horror";
        }
        if(this.genreDVD.equals("AD")){
            genresOpTicket = "adventure";
        }
        if(this.genreDVD.equals("F")){
            genresOpTicket = "fantasy";
        }
        if(this.genreDVD.equals("SF")){
            genresOpTicket = "science fiction";
        }


        return videotheekTicket += nameClient + spaties + nameDVD + spaties + genresOpTicket + spaties + "discount " + discount + spaties + newPrice + spaties + date;

    }




}


