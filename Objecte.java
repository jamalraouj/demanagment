import java.util.concurrent.atomic.AtomicInteger;

public class Objecte {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private int id ;
    private String name ;


    public Objecte(String name) {
        this.id  = _ID.incrementAndGet();
        this.name = name;
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

    @Override
    public String toString() {
        return "Objecte{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
