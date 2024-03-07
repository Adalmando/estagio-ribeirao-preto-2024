import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // QUESTÃO 1:
        soma();

        // QUESTÃO 2:
        fibonacci();

        // QUESTÃO 5:
        inverter();
    }

    // QUESTÃO 1 DO TESTE DO ESTÁGIO:
    public static void soma(){

        Integer indice = 13;
        Integer soma = 0;
        Integer k = 0;

        while(k < indice){
            k++;
            soma += k;
        }
        System.out.println(soma);
    }

    // QUESTÃO 2 DO TESTE DO ESTÁGIO:
    public static void fibonacci(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer numero = scanner.nextInt();

        Integer a = 0, b = 1, proximo;
        Boolean encontrado = false;

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < numero; ++i) {
            System.out.print(a + " ");
            proximo = a + b;
            a = b;
            b = proximo;

            if (numero == a) {
                encontrado = true;
                break;
            }
        }

        System.out.println();

        if (encontrado) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    // QUESTÃO 5 DO TESTE DO ESTÁGIO:
    public static void inverter(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra que será invertida: ");
        String palavra = scanner.nextLine();

        String palavraInvertida = "";

        for (Integer i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("String invertida: " + palavraInvertida);

        System.out.println();
    }
}