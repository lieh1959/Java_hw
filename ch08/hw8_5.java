// hw8_5,
class CBox
{
   int length;
   int width;
   int height;

   int volume()
   {
      return length*width*height;
   }
   int surfaceArea()
   {
      return 2*((length*width)+(width*height)+(length*height));
   }
   void showData()
   {
      System.out.println("length="+length);
      System.out.println("width="+width);
      System.out.println("height="+height);
   }
   void showAll()
   {
      showData();
      System.out.println("surface area="+surfaceArea());
      System.out.println("volume="+volume());
   }
}

public class hw8_5
{
   public static void main(String args[])
   {
      CBox box;
      box=new CBox();

      box.length=3;
      box.width=6;
      box.height=9;

      box.showAll();
   }
}

/* output----------------
length=3
width=6
height=9
surface area=198
volume=162
-----------------------*/