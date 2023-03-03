package exercicios.collections.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Temperaturas {
    public static void main(String[] args) {
        
       List<Double> temperaturas = new ArrayList<>();
       
       temperaturas.add(31.7);
       temperaturas.add(30.6);
       temperaturas.add(32.3);
       temperaturas.add(30.3);
       temperaturas.add(29.7);
       temperaturas.add(29.4);

       System.out.println(temperaturas);

       Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        
        Double media = soma / temperaturas.size();


       System.out.println("A média das temperaturas foi: " + media);


       System.out.print("As temperaturas acima da média foram: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));
        
        
        System.out.println("\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator2 = temperaturas.iterator();
        
        int count = 0;
        while (iterator2.hasNext()) {
            Double temp = iterator2.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                        }
                }
            count++;
        }
       

       
    }   
}
