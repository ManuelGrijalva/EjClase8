package Expecialidades;

import Base.Topping;
import Pizza.Pizza;

public class PizzaItaLiana {
    public class PizzaItaliana extends Pizza {
        private String salsa;

        public PizzaItaliana(String name, double price, String salsa, Topping...toppings){
            super (name, price,toppings);
            this.salsa = salsa;
        }
    }
}
