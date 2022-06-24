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
@Table(name = "farm")
public class Farm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_farm", nullable = false)
    private Long id_farm;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "farm_size")
    private int farm_size;

    @Column(name = "total_sectors")
    private String total_sectors;

    @Column(name = "creation_date", nullable = false)
    private LocalDate creation_date;

    @Column(name = "deactivated_date")
    private LocalDate deactivated_date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Farm farm = (Farm) o;
        return id_farm != null && Objects.equals(id_farm, farm.id_farm);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
