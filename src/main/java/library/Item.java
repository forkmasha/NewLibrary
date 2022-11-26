package library;

public abstract class Item {
    private int id;
    private String name;
   private String authorName;
   private int qty;
    private int qtyCopy;


    public Item(int id, String name, String authorName, int qty, int qtyCopy) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.qty = qty;
        this.qtyCopy = qtyCopy;
    }

    public Item() {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.qty = qty;
        this.qtyCopy = qtyCopy;
    }

    public int getId() {
        return id;
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQtyCopy() {
        return qtyCopy;
    }

    public void setQtyCopy(int qtyCopy) {
        this.qtyCopy = qtyCopy;
    }
}
