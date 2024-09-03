public class SwitchExpressionExample {
    public static void main(String[] args) {
        String day="Monday";
        String result ="";
        //In new switch expression can also be returned
        result = switch (day){
            case "Saturday","Sunday" -> "6am";
            case "Monday" -> "7am";
            default -> "8am";
        };
        System.out.println(result);
    }
}
