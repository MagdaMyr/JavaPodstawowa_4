import java.awt.*;

public class Playground {

    public static void main(String[] args) {
        /*SoccerPlayer.job();
        SoccerPlayer sp = new SoccerPlayer("Robert Lewandowski", "Bayern Munchen", 11, 29, 700000);
        sp.hello();
        SoccerPlayer.job();
        SoccerPlayer.job = "Programmer";
        sp.hello();
        SoccerPlayer sp2 = new SoccerPlayer("Robert Lewandowski nr 2", "Bayern Munchen", 11, 29, 700000);
        sp2.hello();*/

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(-2.0, 3.0, "blue");
        Rectangle r3 = new Rectangle(4.0, 2.0, "green");
        Rectangle r4 = new Rectangle(1.0, 3.0, "black");

        Rectangle[] rectangles = {r1, r2, r3, r4};

        for(Rectangle r : rectangles) {
            r.hello();
        }

        System.out.println("Kolor prostokata r1: " + r1.color);

        r1.setA(-100);
        r1.hello();

        System.out.println(r1); //r1.toString()
    }

}
