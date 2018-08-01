package Unit2;

public class InSoLe {
    public static void main(String[] args) {
        for(int i=0; i<=100000; i++){
            if(i%2==0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
