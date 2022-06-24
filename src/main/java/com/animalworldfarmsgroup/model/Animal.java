package com.animalworldfarmsgroup.model;

import lombok.*;
import org.apache.tomcat.jni.Local;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_animal", nullable = false)
    private Long id_animal;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "breed", nullable = false)
    private String breed;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "weight", nullable = false)
    private BigDecimal weight;

    @Column(name = "lot", nullable = false)
    private int lot;

    @Column(name = "id_sector", nullable = false)
    private long id_sector;

    @Column(name = "id_farm", nullable = false)
    private long id_farm;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birth_date;

    @Column(name = "deceased_date")
    private LocalDate deceased_date;

    @Column(name = "sale_date")
    private LocalDate sale_date;

    @Column(name = "sold_date")
    private LocalDate sold_date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Animal animal = (Animal) o;
        return id_animal != null && Objects.equals(id_animal, animal.id_animal);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
