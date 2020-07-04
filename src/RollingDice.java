public class RollingDice {

    String name;

    public RollingDice(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hi, I'm " + name;
    }

    public static void main(String[] args) {
        int no = rollTheDice();

        if(no % 2 == 0)
            System.out.println("Wynik parzysty: " + no);
        else
            System.out.println("Wynik nieparzysty: " + no);

        if(no == 6)
            System.out.println("WYGRALES!");
    }

    public static int rollTheDice() {
        return (int) (Math.random() * 6) + 1;   //1...6 -> Math.random = <0.0, 1.0) -> (int)5.(9) -> 5
    }

}
