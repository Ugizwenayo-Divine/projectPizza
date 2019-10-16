/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Model.OptionSet;
import Model.OptionSet.Option;
import Model.PizzaConfig;
import java.util.Scanner;

public class PizzaTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wellcome to pizzeria shop");
        System.out.println("============================");
        System.out.println("------------------------------");
        PizzaConfig conf = new PizzaConfig();
        OptionSet[] optionset;
        optionset = new OptionSet[5];

        OptionSet.Option[] option = new OptionSet.Option[8];

        int x = 0;
        double money = 0;
        
        
        System.out.println("We have four different kind of pizza");
        System.out.println("MARGHARITE");
        System.out.println("MARINARA");
        System.out.println("CRUDE");
        System.out.println("CARBONA");
        System.out.println("==================");
        System.out.println("                       ");
        System.out.println("enter the name of the piza you want");
        String pizzaName = sc.next();
        conf.setPizzaName(pizzaName);
        System.out.println("we have different size of pizza");
        System.out.println("S for small pizza");
        System.out.println("M for Medium pizza");
        System.out.println("L for Large Pizza");
        System.out.println("                     ");
        String pizzaSize = sc.next();
        conf.setSize(pizzaSize);
        conf.setBase_price(1000);
        System.out.println("we offer different delivery service");
        System.out.println("for takaway way press T");
        System.out.println("for eat in in press E");
        System.out.println("for delivering press D");
        System.out.println("                          ");
        String delivering = sc.next();
        conf.setDeliveryMode(delivering);
        System.out.println("we have Pizza of Meat or vegetable pizza ");
        System.out.println("==========================================");
        String choise = sc.next();

        OptionSet o = new OptionSet();
        o.setName(choise);
        optionset[0] = o;
        System.out.println(optionset[0].getName());

        if (choise.equalsIgnoreCase("vegetable")) {
            System.out.println("Vegetable ingeredient");
            System.out.println("Mushroom");
            System.out.println("Onion");
            System.out.println("Black Olives");
            System.out.println("pineapple");
            System.out.println("tomato");
            System.out.println("Carrot");
            System.out.println("how many ingredients do you want");
            int ing = sc.nextInt();
            for (int i = 0; i < ing; i++) {
                System.out.println("enter the name of vegetable you want");
                String nameofveg = sc.next();
                x = x + 100;
                OptionSet optionsets = new OptionSet();
                OptionSet.Option opt = optionsets.new Option();
                opt.setName(nameofveg);
                option[i] = opt;
                opt.setPrice(conf.getBase_price() + x);
                option[i] = opt;
                money = money + option[i].getPrice();
            }

            if (conf.getSize().equalsIgnoreCase("s")) {
                System.out.println("you have chosen pizza " + conf.getPizzaName());
                System.out.println("the pizze is " + optionset[0].getName());
                System.out.println("the size of pizza " + conf.getSize());
                System.out.println("mode of delivery " + conf.getDeliveryMode());
                if (conf.getDeliveryMode().equalsIgnoreCase("d")) {
                    System.out.println("the amount to be payed " + money + 1000);
                } else {
                    System.out.println("the amount to be payed  " + money);
                }
                System.out.println("the ingerdient ");
                System.out.println("------------------");
                for (int t = 0; t < ing; t++) {
                    System.out.println(" " + option[t].getName());
                }
            }
            if (conf.getSize().equalsIgnoreCase("m")) {
                System.out.println("you have chosen pizza " + conf.getPizzaName());
                System.out.println("the pizze is " + optionset[0].getName());
                System.out.println("the size of pizza " + conf.getSize());
                System.out.println("mode of delivery " + conf.getDeliveryMode());
                if (conf.getDeliveryMode().equalsIgnoreCase("d")) {
                    System.out.println("you requested to be delivered ");
                    System.out.println("the amount to be payed " + money + 4000);
                } else {
                    System.out.println("the amount to be payed " + money + 200);
                }
                System.out.println("the ingerdient ");
                System.out.println("------------------");
                for (int t = 0; t < ing; t++) {
                    System.out.println(" " + option[t].getName());
                }
            }else if (conf.getSize().equalsIgnoreCase("L")) {

                System.out.println("you have chosen pizza " + conf.getPizzaName());
                System.out.println("the pizze is " + optionset[0].getName());
                System.out.println("the size of pizza " + conf.getSize());
                System.out.println("mode of delivery " + conf.getDeliveryMode());
                if (conf.getDeliveryMode().equalsIgnoreCase("d")) {
                    System.out.println("the amount to be payed " + money + 6000);
                } else {
                    System.out.println("the amount to be payed  " + money + 3000);
                }
                System.out.println("the ingerdient ");
                System.out.println("------------------");
                for (int t = 0; t < ing; t++) {
                    System.out.println(" " + option[t].getName());
                }
            }
        } else if (choise.equalsIgnoreCase("meat")) {

            System.out.println("Meat ingeredient");
            System.out.println("beef");
            System.out.println("pepperoni");
            System.out.println(" anchovy");
            System.out.println("ham");
            System.out.println("fish");

            System.out.println("how many ingredients do you want");
            int ing = sc.nextInt();
            for (int i = 0; i < ing; i++) {
                System.out.println("enter the name of meat you want");
                String nameofveg = sc.next();
                x = x + 100;
                OptionSet optionsets = new OptionSet();
                OptionSet.Option opt = optionsets.new Option();
                opt.setName(nameofveg);
                option[i] = opt;
                opt.setPrice(conf.getBase_price() + x);
                option[i] = opt;
                money = money + option[i].getPrice();
            }

            if (conf.getSize().equalsIgnoreCase("s")) {
                System.out.println("you have chosen pizza " + conf.getPizzaName());
                System.out.println("the pizze is " + optionset[0].getName());
                System.out.println("the size of pizza " + conf.getSize());
                System.out.println("mode of delivery " + conf.getDeliveryMode());
                if (conf.getDeliveryMode().equalsIgnoreCase("d")) {
                    System.out.println("you requested to be delivered ");
                    System.out.println("the amount to be payed " + money + 1000);
                } else {
                    System.out.println("the amount to be payed  " + money);
                }
                System.out.println("the ingerdient ");
                System.out.println("------------------");
                for (int t = 0; t < ing; t++) {
                    System.out.println(" " + option[t].getName());
                }
            }
            if (conf.getSize().equalsIgnoreCase("m")) {
                System.out.println("you have chosen pizza " + conf.getPizzaName());
                System.out.println("the pizze is " + optionset[0].getName());
                System.out.println("the size of pizza " + conf.getSize());
                System.out.println("mode of delivery " + conf.getDeliveryMode());
                if (conf.getDeliveryMode().equalsIgnoreCase("d")) {
                    System.out.println("the amount to be payed " + money + 4000);
                } else {
                    System.out.println("the amount to be payed " + money + 200);
                }
                System.out.println("the ingerdient ");
                System.out.println("------------------");
                for (int t = 0; t < ing; t++) {
                    System.out.println(" " + option[t].getName());
                }
            } else if (conf.getSize().equalsIgnoreCase("L")) {

                System.out.println("you have chosen pizza " + conf.getPizzaName());
                System.out.println("the pizze is " + optionset[0].getName());
                System.out.println("the size of pizza  " + conf.getSize());
                System.out.println("mode of delivery " + conf.getDeliveryMode());
                if (conf.getDeliveryMode().equalsIgnoreCase("d")) {
                    System.out.println("the amount to be payed " + money + 6000);
                } else {
                    System.out.println("the amount to be payed  " + money + 3000);
                }
                System.out.println("the ingerdient ");
                System.out.println("------------------");
                for (int t = 0; t < ing; t++) {
                    System.out.println(" " + option[t].getName());
                }
            }

        }
        
        System.out.println("THANK YOU FOR SHOPPING WITH US");
    }
    
}
