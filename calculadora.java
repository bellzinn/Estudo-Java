//Calculadora em Java usando os argumentos definidos pelo usuario a partir da linha de comando.


public class calculadora{
    
    //functions:
     
    static void Sum(int x,int y) {
         System.out.println(" ");
         System.out.println("O resultado da soma e: " + (x + y));
     }
 
     static void Minus(int x,int y) {
         System.out.println(" ");
         System.out.println("O resultado da subtracao e: " + (x - y));
     }
 
     static void Mult(int x,int y) {
         System.out.println(" ");
         System.out.println("O resultado da multiplicacao e: " + (x * y));
     }
 
     static void Div(int x,int y) {
         System.out.println(" ");
         System.out.println("O resultado da divisao e: " + (x / y));
     }
  
     
     //Start:
     public static void main(String[] args){
         int x = Integer.parseInt(args[1]);
         int y = Integer.parseInt(args[2]);
        
         if(args[0].equals("somar")) {
             Sum(x,y);
 
         }else if(args[0].equals("subtrair")){
             Minus(x,y);
 
         }else if(args[0].equals("multiplicar")){
             Mult(x,y);
 
         }else if(args[0].equals("dividir")){
             Div(x,y);
 
         }else{
             System.out.println("Nenhum comando valido");
 
         }
     }
 
     
 }