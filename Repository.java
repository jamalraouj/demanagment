import java.util.ArrayList;
import java.util.Scanner;

public class Repository {

    ArrayList<Carton> cartons = new ArrayList<>();
    ArrayList<MiniCarton> miniCartons = new ArrayList<>();
    ArrayList<Objecte> objects = new ArrayList<>();

    public void oldData(){
        cartons.add(new Carton("Clothes"));
        cartons.add(new Carton("second"));
        cartons.get(0).addMiniCarton(new MiniCarton("shoes"));
                    cartons.get(0).getMiniCartons().get(0).addObject(new Objecte("shoes1"));
                    cartons.get(0).getMiniCartons().get(0).addObject(new Objecte("shoes2"));
                    cartons.get(0).getMiniCartons().get(0).addObject(new Objecte("shoes3"));
        cartons.get(0).addMiniCarton(new MiniCarton("jacket"));
                        {cartons.get(0).getMiniCartons().get(1).addObject(new Objecte("jacket1"));
                        cartons.get(0).getMiniCartons().get(1).addObject(new Objecte("jacket2"));
                        cartons.get(0).getMiniCartons().get(1).addObject(new Objecte("jacket3"));}
        cartons.get(0).addMiniCarton(new MiniCarton("jeans"));
        cartons.get(0).addObject(new Objecte("T-shirt"));
        cartons.get(0).addObject(new Objecte("T-shirt2"));
        cartons.get(0).addObject(new Objecte("T-shirt3"));
        cartons.get(0).addObject(new Objecte("T-shirt4"));
//        ArrayList<Carton> folderNameDriveId = cartons.stream()
//                .filter(carton -> folderName.equals(carton.getName()))
//                .map(Drive::getId)
//                .findFirst();
    }
    public void createCarton(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Entre name of carton");
        String name = scn.nextLine();
        cartons.add(new Carton(name));
    }
    public void showAllObjects(){

        cartons.forEach((carton -> {
            carton.miniCartons.forEach((miniCarton -> {
                miniCarton.getObject().forEach((object->{
                    System.out.println("==== "+object.getId()+" - "+object.getName());
                }));
            }));
        }));
        cartons.forEach((carton->{
            carton.objects.forEach((objecte -> {
                System.out.println("==== "+objecte.getId()+" - "+objecte.getName());
            }));

        }));
    }

    @Override
    public String toString() {
        return "Repository{" +
                "cartons=" + cartons +
                ", miniCartons=" + miniCartons +
                ", objects=" + objects +
                '}';
    }
}
