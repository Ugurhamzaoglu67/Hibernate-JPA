package com.ugurhmz.product.model;


import com.ugurhmz.product.model.enums.EnumUnit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(
        name="PRODUCT",
        indexes =  @Index(name="IX_PRODUCT_PRODUCT_TYPE",columnList="ID_PRODUCT_TYPE")
)
public class Product {


    @Id
    @SequenceGenerator(name="product", sequenceName = "PRODUCT_SEQ_ID", allocationSize = 1)
    @GeneratedValue(generator = "product", strategy = GenerationType.SEQUENCE)
    private Long id;


    @Column(name="NAME", length = 100)
    private String name;


    @Column(name="PRICE", precision = 15, scale = 2)
    private BigDecimal price;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EXPIRATION_DATE")
    private Date expirationDate;


    @ManyToOne( fetch =  FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="ID_PRODUCT_TYPE", foreignKey = @ForeignKey(name = "FK_PRODUCT_TYPE"))
    private ProductType productType;


    @Column(name="amount_of_stock")
    private Long amountOfStock;



    @Enumerated(value=EnumType.STRING)
    @Column(name="stock_unit", length=50)
    private EnumUnit stockUnit;

}












