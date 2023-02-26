import java.util.Scanner;
import java.lang.Math;
 class HinhChuNhat{
    private double dai, rong;
    private Scanner input= new Scanner(System.in);
    public void nhap()
    {
        System.out.print("Nhập chiều dài: ");
        this.dai = input.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        this.rong = input.nextDouble();
    }
    public double Chuvi()
    {
        return (this.dai + this.rong)*2;
    }
    public double DienTich()
    {
        return this.dai * this.rong;
    }
    public void HienthiChuViVaDienTich()
    {
        System.out.println("Chu vi hình chữ nhật là: " + this.Chuvi());
        System.out.println("Diện tích hình chữ nhật là: " + this.DienTich());
    }
    public static void main(String[] args) {
        HinhChuNhat HCN = new HinhChuNhat();
        HCN.nhap();
        HCN.HienthiChuViVaDienTich();
    }
}