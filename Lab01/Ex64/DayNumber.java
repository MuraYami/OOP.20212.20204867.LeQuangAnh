package Ex64;
import java.util.*; 

public class DayNumber {
    static boolean isNum(String str) {
        String sNumberic = "1234567890";
        
        for (int i = 0; i < str.length(); i++) {
            if (sNumberic.indexOf(str.charAt(i)) == -1 ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();  
        list.add("January");
        list.add("Jan.");
        list.add("Jan");
        list.add("1");
        list.add("31");
        list.add("February");
        list.add("Feb.");
        list.add("Feb");
        list.add("2");
        list.add("28");
        list.add("March");
        list.add("Mar.");
        list.add("Mar");
        list.add("3");
        list.add("31");
        list.add("April");
        list.add("Apr.");
        list.add("Apr");
        list.add("4");
        list.add("30");
        list.add("May");
        list.add("May");
        list.add("May");
        list.add("5");
        list.add("31");
        list.add("June");
        list.add("June");
        list.add("Jun");
        list.add("6");
        list.add("30");
        list.add("July");
        list.add("July");
        list.add("Jul");
        list.add("7");
        list.add("31");
        list.add("August");
        list.add("Aug.");
        list.add("Aug");
        list.add("8");
        list.add("31");
        list.add("September");
        list.add("Sept.");
        list.add("Sep");
        list.add("9");
        list.add("30");
        list.add("October");
        list.add("Oct.");
        list.add("Oct");
        list.add("10");
        list.add("31");
        list.add("November");
        list.add("Nov.");
        list.add("Nov");
        list.add("11");
        list.add("30");
        list.add("December");
        list.add("Dec.");
        list.add("Dec");
        list.add("12");
        list.add("31");

        

        Scanner sc = new Scanner(System.in);
        System.out.println("Input month: ");
        String sMonth = sc.nextLine();
        while (list.contains(sMonth) == false) {
            System.out.println("Input month again: ");
            sMonth = sc.nextLine();
        }

        System.out.println("Input year: ");
        String sYear = sc.nextLine();
        boolean num = false ;
        num = isNum(sYear);
        while (num == false) {
            System.out.println("Input year again: ");
            sYear = sc.nextLine();
            num = isNum(sYear);
        }
        
        int iYear = Integer.parseInt(sYear);        
        
        int iMonth = ((list.indexOf(sMonth)) / 5 ) + 1;

        if (iMonth != 2) {
            System.out.println(list.get(iMonth* 5 - 1));
        } else {
            if (iYear % 400 == 0) {
                System.out.println(29);
            } else {
                if (iYear % 100 == 0) {
                    System.out.println(28);
                } else {
                    if (iYear % 4 == 0) {
                        System.out.println(29);
                    } else {
                        System.out.println(28);
                    }
                }
            }
        }
         

    }
}
