// hw8_16,
class CSphere
{
   private int x;          // ��ߪ�x�y��
   private int y;          // ��ߪ�y�y��
   private int z;          // ��ߪ�z�y��
   private int radius;    // ��y���b�|

   void setLocation(int a,int b,int c) // �]�w��ߪ���m
   {
      x=a;
      y=b;
      z=c;
   }
   void setRadius(int r)   // �]�w�b�|
   {
      radius=r;
   }
   double surfaceArea()    // �Ǧ^���n
   {
      return 4*3.14*radius*radius*radius;
   }
   double volume()
   {
      return ((double)(3.0/4)*3.14*radius*radius*radius);
   }
   void showCenter()
   {
      System.out.println("x="+x+", y="+y+", z="+z);
   }
}

public class hw8_16
{
   public static void main(String args[])
   {
      CSphere cs=new CSphere();

      cs.setLocation(3,4,5);
      cs.setRadius(1);
      cs.showCenter();
      System.out.println("surface area="+cs.surfaceArea());
      System.out.println("volume="+cs.volume());
   }
}

/* output-------------
x=3, y=4, z=5
surface area=12.56
volume=2.355
--------------------*/