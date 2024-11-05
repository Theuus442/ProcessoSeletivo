package Questao03;

public class Faturamento {
    public static void main(String[] args) {
        double[] faturamentoDiario = {1000.0, 500.0, 0.0, 2000.0, 0.0, 3000.0, 1200.0};
        double soma = 0;
        int diasComFaturamento = 0;

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        // Cálculo do menor e maior faturamento e soma dos dias com faturamento
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menor) menor = faturamento;
                if (faturamento > maior) maior = faturamento;
                soma += faturamento;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        // Contagem de dias com faturamento acima da média
        for (double faturamento : faturamentoDiario) {
            if (faturamento > media) diasAcimaDaMedia++;
        }

        System.out.println("Menor faturamento: " + menor);
        System.out.println("Maior faturamento: " + maior);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
