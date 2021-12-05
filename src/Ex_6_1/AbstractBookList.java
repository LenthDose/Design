package Ex_6_1;

public abstract class AbstractBookList {

    private String[] booksName;

    public AbstractBookList(String[] booksName) {
        this.booksName = booksName;
    }

    public String[] getBooksName(){
        return this.booksName;
    }

    public abstract AbstractIterator getIterator();
}
