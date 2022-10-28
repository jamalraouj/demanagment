import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Carton {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    int id;
    String name;
    ArrayList<Objecte> objects = new ArrayList<>();
    ArrayList<MiniCarton> miniCartons = new ArrayList<>();

    public Carton( String name) {
        this.id = _ID.incrementAndGet();
        this.name = name;
    }
   public void addObject(Objecte object){
        this.objects.add(object);
   }
   public void addMiniCarton(MiniCarton miniCarton){
        this.miniCartons.add(miniCarton);
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

    public ArrayList<Objecte> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Objecte> objects) {
        this.objects = objects;
    }

    public ArrayList<MiniCarton> getMiniCartons() {
        return miniCartons;
    }

    public void setMiniCartons(ArrayList<MiniCarton> miniCartons) {
        this.miniCartons = miniCartons;
    }

    @Override
    public String toString() {
        return "Carton{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", objects=" + objects +
                ", miniCartons=" + miniCartons +
                '}';
    }
}
