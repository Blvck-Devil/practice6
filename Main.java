import java.util.*;
public class Main{

     public static void main(String []args){
         int r=1,w,ocount=0,ecount=0;
         Scanner myScanner=new Scanner(System.in);
         while(r<=6){
             System.out.println("enter no"+r+":");
             w=myScanner.nextInt();
             
             if (w%2==0)
             {
                 ecount++;
             }else
             ocount++;
             r++;
         }
      System.out.println("Total odd numbers:"+ocount);
      System.out.println("Total even numbers:"+ecount);
     }
}