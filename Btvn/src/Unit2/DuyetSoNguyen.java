package Unit2;

public class DuyetSoNguyen {

    /*public static void main(String[] args) {
        int[] arr = {1, 3, 6, 0, 5, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                break;
            } else {
                System.out.println(arr[i]);
            }
        }
    }*/

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 0, 5, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                continue;
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}

    /*public static void main(String[] args) {
        String [] arr={"Nguyễn Thế Anh", "Vương Quảng Đông", "Đặng Mạnh Dũng "};
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }*/

