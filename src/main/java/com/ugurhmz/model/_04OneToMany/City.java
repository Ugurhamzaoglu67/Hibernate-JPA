package com.ugurhmz.model._04OneToMany;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Setter
@Getter
@Table(name="T_CITY")
public class City {


    @Id
    @SequenceGenerator(name="city", sequenceName="city_seq_id", allocationSize = 1)
    @GeneratedValue(generator="city",strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;



    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Country  country;

}
