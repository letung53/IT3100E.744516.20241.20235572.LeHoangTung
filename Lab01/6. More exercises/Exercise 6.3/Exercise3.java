import java.util.Scanner;

public class Exercise3 {
   public Exercise3() {
   }

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int limit = scanner.nextInt();
      for (int i=1; i <= limit; i++){
        
        for (int k = limit-i;k > 0; k--){
            System.out.print(" ");
        }
        
        for (int j=1;j <= 2*i-1;j++){
            
            System.out.print("*");
        }
        System.out.println();
      }
    
}}