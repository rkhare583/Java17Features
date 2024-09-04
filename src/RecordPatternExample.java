//This is ex of Java 21
record User(String name,int age, Address address){}
record Address(String city,int postcode){}
void main(){
    Address a1=new Address("Jhansi",284003);
    User u1=new User("Rohit",28, a1);
    checkRecordMatch(u1);
    checkSwitchMatch(u1);
    }
    public static void checkRecordMatch(Object obj) {
        if (obj instanceof User(String Username, int Userage, Address(String UserCity, int Userpostcode))) {
            System.out.println(Username + Userage);
            System.out.println(STR."\{UserCity} \{Userpostcode}");
        }
    }
    public static void checkSwitchMatch(Object obj){
    switch (obj){
        case User(String Username,int Userage,Address address)-> System.out.println(Username);
        default -> throw new IllegalStateException("Unexpected value: " + obj);
    }
    }
