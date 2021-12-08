package Ex_7_2;

public class Client {

    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        mt.setPrice(50.00);

        mt.setDiscount(new StudentDiscount());
        System.out.println("学生折后价为： "+ mt.getPrice());
        System.out.println("----------------------------------");
        mt.setDiscount(new VIPDiscount());
        System.out.println("VIP折后价为： "+ mt.getPrice());
        System.out.println("----------------------------------");
        mt.setDiscount(new ChildrenDiscount());
        System.out.println("儿童折后价为： "+mt.getPrice());
    }
}
