// hw8_7,
class CTest
{
   void test(int n)
   {
      System.out.print("n= "+n);

      if(n%2==1)
         System.out.println(", ���Ƭ��_��");
      else if(n==0)
         System.out.println(", ���Ƭ� 0");
      else
         System.out.println(", ���Ƭ�����");
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
n= 3, ���Ƭ��_��
n= 8, ���Ƭ�����
n= 0, ���Ƭ� 0
--------------*/