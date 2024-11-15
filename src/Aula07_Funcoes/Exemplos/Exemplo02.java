package Aula07_Funcoes.Exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        funcaoComParametroSemRetorno(5, "Beatriz"); // Inserimos aqui os valores dos parametros
        Exemplo01.funcaoSemParametoSemRetorno(); // acessa a função de um outro arquivo, executando-o

    }
    static void funcaoComParametroSemRetorno(int parametro1, String parametro2){
        System.out.println("Parametro 1 = " + parametro1);
        System.out.println("Parametro 2 = " + parametro2);
    }
}
