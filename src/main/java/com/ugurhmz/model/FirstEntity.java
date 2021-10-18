package com.ugurhmz.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="FIRST_ENTITY")
@Getter
@Setter
public class FirstEntity {

    @Id
    @SequenceGenerator(name="seq", sequenceName="FIRST_TABLE_SEQ_ID", initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    private Long id;
}
