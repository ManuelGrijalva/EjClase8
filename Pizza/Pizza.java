package Pizza;

import Base.Topping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
        private String name;

        //eleminar la propiedad price de la pizza y
    //crear un metodo que se llame getPizzaPrice
    //haga la sumatoria de los ingridientes y nos de el precio
    //private double price.
        //private double price;
        private List<Topping> toppings = new ArrayList<>();


        public Pizza(String name, double price, Topping... toppings) {
            this.name = name;

            for (Topping topping : toppings) {
                this.toppings.add(topping);
            }
        }

        public void addTopping(Topping topping) {
            this.toppings.add(topping);
        }

        public void removeTopping(int index) {
            this.toppings.remove(index);
        }

        public List<Topping> getToppings() {

            return Collections.unmodifiableList(new ArrayList<>(toppings));
        }

        public String getName() {
            return name;
        }



        @Override
        public String toString() {
            return "Pizza{" + "name='" + name + '\'' + ", price="  + ", toppings=" + toppings + '}';
        }

        public void prepare() {
            System.out.println("Preparing..... " + name);
            System.out.println("Adding toppings:");
            for (Topping topping : toppings) {
                System.out.println("- " + topping.getNombre());
                //put 1 second delay
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Su pizza esta lista!");
        }
    }
