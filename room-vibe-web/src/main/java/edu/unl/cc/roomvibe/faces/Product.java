package edu.unl.cc.roomvibe.faces;

public class Product {
    
    private String name;
    private String image;
    private double price;
    private String inventoryStatus;

    public Product(String name, String image, double price, String inventoryStatus) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.inventoryStatus = inventoryStatus;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }
}
