package com.cod;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Pizzas pizzaDefault;
        Pizzas pizzaAmedida;

        /*
        BuilderPizzas miBuilder = new BuilderPizzas();//Creo builder

        pizzaDefault = miBuilder.build();//Dame la pizza por defecto
        System.out.println(pizzaDefault.toString());


*/
/**
        BuilderPizzas miBuilder = new BuilderPizzas();//Creo builder
        miBuilder.setCebolla(false);//ESpecifico que cebolla no
        miBuilder.setSize(Pizzas.BIG);//ESpecifico que tamaño grande
        pizzaDefault = miBuilder.build();//Dame la pizza que te estaba pidiendo con lo que yo queria


        System.out.println(pizzaDefault.toString());

*/

/**
        BuilderPizzas miBuilder = new BuilderPizzas();//Creo builder
        pizzaDefault =  miBuilder.setCebolla(false).setSize(Pizzas.BIG).build();
        System.out.println(pizzaDefault.toString());
        //ESto es lo mismo que las cuatro lineas anteriores
**/


        pizzaDefault= new BuilderPizzas().setCebolla(false).setSize(Pizzas.BIG).build();//Creo builder
        System.out.println(pizzaDefault.toString());
       //OTRA FORMA



        //sintaxis reducida legible
        Pizzas pizzaDefault2 = new BuilderPizzas()
                .setCebolla(true)
                .setSize(Pizzas.FINA)
                .build();





        BuilderPizzas miOtroBuilder = new BuilderPizzas();
        miOtroBuilder.setRecojida(Pizzas.TIENDA);
        miOtroBuilder.setSinGluten(true);
        pizzaAmedida=miOtroBuilder.build();










    }
}
