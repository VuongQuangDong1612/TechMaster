package Unit2;

import java.util.Scanner;

public class CheckTen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String ten = scn.nextLine();
        if(ten.length()>5){
            System.out.println("Tên hợp lệ");
        }
        else{
            System.out.println("Tên không hợp lệ");
        }
    }
}
