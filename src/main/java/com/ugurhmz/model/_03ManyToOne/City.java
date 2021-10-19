package com.ugurhmz.model._03ManyToOne;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table( name="T_CITY",
        indexes = {
                @Index(name = "IX_CITY_NAME_ID", columnList = "NAME, ID"),
                @Index(name = "IX_CITY_COUNTRY", columnList = "ID_CITY")
        }
)

public class City {




    @Id
    @SequenceGenerator(name="city", sequenceName="city_seq_id", allocationSize=1)
    @GeneratedValue(generator = "city", strategy = GenerationType.SEQUENCE)
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;


    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name="ID_CITY",
            foreignKey = @ForeignKey(
                    name = "FK_CITY_COUNTRY",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private Country country;

}
