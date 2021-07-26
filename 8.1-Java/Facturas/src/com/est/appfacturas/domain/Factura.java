package com.est.appfacturas.domain;

import java.util.Date;

public class Factura {

    private int id;
    private String description;
    private Date date;
    private Cliente client;
    private Items[] items;
    private int indexItems;
    public static final int MAX_SIZE = 10;
    public static int lastId;


    public Factura(String description, Cliente client) {
        this.description = description;
        this.client = client;
        this.items = new Items[MAX_SIZE];
        this.id = ++Factura.lastId;
        this.date = new Date();
    }

    public void add(Items item){
        if (indexItems < MAX_SIZE){
            this.items[indexItems++] = item;
        }
    }

    public Items[] getItems() {
        return items;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
