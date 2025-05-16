
// Algoritmos e Programação: Fundamentos - Ciência da Computação - Unisinos
// Aluno - Thiago da Silva Rodrigues

import java.io.*;

/** Classe que permite fazer leitura de dados do teclado  */

public class Teclado
{
     private static String s;
     private static InputStreamReader i = new InputStreamReader (System.in);
     private static BufferedReader d = new BufferedReader(i);

     /**
        Lê um inteiro.
        @return int
     */
     public static int leInt ()
     {   int a = 0;
         try
         {
             s = d.readLine();
             a = Integer.parseInt(s);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: " + e);
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser inteiro: "+e );
         }
         return (a);
     }

     /**
        Lê um inteiro, com mensagem.
        @return int
     */
     public static int leInt (String msg)
     {   int a = 0;
         System.out.println(msg);
         try
         {
             s = d.readLine();
             a = Integer.parseInt(s);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: "+e );
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser inteiro: "+e );
         }
         return (a);
     }

     /**
        Lê um double.
        @return double
     */
     public static double leDouble()
     {   double a = 0;
         try
         {
             s = d.readLine();
             a = Double.parseDouble(s);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: " + e);
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser número: "+e );
         }
         return (a);
     }

     /**
        Lê um double, com mensagem.
        @return double
     */
     public static double leDouble(String msg)
     {   double a = 0;
         System.out.println(msg);
         try
         {
             s = d.readLine();
             a = Double.parseDouble(s);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: " + e);
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser numero: "+e );
         }
         return (a);
     }

     /**
        Lê um string.
        @return String
     */
     public static String leString()
     {   s = "";
         try
         {
            s = d.readLine();
         }
         catch (IOException e)
         {
            System.out.println ("Erro de I/O: " + e);
         }
         return (s);
     }

     /**
        Lê um string. com mensagem.
        @return String
     */
     public static String leString(String msg)
     {   s = "";
         System.out.println(msg);
         try
         {
            s = d.readLine();
         }
         catch (IOException e)
         {
            System.out.println ("Erro de I/O: " + e);
         }
         return (s);
     }
     
     public static char leChar()
     {   char a = ' ';
         try
         {
             s = d.readLine();
             a = s.charAt(0);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: " + e);
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser char: "+e );
         }
         return (a);
     }

     /**
        Lê um char, com mensagem.
        @return char
     */
     public static char leChar(String msg)
     {   char a = ' ';
         System.out.println(msg);
         try
         {
             s = d.readLine();
             a = s.charAt(0);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: " + e);
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser um char: "+e );
         }
         return (a);
     }
}



        /**
      
           - leInt(String msg): este método imprime na tela a String msg e faz o programa parar
           até que o usuário digite um inteiro. Caso o valor digitado seja inválido (ou seja, não for
           um inteiro), o programa apresentará um erro.
           
           - leDouble(String msg): este método imprime na tela a String msg e faz o programa parar
           até que o usuário digite um double. Caso o valor digitado seja inválido (ou seja, não for
           um double), o programa apresentará um erro.
           
           - leString(String msg): este método imprime na tela a String msg e faz o programa parar
           até que o usuário digite um texto.
           
           - leChar(String msg): este método imprime na tela a String msg e faz o programa parar
           até que o usuário digite um caractere. Caso o valor digitado seja inválido (ou seja, não for
           um char), o programa apresentará um erro.
           
           - leInt(): este método faz o programa parar até que o usuário digite um inteiro. Caso o valor 
           digitado seja inválido (ou seja, não for um inteiro), o programa apresentará um erro.
           
           - leDouble(): este método faz o programa parar até que o usuário digite um double. Caso o valor
           digitado seja inválido (ou seja, não for um double), o programa apresentará um erro.
           
           - leString(): este método faz o programa parar até que o usuário digite um texto.
           
           - leChar(): este método faz o programa parar até que o usuário digite um caractere. Caso o valor 
           digitado seja inválido (ou seja, não for um char), o programa apresentará um erro.
           
           Abaixo, exemplos de utilização da classe Teclado.
           

           //CHAMADAS AOS MÉTODOS COM IMPRESSÃO DE MENSAGEM:
           String texto1 = Teclado.leString("Digite um texto:");
           System.out.println("O texto digitado foi "+texto1);
           
           int inteiro1 = Teclado.leInt("Digite um inteiro:");
           System.out.println("O inteiro digitado foi "+inteiro1);
           
           double real1 = Teclado.leDouble("Digite um número real:");
           System.out.println("O real digitado foi "+real1);
           
           char caractere1 = Teclado.leChar("Digite um caractere:");
           System.out.println("O caractere digitado foi "+caractere1);
           
           //CHAMADAS AOS MÉTODOS SEM IMPRESSÃO DE MENSAGEM:
           //perceba que o cursos ficará piscando, aguardando a entrada de dados,
           //mas nenhuma mensagem será impressa
         
           String texto2 = Teclado.leString();
           System.out.println("O texto digitado foi "+texto2);
           
           int inteiro2 = Teclado.leInt();
           System.out.println("O inteiro digitado foi "+inteiro2);
           
           double real2 = Teclado.leDouble();
           System.out.println("O real digitado foi "+real2);
           
           char caractere2 = Teclado.leChar();
           System.out.println("O caractere digitado foi "+caractere2); **/
    

