package com.ugurhmz.model._01OneToOne;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="T_FINGER_PRINT")
public class FingerPrint {

    @Id
    @SequenceGenerator(
            name="finger_print",
            sequenceName="finger_print_seq_id",allocationSize = 1)
    @GeneratedValue(
            generator="finger_print",
            strategy= GenerationType.SEQUENCE)
    private Long id;

    @Column(name="file_name")
    private String fileName;


    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            optional = false    //Arada bir ilişki kurulması zorunlu oluyor bu şekilde.
    )
    private Person person;
}
