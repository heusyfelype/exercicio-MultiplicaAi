import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que você deseja saber a tabela de multiplicação: 5");
        int number = scan.nextInt();
        String mesage = "\n\nTabela de multiplicação de " + number + ": \n\n";

        for(int i = 1; i <= 10 ; i++){
            mesage += number + " × " +  i + " = " + number * i + "\n";
        }
        System.out.println(mesage);
    }
}
