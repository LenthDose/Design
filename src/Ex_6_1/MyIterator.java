package Ex_6_1;

public class MyIterator implements AbstractIterator{
    private final String[] booksName;
    private int index;

    public MyIterator(AbstractBookList list) {
        booksName = list.getBooksName();
        index = 0;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public String getNextItem() {
        return booksName[index];
    }

    @Override
    public boolean isLast() {
        return (index == booksName.length);
    }
}
