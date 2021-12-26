// hw14_4,
import java.io.*;
public class hw14_4
{
   public static void main(String args[]) throws IOException
   {
      char data[]=new char[128];
      FileReader fr=new FileReader("c:\\Java\\donkey.txt");

      int num=fr.read(data);
      String str=new String(data,0,num);
      System.out.println("Characters read= "+num);
      System.out.println(str);

      fr.close();
   }
}

/* output-------------------
Characters read= 30
我有一隻小毛驢
我從來也不騎
有一天我心血來潮騎著去趕集
--------------------------*/