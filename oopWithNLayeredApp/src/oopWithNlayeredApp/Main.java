package oopWithNlayeredApp;

import oopWithNlayeredApp.Access.HibernateProductDao;
import oopWithNlayeredApp.business.ProductMenager;
import oopWithNlayeredApp.core.logging.DatabaseLogger;
import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.core.logging.MailLogger;
import oopWithNlayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"IPhone 11",15000);
        Logger[] loggers = {new DatabaseLogger(),new MailLogger()};
        //New Bağımlılığı
        //HibernateProductDao productMenager = new HibernateProductDao();
        //productMenager.add(product1);

        //İnterface bagımlı olmamak
        ProductMenager productMenager1 = new ProductMenager(new HibernateProductDao(),loggers);
        productMenager1.add(product1);
    }
}