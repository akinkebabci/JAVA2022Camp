public class Main {
    public static void main(String[] args) {
        //set value      Setter=Yazmak         Getter = Okumak
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("Jpeg1.jpg");
        //get
        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Kool Kahve Makinesi");
        product2.setDiscount(5);
        product2.setUnitPrice(4500);
        product2.setUnitsInStock(2);
        product2.setImageUrl("Jpeg2.jpg");


        Product product3 = new Product();
        product3.setName("Smeg Kahve Makinesi");
        product3.setDiscount(4);
        product3.setUnitPrice(6500);
        product3.setUnitsInStock(9);
        product3.setImageUrl("Jpeg3.jpg");



        //Product array oluşturup içine oluşturduğumuz field leri gönderiyoruz
        Product[] products = new Product[]{product1, product2, product3};
        System.out.println();
        for (Product product : products) {
            System.out.println(product.getName()+ " " + product.getUnitPrice()+ " " + product.getDiscount());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("55566655522");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Akın");
        individualCustomer.setLastName("Kebabcı");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(3);
        corporateCustomer.setCompanyName("Hassan Gıda");
        corporateCustomer.setCustomerNumber("85");
        corporateCustomer.setTextNumber("54885221");
        corporateCustomer.setPhoneNumber("555588855522");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}