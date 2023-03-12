import java.util.Scanner;

public class HinhChuNhat {
    protected int chieuDai, chieuRong;
 
    public HinhChuNhat(int chieuDai, int chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
 
    public int tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }
     
    public int tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
public class HinhVuong extends HinhChuNhat {
 
    // hình vuông là một trường hợp đặc biệt của hình chữ nhật (chiều dài = chiều rộng)
    public HinhVuong(int a) {
        chieuDai = chieuRong = a;
    }
     
}
public class Main {
 
    public static void main(String[] args) {
        int canh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh hình vuông: ");
        canh = scanner.nextInt();
         
        HinhVuong hinhVuong = new HinhVuong(canh);  
        System.out.println("Chu vi hình vuông = " + hinhVuong.tinhChuVi());
        System.out.println("Diện tích hình vuông = " + hinhVuong.tinhDienTich());
    }
 
}
