import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void menu(){
        System.out.println("===================== Choose one of numbers:");
        System.out.println("1: show all objects");
        System.out.println("2: create carton");
        System.out.println("0: show menu again");


    }
    public static void main(String[] args) {



        Repository repository = new Repository();
        repository.oldData();
        System.out.println(repository.toString());
        menu();
        d(repository);

            



    }
    public static void d(Repository repository){
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        if(i == 1){
            repository.showAllObjects();
        }
        if(i == 2){
            repository.createCarton();
        }
        i = scn.nextInt();
        if(i == 0){
            menu();
        }
    }

}