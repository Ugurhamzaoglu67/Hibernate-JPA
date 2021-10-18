package com.ugurhmz.model._03ManyToOne;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="T_CITY")
public class City {




    @Id
    @SequenceGenerator(name="city", sequenceName="city_seq_id", allocationSize=1)
    @GeneratedValue(generator = "city", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;


    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Country country;

}
