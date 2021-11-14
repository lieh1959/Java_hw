// hw8_7,
class CTest
{
   void test(int n)
   {
      System.out.print("n= "+n);

      if(n%2==1)
         System.out.println(", 计计");
      else if(n==0)
         System.out.println(", 计 0");
      else
         System.out.println(", 计案计");
   }
}

public class hw8_7
{
   public static void main(String args[])
   {
      CTest t=new CTest();

      t.test(3);
      t.test(8);
      t.test(0);
   }
}

/* output-------
n= 3, 计计
n= 8, 计案计
n= 0, 计 0
--------------*/