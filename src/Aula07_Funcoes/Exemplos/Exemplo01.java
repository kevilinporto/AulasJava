package Aula07_Funcoes.Exemplos;

public class Exemplo01 {
    public static void main(String[] args) { // uma função não pode ser criada dentro de uma função
        funcaoSemParametoSemRetorno(); //a função não funciona se não for chamada no main
    }
    public static void funcaoSemParametoSemRetorno() {//uma função sempre vem acompanhada de parenteses. Caso não tenha, é varável
        System.out.println("Teste");
    }
}
