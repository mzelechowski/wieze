package pl.mike;

public class Tower {
    private int damage;
    private int defence;
    private int rate;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "damage=" + damage +
                ", defence=" + defence +
                ", rate=" + rate +
                '}';
    }
}
