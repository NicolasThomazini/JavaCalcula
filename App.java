import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
     {
         //Scanner serve para ler o programa e devolver as variaveis, int e string = C#
         Scanner ler = new Scanner (System.in);
        int n,g;
        String nome;

        System.out.printf ( "Qual seu nome?\n");
        nome = ler.next();
        System.out.printf ("Valor da primeira conta inteira :");
        n = ler.nextInt();
        System.out.printf ("Valor da segunda conta inteira :");
        g = ler.nextInt();
        System.out.printf("Ola %s",nome);
        System.out.printf ("\nSua Conta deu:\n");
        System.out.printf ("%d + %s = %3d\n", g,n, (n+g));
        //Método para soma de int, porém, serve para double
                     

     }

}
