/* Workboook, cw 2gie, str 88 (licznik)
Dana jest tablica przechowująca nominały pieniędzy:...
oraz przykład kodu, który losuje jeden z indexów tej tablicy:
Napisz program, który:
◦ będzie w pętli losowo pobierał wartość aż "uzbiera" wartość 100 ◦ każda pobrana wartość ma być wyświetlona
◦ każda składowa suma ma być wyświetlona
◦ na koniec ma być wyświetlona liczba pobrań pieniędzy koniecznych do uzbierania 100 oraz uzbierana suma
(bo może przekroczyć 100)
◦ spróbuj zmodyfikować ten program, tak by pozwalał uzbierać dokładnie zadaną kwotę (nie pozwalał na jej przekroczenie)
 */

public class MoneyArrays {

    private static final int[] MONEY = {1, 2, 5, 10, 20};

    public static void main(String[] args) {

        System.out.println(getRandom(100));
    }

    //losuj z tablicy az uzbierasz rowna wartosc, np 100
    public static String getRandom(int value) {
        StringBuilder strBuilder = new StringBuilder();
        int sum = 0;
        int itNum = 0;
        boolean isEqualToValue = false;
        do {
            if(sum > value) {
                sum = 0;
                strBuilder = new StringBuilder();   //clear/empty StringBuilder
                itNum++;
            }
            int money = getRandomMoney();
            strBuilder.append(sum + " + " + money + " = ");
            sum += money;
            strBuilder.append(sum + "\n");
            if(sum == value) {
                isEqualToValue = true;
            }
        }
        while(!isEqualToValue);

        strBuilder.append("KONIEC. Zrealizowane po liczbie iteracji: " + itNum);
        return strBuilder.toString();
    }

    public static int getRandomIdx() {
        return (int)(Math.random() * MONEY.length);
    }

    public static int getRandomMoney() {
        return MONEY[getRandomIdx()];
    }

}

