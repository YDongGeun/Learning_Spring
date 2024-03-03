package com.github.supercoding.web.dto;

import com.github.supercoding.respository.ItemEntity;

import java.util.Objects;
import java.util.function.Consumer;

public class Item {
    private String id;
    private String name;
    private String type;
    private Integer price;
    private Spec spec;

    public Item() {}

    public Item(Integer id, ItemBody itemBody) {
        this.id = String.valueOf(id);
        this.name = itemBody.getName();
        this.type = itemBody.getType();
        this.price = itemBody.getPrice();
        this.spec = itemBody.getSpec();
    }

    public Item(String id, ItemBody itemBody) {
        this.id = String.valueOf(id);
        this.name = itemBody.getName();
        this.type = itemBody.getType();
        this.price = itemBody.getPrice();
        this.spec = itemBody.getSpec();
    }

    public Item(ItemEntity itemEntity) {
        this.id = String.valueOf(itemEntity.getId());
        this.type = itemEntity.getType();
        this.name = itemEntity.getName();
        this.price = itemEntity.getPrice();
        this.spec = new Spec(itemEntity.getCpu(), itemEntity.getCapacity());
    }

    public Item(String id, String name, String type, Integer price, String cpu, String capacity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.spec = new Spec(cpu, capacity);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getPrice() {
        return price;
    }

    public Spec getSpec() {
        return spec;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Item item)) return false;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
