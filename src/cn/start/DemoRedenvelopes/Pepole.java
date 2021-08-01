package cn.start.DemoRedenvelopes;

public class Pepole {
    private String name;
    private int money;
    public void show(){
        System.out.println("我叫"+ name +"我有"+ money+"钱");
    }

    public Pepole() {
    }

    public Pepole(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
