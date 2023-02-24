package io.fp.campuszuhause;

public class Assistent {
    private int alter;
    private String name;
    private Professor boss;

    public Assistent(int alter, String name, Professor boss)
    {
        this.name=name;
        this.alter=alter;
        this.boss = boss;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getBoss() {
        return boss;
    }

    public void setBoss(Professor boss) {
        this.boss = boss;
    }
    @Override
    public String toString() {
        return "Assistent [name=" + name + ", alter=" + alter + ", boss=" + boss.getName() + "]";
    }
}
