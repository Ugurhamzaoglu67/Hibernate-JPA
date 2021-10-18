package com.ugurhmz.model._01OneToOne;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="T_PERSON")
public class Person {


    @Id
    @SequenceGenerator(
            name="person",sequenceName="person_seq_id")
    @GeneratedValue(
            generator = "person",
            strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="name", length=100)
    private String name;



    @OneToOne(
            fetch = FetchType.LAZY,
            optional = false,
            mappedBy = "person" // mappedBy -> Olan field tabloda sütun oluşturmaz.
    )
    private FingerPrint fingerPrint  ;

}
