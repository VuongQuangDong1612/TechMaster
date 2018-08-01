package Unit2;

import java.util.Scanner;

public class CheckEmailPass {

    public static void check(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập email:");
        String email = scn.nextLine();
        System.out.println("NHâp password");
        String password = scn.nextLine();
        if (email==null||password==null){
            System.out.println("Không được để trống tên đăng nhập và mật khẩu");
        }
        else if (email.equals("abc@gmail.com") && password.equals("abc123")) {
            System.out.println("Không đúng tên đăng nhập và mật khẩu");
        }
        else{
            System.out.println("Đăng nhập thành công");
        }
    }

    public static void main(String[] args) {
        check();
    }
}
