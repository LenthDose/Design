package Ex_6_1;

public class BookList extends AbstractBookList{

    public BookList(String[] booksName) {
        super(booksName);
    }

    @Override
    public AbstractIterator getIterator() {
        return new MyIterator(this);
    }
}
