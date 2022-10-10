package javaDemos2.methods2;

public class Main 
{
    public static void main(String[] args)
    {   
       String mesaj="Bugün hava güzel";
       String yeniMesaj=sehirVer();
       int sayi=topla(5,9);
       System.out.println(sayi);
       int toplam=topla2(3,6,9,4,2);
       System.out.println(toplam);
       System.out.println(mesaj);
       System.out.println(yeniMesaj);
    }

    public static void ekle()
    {
      System.out.println("Eklendi");
    }
    public static String sehirVer()
    {
      return "Ankara"; 
    } 

   public static int  topla(int sayi1, int sayi2)
    {
      return sayi1+sayi2; 
    } 
    public static int topla2(int... sayilar)
    {
      int toplam=0;
      for (int  toplamSay:sayilar)
      {
        toplam =toplamSay+toplam;
      }
      return toplam;
    }
  }
       
    

       
    
