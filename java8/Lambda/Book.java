package java8.Lambda;


public class Book {
    private int id;
    private String name;
    private int pages;

    public Book(int id, String book, int pages) {
    }

    public int getId() {
        return id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Book(){
        super();
    }
}
