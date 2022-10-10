package javaDemos2.methods;

public class Main 
{
    public static void main(String[] args)
     {   
       sayiBulmaca();
    }
    public static void sayiBulmaca()
    {
      int[] myList={2,5,98,45,67};
      int aranacak=55;
      boolean varMi=false;

      for (int sayi:myList)
      {        
       if (sayi==aranacak)
       {
         varMi=true;
         break;
       }
     }
     String mesaj="";

       if (varMi)
       {
        mesaj="sayı mevcuttur :" + aranacak;
         mesajVer(mesaj);
       }
       else{
         System.out.println("sayı yoktur");
       } 
      }
       public static void mesajVer(String mesaj)
       {
        System.out.println(mesaj);
       }

       }
        
    
