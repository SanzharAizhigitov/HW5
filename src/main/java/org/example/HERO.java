package org.example;

public class HERO {
    private int hp;
    private int damage;
    private int superpower;
    public HERO ( int hp, int damage, int superpower){
        this.hp=hp;
        this.damage=damage;
        this.superpower=superpower;}
    public HERO (int hp, int damage){
        this.hp=hp;
        this.damage=damage;}

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getSuperpower() {
        return superpower;}

    }