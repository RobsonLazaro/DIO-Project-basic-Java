import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int parametroUm = scan.nextInt();
        int parametroDois = scan.nextInt();

        try {   
            contar(parametroUm, parametroDois);
            
        } catch ( ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        scan.close();
    }
    public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();

            int contagem = parametroDois - parametroUm;


        for(int x=1; x <= contagem; x++){
            System.out.println("Contagem numero: "+ x);
        }
    }
}
