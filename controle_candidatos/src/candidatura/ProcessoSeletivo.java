package candidatura;

import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        selecaoCandidatos();
    }
    
    static void selecaoCandidatos() {
        String[] candidatos = {"Arlindo", "Graziela", "Rose", "Dayane", "Eliane", "Bene", "Juliao", "Evandro", "Eliseu", "Libia"};
        
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        
        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + " solicitou este valor de salario: " + salarioPretendido);
            
            if (analisarCandidato(salarioPretendido, salarioBase)) {
                candidatosSelecionados++;
            }
            
            candidatosAtuais++;
        }
    }

    static double valorPretendido() {
        // Simulando o valor pretendido com um valor aleatório entre 1800 e 2200
        Random random = new Random();
        return 1800 + (random.nextDouble() * 400);
    }

    static boolean analisarCandidato(double salarioPretendido, double salarioBase) {
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
            return true;
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
            return true;
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
            return false;
        }
    }
}
