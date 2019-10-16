/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


 public class OptionSet {

    public static Option Option() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        private String name;
        private Option[] choises;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public Option[] getChoises() {
        return choises;
    }

    public void setChoises(Option[] choises) {
        this.choises = choises;
    }

        
        public class Option {

            private String name;
            private double price;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }
             
            
        }
    }
