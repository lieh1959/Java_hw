// hw8_16,
class CSphere
{
   private int x;          // 圓心的x座標
   private int y;          // 圓心的y座標
   private int z;          // 圓心的z座標
   private int radius;    // 圓球的半徑

   void setLocation(int a,int b,int c) // 設定圓心的位置
   {
      x=a;
      y=b;
      z=c;
   }
   void setRadius(int r)   // 設定半徑
   {
      radius=r;
   }
   double surfaceArea()    // 傳回表面積
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