package Unit2;

import java.util.Scanner;

public class SwitchCase {
    /*public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập số:");
        int a = scn.nextInt();
        switch (a){
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            case 10:
                System.out.println("Mười");
                break;
        }
    }*/

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập điểm: ");
        String diem = scn.nextLine();
        switch(diem){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Nomarl");
                break;
            case "D":
                System.out.println("Bad");
                break;


        }
    }
}
