import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class MiniCarton {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private int id;
    private String name;
    private ArrayList<Objecte> object = new ArrayList<>();

    public MiniCarton(String name) {
        this.name = name;
        this.id = _ID.incrementAndGet();
    }
    public void addObject(Objecte object){
        this.object.add(object);
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

    public ArrayList<Objecte> getObject() {
        return object;
    }

    public void setObject(ArrayList<Objecte> object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "MiniCarton{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", object=" + object +
                '}';
    }
}
