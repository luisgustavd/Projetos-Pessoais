// CALCULADORA BÁSICA PARA OPERAÇÕES 
// LUIS GUSTAVO DINIZ PEREIRA 

// importando bibliotecas 
import java.util.Scanner;

public class Calculadora {
    int respota;
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in); // denominando um objeto para receber a entrada de dados
        double n1,n2;
       System.out.println("Digite o Nº 1:");
       n1 = in.nextDouble();
       System.out.println("Digite o Nº 2:");
       n2 = in.nextDouble();

        System.out.println("==================================================");
        System.out.println("Digite 1 para fazer uma ADIÇÃO dos números");
        System.out.println("Digite 2 para fazer uma SUBTRAÇÃO dos números");
        System.out.println("Digite 3 para fazer uma MULTIPLICAÇÃO dos números");
        System.out.println("Digite 4 para fazer uma DIVISÃO dos números");
        System.out.println("==================================================");
        System.out.println("\nDigite sua resposta aqui:");
        
        int resposta = in.nextInt();
        if(resposta == 1){
            System.out.println(n1 + n2);
        }else{
            if(resposta == 2){
                System.out.println(n1 - n2);
            }else{
            }if(resposta == 3){
                System.out.println(n1 * n2);
            }else{
                if(resposta == 4){
                    System.out.println(n1 / n2);
                }else{
                    System.out.print("Número incorreto! Digite outro...");
                }
            }
        }in.close();
    }
}
