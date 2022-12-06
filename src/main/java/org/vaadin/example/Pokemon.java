package org.vaadin.example;

public class Pokemon {
    //id, numero, Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary
    private int id;
    private int numero;
    private String name;
    private String tipo1;
    private String tipo2;
    private int total;
    private int hp;
    private int attack;
    private int defense;
    private int speedAttack;
    private int speedDefense;
    private int speed;
    private int generation;
    private boolean legendary;

    public Pokemon(int id, int numero, String name, String tipo1, String tipo2, int total, int hp, int attack, int defense, int speedAttack, int speedDefense, int speed, int generation, boolean legendary) {
        this.id = id;
        this.numero = numero;
        this.name = name;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speedAttack = speedAttack;
        this.speedDefense = speedDefense;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeedAttack() {
        return speedAttack;
    }

    public void setSpeedAttack(int speedAttack) {
        this.speedAttack = speedAttack;
    }

    public int getSpeedDefense() {
        return speedDefense;
    }

    public void setSpeedDefense(int speedDefense) {
        this.speedDefense = speedDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public void setLegendary(boolean legendary) {
        this.legendary = legendary;
    }
}
