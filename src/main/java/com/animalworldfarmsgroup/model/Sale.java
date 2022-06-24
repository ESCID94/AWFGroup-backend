package com.animalworldfarmsgroup.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sale", nullable = false)
    private Long id_sale;

    @Column(name = "id_animal", nullable = false)
    private Long id_animal;

    @Column(name = "id_buyer", nullable = false)
    private Long id_buyer;

    // Quantity equals the ratio price for a kilogram the buyer bought the animal
    @Column(name = "quantity", nullable = false)
    private int quantity;

    // total price for the sale of the animal
    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "sale_date")
    private LocalDate sale_date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Sale sale = (Sale) o;
        return id_sale != null && Objects.equals(id_sale, sale.id_sale);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
