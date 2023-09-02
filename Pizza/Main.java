package Pizza;

import Base.Topping;
import Expecialidades.PizzaItaLiana;
import Pizza.interfaces.PizzaBase;

public class Main {
    public static void main(String[] args)
    {



        Pizza pizza = new Pizza("Pizza Margherita");
        pizza.addTopping(new Topping("Tomato", 5));
        pizza.addTopping(new Topping("Mozzarella", 4));
        pizza.addTopping(new Topping("Basil", 3));
        pizza.prepare();
        System.out.println(pizza.getPizzaPrice());


   // PizzaItaLiana.PizzaItaliana pizza1 = new PizzaItaLiana("Pizza",50, "salsa tomate");
     //       pizza1.addTopping(new Topping("Mozzarella"));
      //      pizza1.addTopping(new Topping("Cebolla"));
        //    pizza1.addTopping(new Topping ("Aceituna"));
          //  pizza1.prepare();



        }

    }
    //modificar la clase pizza
    //agregarle una propiedad extra llamada tamaño
    //el precio de la pizza varia dependiendo el tamaño
    //samall (default), medium = 20%, large = 35%%
    //crear 4 especialidades diferentes de pizza
    //cada pizza debe de tener un por lo menos 1 ingrediente adicional
    //y 2 metodos diferentes de preparado. (sobreescribir al metodo de preparacion).