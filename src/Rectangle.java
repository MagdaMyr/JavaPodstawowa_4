// cw. 2 prezentacja OOP
public class Rectangle {

    //statyczna inicjalizacja pol
    private double a = 10, b = 10;
    String color = "red"; //package-private - dostepne w ramach pakietu
    public String otherPublicField = "Secret";  //pole publiczne - dostepne w calym projekcie

    //taka postac ma konstruktor domyslny
    //poniewaz wprowadzilismy konstruktor przeciazony (z argumentami)
    //to ten domyslny nie jest samoistnie dostarczany, musimy wiec napisac go sami
    public Rectangle() {
        //wartosci domyslne
    }

    public Rectangle(double a, double b) {
        setA(a);
        setB(b);
    }

    public Rectangle(double a, double b, String color) {
        //setA(a);    //korzystam z settera, ktory ma do tego logike - jak bedzie blad to mam do poprawienia tylko w jednym miejscu
        //this.b = b;
        this(a, b);
        this.color = color;
    }

    public double calcArea() {
        return a * b;
    }

    public double calcObw() {
        return 2 * (a + b);
    }

    public void hello() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("Prostokat o bokach %f x %f, koloru %s. Obwod = %f, pole = %f.\n",
                a, b, color, calcObw(), calcArea());
    }

    //alt + insert -> getter and setter
    public double getA() {
        return a;
    }

    //zalozmy, ze dozowlone sa tylko prostokaty o wymiarach dodatnich
    public void setA(double a) {
        if(a > 0)
            this.a = a;
        else
            System.out.println("Pole musi byc dodatnie!");
    }

    public void setB(double b) {
        if(b > 0)
            this.b = b;
        else
            System.out.println("Pole musi byc dodatnie!");
    }
}

