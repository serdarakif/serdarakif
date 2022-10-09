package javademos.arrays;


public class Main 
{
    public static void main(String[] args)
     {   
       String ogrenci1="Ahmet";
       String ogrenci2="mehmet";
       String ogrenci3="Veli";
       String ogrenci4="Hasan";

       System.out.println(ogrenci1);
       System.out.println(ogrenci2);
       System.out.println(ogrenci3);
       System.out.println(ogrenci4);

       System.out.println("---------------------");

       String [] ogrenci =new String [4];
       ogrenci[0]="hakan";
       ogrenci[1]="mutlu";
       ogrenci[2]="şenay";
       ogrenci[3]="sena";

       for ( int ogrenciler=0; ogrenci.length<0;ogrenciler++)
       {
        System.out.println(ogrenci[ogrenciler]);
       }



     }
        
    }
