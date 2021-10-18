package com.ugurhmz.model._02ManyToMany;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="T_AUTHOR")
public class Author {

    @Id
    @SequenceGenerator(name="author",
            sequenceName = "seq_author_id",
            allocationSize = 1)

    @GeneratedValue(generator="author",
            strategy = GenerationType.SEQUENCE)
    private Long id;


    private String name;


    // AUTHOR - BOOK TABLOSU OLUŞMAZ, ÇÜNKÜ mappedBy dedik.
    @ManyToMany(
            cascade= CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy="authorSet"
    )
    private Set<Book> bookSet = new HashSet<>();

}
