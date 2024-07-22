package com.example.springrestgestionerrores.model;


import java.time.LocalDate;

public class Product {


    private Long id;
    private String title;
    private LocalDate released;
    private Double price;
    private Manufacturer manufacturer;

    public Product() {
    }

    public Product(Long id, String title, LocalDate released, Double price, Manufacturer manufacturer) {
        this.id = id;
        this.title = title;
        this.released = released;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", released=" + released +
                ", price=" + price +
                '}';
    }


}
