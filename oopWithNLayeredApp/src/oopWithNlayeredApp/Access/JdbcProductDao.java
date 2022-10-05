package oopWithNlayeredApp.Access;

import oopWithNlayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //Sadece Ve Db Erişim Kodları Buraya Yzılır/Sql Bilmek Gerekir
        System.out.println("JDBC İle Veri Tabınana Eklendi...");
    }
}


//Hibernate geçmek istedik