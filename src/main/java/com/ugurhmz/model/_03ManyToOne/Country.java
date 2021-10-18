package com.ugurhmz.model._03ManyToOne;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name="T_COUNTRY")
public class Country {


    @Id
    @SequenceGenerator(name="country", sequenceName="country_seq_id",allocationSize = 1)
    @GeneratedValue(generator = "country", strategy = GenerationType.SEQUENCE)
    private  Long id;

    private String name;

}
