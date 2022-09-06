import java.util.Scanner;
public class Main { 
 public static void main(String[] args){ 
   Scanner my=new Scanner(System.in);
  int i,num=0,even=0,odd=0;

   for(i=1;i<=5;i++){
     System.out.println("Enter number:"+i);
      num=my.nextInt();
 }
   if(num%2==0){
     even++;
   }
   else{
     odd++;
   }
   
     System.out.println("odd numbers:"+odd);
   System.out.println("even numbers:"+even);
   
 
 } 
}
