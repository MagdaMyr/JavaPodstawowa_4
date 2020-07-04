/* cw. 3, prezentacja OPP
Wzor na odleglosc miedzy punktami P1(x1, y1) i P2(x2, y2);
Math.sqrt - pierwiastek
Math.pow(a,b) - a do potęgi b
Kiedy klasa będzie gotowa, w metodzie main klasy Playground lub Runner, utworzyc kilka instancji punktów i policzyc
odleglosci miedzy nimi
*/
public class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void doSthWithOther(Point p) {
        System.out.printf("Moj punkt ma wsp.: (%d, %d)\n", this.x, this.y);
        System.out.printf("Przekazany punkt ma wsp.: (%d, %d)\n", p.getX(), p.getY());
    }

    public int[] getXY() {
        int[] tab = {x, y};
        return tab;
    }

    /*
    + Point() -> public Point() { } // konstruktor (bezargumentowy) klasy Point
    + Point(x:int, y:int) -> public Point(int x, int y) {...} //konstruktor z argumentami
    + getX():int -> public int getX() {...} //getter - zwraca wartosc pola x
    + setX(x:int):void -> public void setX(int x) //setter - ustawia wartosc pola x
    + toString():String -> public String toString() //generuje text z info o obiekcie, tutaj (x,y)
    + getXY():int[] -> public int[] getXY() //na podstawie x, y tworzy tablice i zwraca ja
    + setXY(x:int, y:int):void -> public void setXY(int x, int y) //ustawia wartosci pol na przekazane arg -> w ciele zalowac meteody setX, setY
    + distance(x:int, y:int):double -> public double distance(int x, int y)
    + distance(another:Point):double -> public double distance(Point another)
    + distance():double -> public double distance()
     */
}

