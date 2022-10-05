package oopWithNlayeredApp.business;

import oopWithNlayeredApp.Access.HibernateProductDao;
import oopWithNlayeredApp.Access.JdbcProductDao;
import oopWithNlayeredApp.Access.ProductDao;
import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.entities.Product;

import java.util.List;

public class ProductMenager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductMenager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {  //Response request
        //İŞ kuralları
        if(product.getUnitPrice()<10){
            throw  new Exception("Ürün fiyatı 10 dan küçük olamaz....");
        }

        //JdbcProductDao productDao = new JdbcProductDao();
        //productDao.add(product);

        //İntarface ile kullanım
        //ProductDao productDao = new HibernateProductDao();
        //productDao.add(product);

        productDao.add(product);

        for (Logger logger: loggers) { //<db,mail>
            logger.log(product.getName());
        }
    }
}
