package com.ugurhmz.product.service;


import com.ugurhmz.product.dao.ProductDAO;
import com.ugurhmz.product.model.ProductType;

import java.util.List;


public class ProductService {

    private ProductDAO productDAO;


    // Ben bu servicede her zaman ProductTypeDAO ulaşcağım için -> Constructor içinde oluşturup hep bunu kullanırım.
    public ProductService(){
        productDAO = new ProductDAO();
    }



}
