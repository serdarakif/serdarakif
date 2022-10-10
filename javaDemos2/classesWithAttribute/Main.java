package javaDemos2.classesWithAttribute;

public class Main 
{
    public static void main(String[] args)
    {      
      Product product=new Product();

      product.setId(1);
      product.setName("Laptop");
      product.setDescription("Asus");
      product.setPrice(500);
      product.setStockAmount(200);
      System.out.println(product.getCode());     

      ProductManager  productManager=new ProductManager();
      productManager.Add(product);
      
     
    }
  }
       
    

       
    
