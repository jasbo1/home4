package com.company;

public class Producer implements Runnable {
    Store store;
    Producer (Store store){
       this.store = store;

    }
    public void  run(){
        for (int i = 1 ; i < 5; i++) {
            store.put();
        }
    }
}
