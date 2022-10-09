package javademos.recapDemo2;


public class Main 
{
    public static void main(String[] args)
     {   
       int[] myList={2,5,98,45,67};
       int total=0;
       int max=myList[0];

       for (int i: myList)
       {
        if (max<i)
        {
          max=i;
        }
          total=total +i;
          System.out.println(i);

        }
        System.out.println("Toplam : "+ total);
        System.out.println("En Büyük sayi : "+ max);
     }
        
    }
