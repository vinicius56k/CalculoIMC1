import java.util.Scanner;
public class Main {
    public static void calculoImc (float peso, float altura){
    double [] pesosImc = {18.5, 24.9, 29.9, 39.9, 9000 };
    String [] classificacoesImc = {"Magreza","Normal","sobrepeso"," obesidade"," obesidade grave"} ;
    float imc = peso / (altura *altura);
    System.out.println( " O IMC é:" + imc);
    String classificacao;
    int i = 0;
        while (imc > pesosImc[i]) { i++;
        }
    classificacao = classificacoesImc[i];
        System.out.println( "A classificacao é:" + classificacao);
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int teste = 1;
        while ( teste == 1) {
            System.out.println(" Calcular IMC ? (1=sim, 0 = não)");
        teste = entrada.nextInt();
        if (teste == 1) {
            System.out.println(("Entre com o peso em KG:"));
            float peso = entrada.nextFloat();
            System.out.println(("Entre com a altura em metros:"));
            float altura = entrada.nextFloat();
            calculoImc(peso, altura);
        }
    }
    }
}
