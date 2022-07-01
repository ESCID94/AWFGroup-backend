package com.animalworldfarmsgroup.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product", nullable = false)
    private Long id_product;

    @Column(name = "category")
    private String category;

    @Column(name = "type")
    private String type;

    @Column(name = "id_provider")
    private Long id_provider;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return id_product != null && Objects.equals(id_product, product.id_product);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
