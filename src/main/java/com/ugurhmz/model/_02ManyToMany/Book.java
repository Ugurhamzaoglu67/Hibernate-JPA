package com.ugurhmz.model._02ManyToMany;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name="T_BOOK")
public class Book {


    @Id
    @SequenceGenerator(name="book",
            sequenceName="book_seq_id",
            allocationSize = 1)
    @GeneratedValue(generator="book",
            strategy = GenerationType.SEQUENCE)
    private Long id;


    private String name;


    // BOOK - AUTHOR TABLOSU OLUŞUR AYRICA (ARA TABLO)
    @ManyToMany(
            cascade =  CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Set<Author> authorSet = new HashSet<>();
}
