package javaDemos2.classes;

public class Main 
{
    public static void main(String[] args)
    {   
      CustomerManager customerManager=new CustomerManager();
      customerManager.add();
      customerManager.delete();
      customerManager.update();
       
       //System.out.println(toplam);

       int sayi1=45;
       int sayi2=100;
       sayi2=sayi1;
       sayi1=200;
       System.out.println(sayi2);

       int [] sayilar1=new int[]{1,5,7,9};
       int [] sayilar2=new int[]{2,4,5,8};
       sayilar2=sayilar1;
       sayilar1[0]=500;
       System.out.println(sayilar2[0]);     

     
    }
  }
       
    

       
    
