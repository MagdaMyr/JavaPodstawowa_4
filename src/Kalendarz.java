/*//Workbook, ostatnie zad str 76
 Strona z kalendarza dla miesiąca stycznia, gdzie 1 stycznia wypada w środę, dla aktualnej daty 16 stycznia
 może wyglądać jak poniżej:

 wyświetl powyższą stronę używając pętli oraz dodatkowych instrukcji ◦ dostosuj kod, by 1 stycznia mógł wypadać
 dowolnego dnia tygodnia ◦ pobierz dane (korzystając z klasy oferującej operacje na dacie i czasie) o aktualnej dacie
 i wyświetl dla niej stronę z kalendarza
 */
/**
 * 1. Wyswietlic naglowek (dni + 'rozdzielenie')
 * 2. Okreslic, w jakim dniu wypada 1wszy dzien danego miesiaca - uzyc cw2 z pracy domowej
 * 3. W styczniu jest 31 dni - zawsze. - dodatkowo: uzyc kodu na rok przestepny aby okreslic czy w lutym 28 albo 29 dni
 * 4. Nowa linia stawiana zawsze po niedzieli.
 * 5. Musimy oznaczyc w [ ] aktualna date
 **/

public class Kalendarz {

    public static void main(String[] args) {
        System.out.println(getHeader());
        System.out.println(getCalendar(31, 2, 16));
    }

    public static String getHeader() {
        return " Pn Wt Sr Cz Pt Sb Nd \n----------------------";
    }

    /**
     *
     * @param daysNo - total number of days on this calendar sheet (e.g. January - 31)
     * @param startingDay - number of starting day, convention: Mon - 0, Tue - 1 etc.
     * @param today - number of this day (e.g. 16)
     * @return
     */
    public static String getCalendar(int daysNo, int startingDay, int today) {
        StringBuilder strBuilder = new StringBuilder();

        int currentNumberOfDay = 1;
        int calendarLineNo = 0;

        do {
            //np dla calendarLineNo = 0: i = 0; i < 7
            //np. dla calendarLineNo = 1: i = 7; i < 14
            for (int i = (7 * calendarLineNo); i < 7 + (7 * calendarLineNo); i++) {
                if(i >= startingDay && i <= daysNo + 1) {
                    if(currentNumberOfDay < 10) {   //jezeli numer dnia jest 1-cyfrowy
                        if(currentNumberOfDay == today) {
                            strBuilder.append(" [" + currentNumberOfDay + "]");
                        }
                        else {
                            if(currentNumberOfDay - 1 == today) {
                                strBuilder.append(" " + currentNumberOfDay);
                            }
                            else {
                                strBuilder.append("  " + currentNumberOfDay);
                            }                        }
                    }
                    else {  //jezeli numer dnia jest 2-cyfrowy
                        if(currentNumberOfDay == today) {
                            strBuilder.append("[" + currentNumberOfDay + "]");
                        }
                        else {
                            if(currentNumberOfDay - 1 == today) {
                                strBuilder.append("" + currentNumberOfDay);
                            }
                            else {
                                strBuilder.append(" " + currentNumberOfDay);
                            }
                        }
                    }

                    currentNumberOfDay++;
                } else {
                    strBuilder.append("   ");
                }
            }
            strBuilder.append("\n");
            calendarLineNo++;
            if(currentNumberOfDay == daysNo) {
                currentNumberOfDay++;
            }
        }
        while(currentNumberOfDay <= daysNo);

        return strBuilder.toString();
    }

}
