import java.util.Scanner;

public class L1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNum = Integer.parseInt(input.nextLine());
        String trueNum = "";
        for (int i = 0; i < lineNum; i++) {
            String selectLine = input.nextLine();
            //System.out.println(selectLine);
            String[] select = selectLine.split(" ");
            //System.out.println(select[0]);
            for (int j = 0; j < 4; j++) {
                //System.out.println(select[j]);
                String[] selectChoise = select[j].split("-");
                //System.out.println(selectChoise[1]);
                if (selectChoise[1].equals("T")) {
                    String ABCD = selectChoise[0];
                    if (selectChoise[0].equals("A")) {
                        trueNum += 1;
                    }
                    if (selectChoise[0].equals("B")) {
                        trueNum += 2;
                    }
                    if (selectChoise[0].equals("C")) {
                        trueNum += 3;
                    }
                    if (selectChoise[0].equals("D")) {
                        trueNum += 4;
                    }
                    break;
                }
            }
        }
        //System.out.println(lineNum);
        System.out.print(trueNum);
    }
}