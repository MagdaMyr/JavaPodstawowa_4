/*Workbook, str 76, cw przedostatnie
Korzystając z klasy oferującej operacje na dacie i czasie pobierz aktualny czas (godzinę, minutę i sekundę)
oraz wypisz te wartości używając znaków *, których liczba równa się danej wartości. Dla utrudnienia, w jednym
wierszu może być maksymalnie 10 znaków *.
Przykład dla wartości 15:03:28
 */

import java.time.LocalTime;
import java.time.ZoneId;

    public class DisplayTime {

        public static void main(String[] args) {

            LocalTime time = LocalTime.now(ZoneId.systemDefault());
            int hours = time.getHour();
            int minutes = time.getMinute();
            int seconds = time.getSecond();

            System.out.println("Aktualny czas: " + time.toString()
                    .substring(0, time.toString().lastIndexOf(".")));   //wycinamy milisekundy
            System.out.println(getDisplayTime("Godzina", hours));
            System.out.println(getDisplayTime("Minuta", minutes));
            System.out.println(getDisplayTime("Sekunda", seconds));
        }

        public static String getDisplayTime(String name, int counter) {
            StringBuilder strBuilder = new StringBuilder();
            strBuilder.append(name + ":\n");

            for(int i = 1; i <= counter; i++) {
                strBuilder.append("*");
                if(i % 10 == 0) {
                    strBuilder.append("\n");
                }
            }

            return strBuilder.toString();
        }

    }

