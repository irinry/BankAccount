import java.util.ArrayList;

public class Students {

    String studentNames;
    int age;
    boolean single;
    String city;
    ArrayList<String> studentFriends;

    public Students(String studentNames, int age, boolean single, String city) {
        this.studentNames = studentNames;
        this.age = age;
        this.single = single;
        this.city = city;
        this.studentFriends = new ArrayList<>();
    }

        void addFriends(String studentFriends){
            this.studentFriends.add(studentFriends);
        }

        void introduceYourself(){
            System.out.println("My name is " + studentNames);
            System.out.println("I'm " + age + " years old");
            if (single) {
                System.out.println("I'm single");
            } else {
                System.out.println("I'm in a relationship ^_^ ");
            }
            System.out.println("My friends are:" + studentFriends);
            System.out.println (" ");
        }



    public static void main(String[] args) {
        Students bob = new Students("Bob", 36, false, "Berlin");
        bob.studentFriends.add("Alice");
        bob.studentFriends.add("Jane");
        bob.introduceYourself();

        Students alice = new Students("Alice", 25, true, "Moscow");
        alice.studentFriends.add("Bob");
        alice.studentFriends.add("Jane");
        alice.introduceYourself();

        Students john = new Students("John", 19, true, "San Fancosco");
        john.studentFriends.add("Jane");
        john.introduceYourself();

        Students jane = new Students("Jane", 46, false, "Rio");
        jane.studentFriends.add("John");
        jane.studentFriends.add("Alice");
        jane.studentFriends.add("Bob");
        jane.introduceYourself();
    }
}
