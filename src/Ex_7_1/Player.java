package Ex_7_1;

public class Player implements IObserver{

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void help() {
        System.out.println("坚持住,"+ this.name + "马上就到！");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击！");
        acc.notifyObserver(name);
    }
}
