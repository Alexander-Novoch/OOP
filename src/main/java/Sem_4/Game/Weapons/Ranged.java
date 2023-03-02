package Sem_4.Game.Weapons;

import Sem_4.Game.Weapon;

public class Ranged implements Weapon {

    private String weaponName;

    private int damagePoint;

    private int range;

    public int getRange() {
        return range;
    }

    public Ranged(String weaponName, int damagePoint, int range) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Ranged{" +
                "название='" + weaponName + '\'' +
                ", урон=" + damagePoint +
                ", дальность=" + range +
                '}';
    }

    @Override
    public int damage() {
        return damagePoint;
    }
}
