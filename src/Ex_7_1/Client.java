package Ex_7_1;

public class Client {

    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("SMG");
        IObserver player1 = new Player("One");
        acc.join(player1);
        IObserver player2 = new Player("Two");
        acc.join(player2);
        IObserver player3 = new Player("Three");
        acc.join(player3);
        player1.beAttacked(acc);
    }
}
