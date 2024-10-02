import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1 numero: ");
        int parametroUm = scanner.nextInt();

        System.out.println("\nDigite o 2 numero: ");
        int parametroDois = scanner.nextInt();

        System.out.println();

        try{

            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println("\nO primeiro parametro é maior que o segundo");
        }
    }

    static void contar(int a, int b) throws ParametrosInvalidosException{
        if(a > b){
            throw new ParametrosInvalidosException();
        }
        else {
            int contar = b - a;

        for(int x = 0; x < contar; x++){
           System.out.println("Imprimindo o numero " + (x+1));
          }
        }
    }
}