package org.fastrackit;

public class Store extends Shelter {
    //String name;
    //String adress;
    private String manager;

    public String getManager() {
        return manager;
    }

    public void setManager() {
        this.manager = manager;
    }

    public Store(String name, String address, int sizeSm, String manager) {
        super(name, address, sizeSm);
        if (sizeSm > 1000) {
            System.out.println("This is such a big store");
        }
        this.manager = manager;
    }
}
