// hw8_12, 視窗類別
class CWin
{
   int width;
   int height;
   String name;

   void setW(int w)  // 設定寬度的method
   {
      width=w;
   }
   void setH(int h)  // 設定高度的method
   {
      height=h;
   }
   void setName(String s)// 設定視窗名稱的method
   {
      name=s;
   }
   void show()
   {
      System.out.println("Name="+name);
      System.out.println("W="+width+", H="+height);
   }
   void setWindows(int w,int h)
   {
      width=w;
      height=h;
   }
   void setWindows(int w,int h,String s)
   {
      width=w;
      height=h;
      name=s;
   }
}

public class hw8_12
{
   public static void main(String args[])
   {
      CWin cw=new CWin();
      cw.setName("1st Windows");
      cw.setW(5);
      cw.setH(3);
      cw.show();

      cw.setName("2nd Windows");
      cw.setWindows(6,8);
      cw.show();

      cw.setWindows(4,2,"3rd Windows");
      cw.show();
   }
}

/* output---------------
Name=1st Windows
W=5, H=3
Name=2nd Windows
W=6, H=8
Name=3rd Windows
W=4, H=2
----------------------*/