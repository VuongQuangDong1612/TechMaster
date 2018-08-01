package Unit2;

public class KeThuaHcn {
    double rong;
    double dai;

    public KeThuaHcn(){

    }

    public KeThuaHcn(double rong, double dai){
        this.rong = rong;
        this.dai = dai;
    }
    public double getChuVi(){
        double cv = (this.dai + this.rong) *2;
        return cv;
    }

    public  double getDienTich(){
        double dt = this.dai * this.rong;
        return  dt;
    }

    public void xuat(){
        System.out.println("Thông số hình chữ nhật: ");
        System.out.printf("Chiều dài: %3.2f  -  Chiều rộng %3.2f\n",dai, rong);
        System.out.printf("Chu vi: %3.2f  -  Diện tích %3.2f",getChuVi(), getDienTich());
    }

    public static void main(String[] args) {
        KeThuaHcn hcn = new KeThuaHcn(5.5, 8.5);
        hcn.xuat();
        HinhVuong hv = new HinhVuong(5.6);
        hv.xuat();
    }


}

class HinhVuong extends KeThuaHcn{
    double canh;

    public HinhVuong(double canh){
        this.canh = canh;
    }

    @Override
    public double getChuVi(){
        return canh*4;
    }

    @Override
    public  double getDienTich(){
        return canh*canh;
    }


    @Override
    public void xuat(){
        System.out.println();
        System.out.println("Thông tin hình vuông:");
        System.out.printf("Độ dài cạnh: %3.2f",canh);
        System.out.println();
        System.out.printf("Chu vi: %3.2f  -  Diện tích %3.2f",getChuVi(), getDienTich());

    }



}



