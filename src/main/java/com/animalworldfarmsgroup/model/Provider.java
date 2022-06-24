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
@Table(name = "provider")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provider", nullable = false)
    private Long id_provider;

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
        Provider provider = (Provider) o;
        return id_provider != null && Objects.equals(id_provider, provider.id_provider);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
