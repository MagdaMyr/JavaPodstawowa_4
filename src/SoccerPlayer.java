/*
Zdefiniuj klasę Piłkarz. Stwórz obiekt tej klasy reprezentujący Twojego ulubionego zawodnika.
 */
public class SoccerPlayer {

    //pola
    String name, team;
    int no, age, salary;
    //static initializer - odpalany przed konstruktorem
    static String job = "Soccer Player";

    //konstruktor ---> Alt + Insert -> Constructor
    public SoccerPlayer(String name, String team, int no, int age, int salary) {
        this.name = name;
        this.team = team;
        this.no = no;
        this.age = age;
        this.salary = salary;
    }

    //metody
    public void hello() {
        System.out.printf(
                "Hi, my name is %s. I work as a %s. I play for %s with %d on my t-shirt. I'm %d age old and I earn %d PLN.\n",
                name, job, team, no, age, salary);
    }

    public static void job() {
        System.out.println("My job is " + job);
    }

}
