import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta !");
        int numConta = scan.nextInt();
        
        scan.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o seu Saldo!");
        Double saldoConta = scan.nextDouble();
        
        System.out.printf("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ ", conta: "+numConta+" e seu saldo: "+saldoConta+" já está disponível para saque.");
        scan.close();
        }
}
