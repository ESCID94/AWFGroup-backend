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
@Table(name = "buyer")
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_buyer", nullable = false)
    private Long id_buyer;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "CIF")
    private String CIF;

    @Column(name = "NIF")
    private String NIF;

    @Column(name = "category")
    private String category;

    @Column(name = "id_contact")
    private int id_contact;

    @Column(name = "country")
    private String country;

    @Column(name = "since_date")
    private LocalDate since_date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Buyer buyer = (Buyer) o;
        return id_buyer != null && Objects.equals(id_buyer, buyer.id_buyer);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
