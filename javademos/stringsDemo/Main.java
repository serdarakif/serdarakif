package javademos.stringsDemo;


public class Main 
{
    public static void main(String[] args)
     {   
       String mesaj="Bugün hava çok güzel";

        System.out.println(mesaj);
        System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın "));
        System.out.println(mesaj.replace(" ","-"));
        
     }
        
    }
