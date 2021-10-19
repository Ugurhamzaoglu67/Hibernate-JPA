package com.ugurhmz.product.model;


import com.ugurhmz.product.model.enums.EnumProductType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name="TABLE_PRODUCT_TYPE")
public class ProductType {

    @Id
    @SequenceGenerator(name="product_type",sequenceName="product_type_seq_id", allocationSize = 1)
    @GeneratedValue(generator = "product_type", strategy = GenerationType.SEQUENCE)
    private Long id;


    @Column(name="NAME", length=200)
    private String name;


    @Enumerated(value=EnumType.STRING)
    @Column(name="type",length = 50)
    private EnumProductType enumProductType;


    @OneToMany(mappedBy = "productType",cascade = CascadeType.ALL)
    private Set<Product> productList = new HashSet<>();
}
