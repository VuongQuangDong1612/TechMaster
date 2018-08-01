package Unit2;

import java.util.Scanner;

public class SinhVien {
}
abstract class SinhVienPoly{
    String hoten;
    public static String nganh;


    Scanner scn = new Scanner(System.in);
    public void setHoTen(){
        this.hoten = scn.nextLine();
    }
    public void setnganh(){
        this.nganh = scn.nextLine();
    }

    public abstract double getDiem();
    public String getHocLuc(){
        if(getDiem()<5.0){
            return "Học Lực Kém";
        }
        else if(getDiem()>=5.0 && getDiem()<6.5){
            return "Học lực trung bình";
        }
        else if(getDiem()>=6.5&& getDiem()<7.5){
            return "Học lực khá";
        }
        else if(getDiem()>7.5 && getDiem() <9){
            return "Học lực giỏi";
        }
        else {
            return "Học lực xuất sắc";
        }
    }
    public void xuat(){
        System.out.println("Họ tên sinh viên:"+ this.hoten);
        System.out.println("Ngành học " + this.nganh);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SinhVienIt sv1 = new SinhVienIt();
        System.out.println("Nhập ngành học:");
        sv1.setnganh();
        String pattern ="Biz";
        if(nganh.matches(pattern)){
            SinhVienBiz sv2 = new SinhVienBiz();
            System.out.println("Nhập họ tên: ");
            sv2.setHoTen();
            System.out.println("Nhập điểm: ");
            sv2.setMarketing();
            sv2.setSales();
            sv2.xuat();
            System.out.println("Điểm TB là: " + sv2.getDiem());
            System.out.println("Học lực: " +sv2.getHocLuc());

        }
        else {
            System.out.println("abc");
        }


    }
}

class SinhVienIt extends SinhVienPoly{
    double java;
    double html;
    double css;
    Scanner scn = new Scanner(System.in);
    public void setJava(){
        this.java = scn.nextDouble();
    }
    public void setHtml(){
        this.html = scn.nextDouble();
    }
    public void setCss(){
        this.css = scn.nextDouble();
    }

    @Override
    public double getDiem(){
        return  (2*this.java + this.html + this.css)/4;

    }
}

class SinhVienBiz extends SinhVienPoly{
    double marketing;
    double sales;
    public void setMarketing(){
        this.marketing = scn.nextDouble();
    }
    public void setSales(){
        this.sales = scn.nextDouble();
    }

    @Override
    public double getDiem(){
        return (2*this.marketing+this.sales)/3;
    }
}