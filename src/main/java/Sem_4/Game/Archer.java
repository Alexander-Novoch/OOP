package Sem_4.Game;

import Sem_4.Game.Shields.HeavyShield;
import Sem_4.Game.Weapons.Ranged;

public class Archer extends BaseHero<Ranged , HeavyShield>{
    public Archer(int health, String name, Ranged ranged) {
        super(health, name, ranged);

    }

    public Archer(int health, String name, Ranged ranged, HeavyShield shield) {
        super(health, name, ranged, shield);
    }

    @Override
    public Ranged getWeapon() {
        return super.getWeapon();
    }

    public  int range(){
        return ((Ranged)weapon).getRange();

        //weapon.getRange();
    }

    @Override
    public String toString() {
        return  "Лучник{ " + super.toString() + " }" + "\n" +  "~~~";
    }
}

