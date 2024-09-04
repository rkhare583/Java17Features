public class RecordPatternExample {
    void main(){
    Address a1=new Address("Jhansi",284003);
    User u1=new User("Rohit",28, a1);
    checkRecordMatch(u1);
    }
    public static void checkRecordMatch(Object obj){
    if(obj instanceof User(String Username,int Userage, Address(String UserCity,int Userpostcode))){
        System.out.println(Username + Userage);
        System.out.println(STR."\{UserCity} \{Userpostcode}");
    }
    }
    record User(String name,int age, Address address){}
    record Address(String city,int postcode){}
}
