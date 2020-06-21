package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;
//import digital.innovation.one.utils.internal.SumHelper;
import java.util.List; //Já incorporado nos módulos por padrão
import java.util.ArrayList; //Já incorporado nos módulos por padrão

//import java.sql.Date; //Importado manualmente no modulo-info.java

public class Runner {
    public static void main(String[] args) {
//        Calculadora calculadora = new Calculadora();
//        new ArrayList<>();
//        List<Object> objects = new ArrayList<>();

//        new Date()

        Calculadora calculadora = new Calculadora();
        System.out.println("**============ CALCULADORA ===========**");
        System.out.println("A SOMA É : "+calculadora.sum(15,3));
//        System.out.println(calculadora.sum(15,3)); //Versão original
        System.out.println("__________________________________________");
        System.out.println("A SUBTRAÇÃO É : "+calculadora.sub(15,3));
//        System.out.println(calculadora.sub(15,3)); //Versão original
        System.out.println("__________________________________________");
        System.out.println("A DIVISÃO É : "+calculadora.div(15,3));
//        System.out.println(calculadora.div(15,3)); //Versão original
        System.out.println("__________________________________________");
        System.out.println("A MULTIPLICAÇÃO É : "+calculadora.mult(15,3));
//        System.out.println(calculadora.mult(15,3)); //Versão original
        System.out.println("__________________________________________");

//        SumHelper


    }

}
