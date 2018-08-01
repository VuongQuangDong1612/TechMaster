package Unit2;

public class KiemTraChuoiDoiXung {
    public static void main(String[] args) {
        String str = "bbba";
        int firt =0;
        int last = str.length()-1;
        boolean check = true;
        while (firt<last) {
            if (str.charAt(firt) != str.charAt(last)) {
                check = false;
                break;
            }
            firt++;
            last--;
        }
        if(check==true){
            System.out.println("Đây là chuỗi đối xứng");
        }
        else {
            System.out.println("Đây không phải là chuỗi đối xứng");
        }

    }
}
