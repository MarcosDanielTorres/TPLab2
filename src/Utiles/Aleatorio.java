/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

/**
 *
 * @author nacho
 */
public class Aleatorio {

    public static double doubleAleatorio(int min, int max) {
        return Math.random() * (max - min) + min;
    }

    public static int intAleatorio(int min, int max) {
        //El valor de max nunca se puede tomar
        return (int) doubleAleatorio(min, max);
    }

    public static char charAleatorio() {
        //Devuelve una letra aleatoria, mayuscula o minuscula
        char a;
        if (Math.random() >= 0.5) {
            a = (char) intAleatorio(97, 123);
        } else {
            a = (char) intAleatorio(65, 91);
        }
        return a;
    }

    public static String stringAleatorio(int tam) {
        //Devuelve un String formado por letras aleatorias, mayusculas o minusculas, generado por varios charAleatorio()
        //de longitud [tam]
        String res = "";
        for (int i = 0; i < tam; i++) {
            res = res + charAleatorio();
        }
        return res;
    }
}
