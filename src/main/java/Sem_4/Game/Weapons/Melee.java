package Sem_4.Game.Weapons;

import Sem_4.Game.Weapon;

public class Melee implements Weapon {

    String weaponName;

    private int damagePoint;

    public Melee(String weaponName, int damagePoint) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
    }

    @Override
    public String toString() {
        return "Melee{" +
                "название='" + weaponName + '\'' +
                ", урон=" + damagePoint +
                '}';
    }

    @Override
    public int damage() {
        return damagePoint;
    }
}
