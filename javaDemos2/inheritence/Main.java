package javaDemos2.inheritence;
public class Main 
{
    public static void main(String[] args)
    {   
      Customer customer=new Customer();
      Employee employee=new Employee();

      customer.age=19;
       String tanim=employee.firstName="Serdar Akif";
            
       System.out.println(tanim);

       CustomerManager customerManager=new CustomerManager();
       customerManager.Add();
       
    }

    
  }
       
    

       
    
