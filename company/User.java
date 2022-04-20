package com.company;

abstract class User {
    protected String name;
    protected int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print() {
        System.out.println("Kullanıcı detayı >>>>>> Kullanıcı adı: " + this.name);
        System.out.println();
    }

    public void print(String message) {
        System.out.println(message +  " kullanıcı adı: " + this.name);
    }
}
