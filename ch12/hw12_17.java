// hw12_17,
public class hw12_17
{
   public static void main(String args[])
   {
     String str="262904713";
     short num;
     num=Short.parseShort(str);
     System.out.println(num+"*2="+num*2);
   }
}

/* output---------------------------------------------------------------------------------------------------
Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"262904713" Radix:10
   at java.lang.Short.parseShort(Short.java:119)
   at java.lang.Short.parseShort(Short.java:143)
   at hw12_17.main(hw12_17.java:8)
-----------------------------------------------------------------------------------------------------------*/