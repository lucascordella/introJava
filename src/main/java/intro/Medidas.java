// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

import javax.xml.bind.SchemaOutputResolver;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args){

        calcularAreaModoCompacto();
        calcularAreaModoExtenso();


    }

    public static void calcularAreaModoExtenso(){
        System.out.println("Cálculo de Areas Modo Extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4; // largura recebe 4
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");
    }

    public static void calcularAreaModoCompacto(){
        System.out.println("Cálculo de Areas Modo Compacto");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }

}
