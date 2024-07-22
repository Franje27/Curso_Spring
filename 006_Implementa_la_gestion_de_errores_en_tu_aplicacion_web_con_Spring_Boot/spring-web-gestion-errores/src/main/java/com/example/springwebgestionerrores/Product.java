package com.example.springwebgestionerrores;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Product {

    private Long id;

    @Size(min = 10, max = 100)
    @NotNull(message = "Titulo producto no puede ser nulo")
    private String title;

    @DateTimeFormat (pattern = "yyy-MM-dd")
    private LocalDate released;

    @Min(value = 5)
    private Double price;

    public Product() {
    }

    public Product(String title, Long id, LocalDate released, Double price) {
        this.title = title;
        this.id = id;
        this.released = released;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @Size(min = 10, max = 100) @NotNull(message = "Titulo producto no puede ser nulo") String getTitle() {
        return title;
    }

    public void setTitle(@Size(min = 10, max = 100) @NotNull(message = "Titulo producto no puede ser nulo") String title) {
        this.title = title;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public @Min(value = 5) Double getPrice() {
        return price;
    }

    public void setPrice(@Min(value = 5) Double price) {
        this.price = price;
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
