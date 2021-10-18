package com.ugurhmz.model._04OneToMany;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@Entity
@Table(name="T_COUNTRY")
public class Country {



    @Id
    @SequenceGenerator(name="country",sequenceName="country_seq_id",allocationSize = 1)
    @GeneratedValue(generator="country", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;


    // Db'de artı bir tablo olmasını
    // istemiyoruz bundan mappedBy kullanıyorum.
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy="country"
    )
    private Set<City> cityList = new HashSet<>();
}
