package OOP1;

import java.util.jar.Attributes.Name;

public class Main {
    public static void main(String[] args)
     {
      
      IndividualCostumer individualCostumer=new IndividualCostumer();
      individualCostumer.setId(1);
      individualCostumer.setCustomerNumber("1234");
      individualCostumer.setPhone("34325252");
      individualCostumer.setFirstName("Engin");
      individualCostumer.setLastName("Özalan");

      CorporateCustomer corporateCustomer=new CorporateCustomer();
      corporateCustomer.setId(11);
      corporateCustomer.setPhone("32323234");
      corporateCustomer.setTaxNumber("345447744564");
      corporateCustomer.setCompanyName("ÖZALAN");

      Customer[] customers = {individualCostumer,corporateCustomer};
      System.out.println(customers);

      
      //   Product product=new Product();
      //   product.setName("serdar");
      //   product.setUnitPrice(7500.00);
      //   product.setDiscount(7.5);
      //   product.setUnitInStock(30);
      //   product.setImageUrl("bilmemne.jpg");

        
      //   //System.out.println(product.name);



     }


        
    }
