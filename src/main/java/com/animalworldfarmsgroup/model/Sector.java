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
@Table(name = "sector")
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sector", nullable = false)
    private Long id_sector;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type_animals")
    private String type_animals;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "id_farm")
    private Long id_farm;

    @Column(name = "id_employee")
    private Long id_employee;

    @Column(name = "creation_date", nullable = false)
    private LocalDate creation_date;

    @Column(name = "deactivated_date")
    private LocalDate deactivated_date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Sector sector = (Sector) o;
        return id_sector != null && Objects.equals(id_sector, sector.id_sector);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
