package oopWithNlayeredApp.Access;

import oopWithNlayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //Sadece Ve Db Erişim Kodları Buraya Yzılır/Sql Bilmek Gerekir
        System.out.println("HiberNate İle Veri Tabınana Eklendi...");
    }
}
