package org.example.ioc;

import java.util.ArrayList;
import java.util.List;

public class InversionOfControl {
    /* Inversion of Control is a principle in software engineering which transfers the control of objects or portions
     * of a program to a container or framework. We most often use it in the context of object-oriented programming.
     * Uses Dependency Inversion that transfers the control of the objects to the container or framework.
     */
    public static void main(String[] args) {

        public class Store {
            private Item item;
            public Store() {
                item = new ItemImpl1();    
            }
        }
        
        public class Store {
            private Item item;
            public Store(Item item) {
                this.item = item;
            }
        }
    }
}
