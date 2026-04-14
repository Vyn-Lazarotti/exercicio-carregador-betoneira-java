import java.util.Scanner;

public class SimuladorBetoneira {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double pesoAlvo = 500.0;
        double pesoAtual = 0.0;
        int ciclo = 0;

        System.out.println("Simulador de peso");
        System.out.println("Meta: " + pesoAlvo + " kg de Brita 1.");

        do {
            System.out.println("Digite o peso da Brita 1 adicionada (kg): ");
            double pesoAdicionado = teclado.nextDouble();
            pesoAtual += pesoAdicionado;
            ciclo++;

            System.out.println("Peso atual: " + pesoAtual + " kg");

            if (pesoAtual >= pesoAlvo) {
                System.out.println("Meta atingida em " + ciclo + " ciclos!");
                break;
            }
        } while (true);

        if (pesoAtual > pesoAlvo * 1.05) {
            System.out.println("Cuidado! Você ultrapassou a meta em mais de 5%.");
            System.out.println("Pode estar com problemas de estabilidade.");
        } else {
            System.out.println("Peso dentro do limite aceitável.");
        }


        teclado.close();
    }
}