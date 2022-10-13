package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CatchInMassive();
        for (int i = 0; i < (CatchInMassive().length); i++) {
            System.out.println("Hero"+(i+1)+" HP: " + CatchInMassive()[i].getHp() + "|" + "Hero"+(i+1)+" Damage: " + CatchInMassive()[i].getDamage()+ "|"+ "Hero"+(i+1)+ " SuperpowerChance:" + CatchInMassive()[i].getSuperpower()  );
        }
        String HeroType[] = {"Mag","Swordman","Dragon"};
        Random random = new Random();
        int whoLucky = random.nextInt(HeroType.length);
        BOSS miniboss = new BOSS();
        miniboss.setBossHp(200);
        miniboss.setBossDamage(30);
        miniboss.setBossDefenceType(HeroType[whoLucky]);
        System.out.println("Boss HP: " + miniboss.getBossHp() + "|" + "Boss Damage: " + miniboss.getBossDamage() + "|" + "Boss Defence Type: " + miniboss.getBossDefenceType());
    }
public static HERO HeroWithSP(int hp, int damage, int superpower){
        HERO hero = new HERO(hp,damage,superpower);
        return hero;

}
    public static HERO HeroWithoutSP(int hp, int damage){
        HERO hero = new HERO(hp,damage);
        return hero;
    }
    public static HERO[] CatchInMassive(){
        HERO hero1 = HeroWithSP(200,20,1);
        HERO hero2 =  HeroWithSP(200,50,3);
        HERO hero3 =  HeroWithoutSP(400,60);
        HERO heroes[] = {hero1,hero2,hero3};
        return heroes;
    };
}