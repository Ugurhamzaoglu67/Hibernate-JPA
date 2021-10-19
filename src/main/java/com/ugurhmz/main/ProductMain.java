package com.ugurhmz.main;


import com.ugurhmz.model._04OneToMany.City;
import com.ugurhmz.model._04OneToMany.Country;
import com.ugurhmz.product.model.Product;
import com.ugurhmz.product.model.ProductType;
import com.ugurhmz.product.model.enums.EnumProductType;
import com.ugurhmz.product.model.enums.EnumUnit;
import com.ugurhmz.product.service.ProductTypeService;
import com.ugurhmz.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {

/*
        Product product = new Product();
        product.setName("Bira");
        product.setPrice(new BigDecimal("2.5"));
        product.setExpirationDate(new Date());
        product.setStockUnit(EnumUnit.TOTAL);
        product.setAmountOfStock(170L);



        ProductType productType1 = new ProductType();
        productType1.setEnumProductType(EnumProductType.DRINK);
        productType1.setName("Icecek");
        productType1.getProductList().add(product);

        product.setProductType(productType1);


        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(product);
        session.merge(productType1);

        transaction.commit();
*/

        ProductTypeService productTypeService = new ProductTypeService();

        List<ProductType> productTypeList = productTypeService.findAll();

        for (ProductType productType : productTypeList) {
            System.out.println(productType.getName());
        }

    }
}
