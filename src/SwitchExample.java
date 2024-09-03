public class SwitchExample {
    public static void main(String[] args) {
        String day="Monday";
        //In new switch use of break is eliminated using -> symbol
        switch (day){
            case "Saturday","Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("7am");
            default -> System.out.println("8am");
        }
    }
}
