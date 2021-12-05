package Ex_6_1;

public class Client {

    public static void main(String[] args) {
        String[] bName = {"海底两万里", "文化苦旅", "精神明亮的人", "三体"};
        AbstractIterator iterator;
        AbstractBookList list;
        list = new BookList(bName);
        iterator = list.getIterator();
        while (!iterator.isLast()){
            System.out.println(iterator.getNextItem());
            iterator.next();
        }
    }
}
