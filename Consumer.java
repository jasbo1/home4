package com.company;

public class Consumer implements Runnable {
        Store store;
        Consumer (Store store){
            this.store = store;

        }
        public void  run(){
            for (int i = 1 ; i < 5; i++) {
                store.get();
            }
        }
    }

