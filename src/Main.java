import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean verificador = true;




    }// 5/2 2.5
    public static double dividir(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("error: no se puede dividir por cero.");
        }
        return(double) a/b;
    }
}