record  Alien(int id, String name){ }
public class RecordExample {
    public static void main(String[] args) {
        Alien a1= new Alien(1,"Rohit");
        Alien a2 = new Alien(1,"Rohit");
        System.out.println(a1);
        System.out.println(a1.equals(a2));
        System.out.println(a2.name());

    }
}
