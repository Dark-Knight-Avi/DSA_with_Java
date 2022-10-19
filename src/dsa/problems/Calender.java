package dsa.problems;

public class Calender {
    public static void main(String[] args) {
        String[] arr = {"M", "T.", "W.", "TH.", "F.", "S.", "S"};
        String[][] days = new String[6][7];
        days[0][0] = "30";
        days[0][1] = "31";
        days[0][2] = "  ";
        days[0][3] = "  ";
        days[0][4] = "  ";
        days[0][5] = "  ";
        days[0][6] = "  ";
        int day = 23;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                days[i][j] = String.valueOf(day++);
            }
            day = day - 14;
        }
        days[5][6] = "1 ";
        days[5][5] = "  ";
        days[5][4] = "  ";
        days[5][3] = "  ";
        days[5][2] = "  ";
        days[5][1] = "  ";
        days[5][0] = "  ";
        for (String i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        for (String[] str: days){
            for (String s: str){
                if (s.length() == 2){
                    System.out.print(s + " ");
                } else {
                    System.out.print(s + "  ");
                }
            }
            System.out.println();
        }
    }
}