package nombre;




import java.util.Scanner;
public class Nombre {
    
   public static void main(String[] args) {
       Scanner cl= new Scanner(System.in);
       
       int r;
       String rep=" ";
       
       System.out.print("entrer la valeur :");
       
       int value = Integer.parseInt(cl.nextLine()); 
       System.out.println();
         while (value !=0 ){
             r= value%2;
             rep+= r;
             value= value/2;
            
         }
         
          String reverse = new StringBuffer(rep).reverse().toString();
         System.out.println("la valeur en binaire est:"+ reverse);
         
   }
    
}

