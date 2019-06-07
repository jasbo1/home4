package com.company;

public class Store {
    private int  product = 0;

    public void put() {
        while (product >= 3){
            try {
                wait();

            } catch (InterruptedException e){}
        }
        product++;
        System.out.println ("Производитель добавил 1 товар");
        System.out.println ("Товаров на складе: " + product);
    }
    public void get(){
        product--;
        System.out.println ("Покупатель купил 1 товар");
        System.out.println ("Товаров на складе: " + product);

    }
}
