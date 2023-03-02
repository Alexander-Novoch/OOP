package Sem_4.Game.Shields;

import Sem_4.Game.Shield;

public class HeavyShield implements Shield {

    String shieldName;

    private int damageThreshold;

    private boolean isImmovable;

    public HeavyShield(String shieldName, int damageThreshold, boolean isImmovable) {
        this.shieldName = shieldName;
        this.damageThreshold = damageThreshold;
        this.isImmovable = isImmovable;
    }

    public boolean isImmovable() {
        return isImmovable;
    }

    @Override
    public int shieldHealth() {
        return damageThreshold;
    }

    public int getDamageThreshold() {
        return damageThreshold;
    }

    @Override
    public String toString() {
        return "Тяжелый щит{" +
                "название='" + shieldName + '\'' +
                ", сдерживаемый урон=" + damageThreshold +
                '}';
    }
}