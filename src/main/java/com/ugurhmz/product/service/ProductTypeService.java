package com.ugurhmz.product.service;


import com.ugurhmz.product.dao.ProductTypeDAO;
import com.ugurhmz.product.model.ProductType;

import java.util.List;

public class ProductTypeService {

    private ProductTypeDAO productTypeDAO;


    // Ben bu servicede her zaman ProductTypeDAO ulaşcağım için -> Constructor içinde oluşturup hep bunu kullanırım.
    public ProductTypeService(){
       productTypeDAO = new ProductTypeDAO();
    }




    // LIST PRODUCT TYPE
    public List<ProductType> findAll() {
        return productTypeDAO.findAll();
    }

}
