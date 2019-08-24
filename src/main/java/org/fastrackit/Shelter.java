package org.fastrackit;

public class Shelter {
    private String name;
    private String address;
    private int sizeSm;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public int getSizeSm() {
        return sizeSm;
    }

    public void setSizeSm() {
        this.sizeSm = sizeSm;
    }

    public Shelter (String name, String address, int sizeSm){
        this.name=name;
        this.address=address;
        this.sizeSm=sizeSm;
    }
}
