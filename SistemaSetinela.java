import java.util.Scanner;

public class SistemaSetinela {
    /**
     * @param args
     */
    public static void main(final String[]
    args) {
        final Scanner sc = new
        Scanner(System.in);

        //Req01
        System.out.print("Nome: ");
        final String nome = sc.nextLine();
        System.out.print("Cargo: ");
        final String cargo = sc.nextLine();

        // Req02 e Req03
        System.out.print("Nível de acesso 1-10: ");
        final int nivelAcesso = sc.nextInt();
        System.out.print("Nível de sigilo 1-10: ");
        final int nivelSigilo = sc.nextInt();

        //Req004 + Req11: Valida intervalo
        if (nivelAcesso < 1 ||
        nivelAcesso > 10) {

            System.out.print("Erro: Nível de acesso inválido.");
            return;
         }

        //Req05, Req06, Req08, Req09
        if (nivelAcesso >=
        nivelAcesso) {
            //Req10 - parte 1: saldo
            final int saldo = nivelAcesso - nivelAcesso;
            System.out.println(nome + "(" + cargo + ") - ACESSO PERMITIDO. Saldo de autoridade: " + saldo + ".");    
        } else {
            System.out.println(nome + "(" + cargo + ") - ACESSO NEGADO.");
            //Req07 + Req110 - parte 2 alerta
            if (nivelAcesso < 3 && nivelSigilo > 7) {
                
                System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
            }
        }
        sc.close();
    }
}   