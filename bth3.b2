package buoi3.bai2;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public abstract class Hanghoa {
private int mahang;
private String tenhang;
private int soluongton;
private int dongia;
public Hanghoa(int mahang, String tenhang, int soluongton, int dongia ) {
   this.mahang = mahang;
   this.dongia = dongia;
   this.tenhang=tenhang;
   this.soluongton=soluongton;
}
public int getmahang() {
	return mahang;
}
public void setmahang(int mahang) {
	this.mahang = mahang;
}
public int getsoluongton() {
	return soluongton;
}
public void setsoluongton(int soluongton) {
	this.soluongton = soluongton;}
public int getdongia() {
		return dongia;
	}
public void setdongia(int dongia) {
		this.dongia = dongia;
	}
public String gettenhang() {
           return tenhang;
		}
public void setmahang(String tenhang) {
			this.tenhang = tenhang;
}
public abstract String tinhMucDoBanBuon();
@Override
public String toString() {
    return "Mã hàng: " + maHang + ", Tên hàng: " + tenHang + ", Số lượng tồn: " + soLuongTon + ", Đơn giá: " + donGia;
}
}

public class HangThucPham extends Hanghoa {
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(int mahang, String tenhang, int soluongton, int dongia,
                        LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
        super(mahang, tenhang, soluongton, dongia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    
    @Override
    public String tinhMucDoBanBuon() {
        if (getsoluongton() > 0 && ngayHetHan.isBefore(LocalDate.now())) {
            return "Mức độ bán buôn: Khó bán";
        }
		return "Không đánh giá";
    }

	
}
	public class HangSanhSu extends Hanghoa {
	    private String nhaSanXuat;
	    private LocalDate ngayNhapKho;

	    public HangSanhSu(int mahang, String tenhang, int soluongton, int dongia,
	                      String nhaSanXuat, LocalDate ngayNhapKho) {
	        super(mahang, tenhang, soluongton, dongia);
	        this.nhaSanXuat = nhaSanXuat;
	        this.ngayNhapKho = ngayNhapKho;
	    }

	    public String getNhaSanXuat() {
	        return nhaSanXuat;
	    }

	    public LocalDate getNgayNhapKho() {
	        return ngayNhapKho;
	    }

	    @Override
	    public String tinhMucDoBanBuon() {
	        if (getsoluongton() > 50 && LocalDate.now().minusDays(10).isAfter(ngayNhapKho)) {
	        	return "Bán được";
	        }
	        return "Không đánh giá";
	    }
	
}
public class HangDienMay extends Hanghoa {
    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(int mahang, String tenhang, int soluongton, int dongia, int thoiGianBaoHanh, double congSuat) {
        super(mahang, tenhang, soluongton, dongia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    
    public double getCongSuat() {
        return congSuat;
    }

    @Override
    public String tinhMucDoBanBuon() {
        if (getsoluongton() < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }

}
public class HangHoaManager {
    private List<Hanghoa> hangHoaList;

    public HangHoaManager() {
        hangHoaList = new ArrayList<>();
    }

    public void addHangHoa(Hanghoa hangHoa) {
        for (Hanghoa hh : hangHoaList) {}
        hangHoaList.add(hangHoa);
        System.out.println("Thêm hàng hóa thành công!");
    }

    public void printHangHoaList() {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-15s %-15s %-15s%n", "Mã hàng", "Tên hàng", "Số lượng tồn", "Đơn giá", "Mức độ bán buôn");
        System.out.println("-------------------------------------------------------------");

        for (Hanghoa hangHoa : hangHoaList) {
            int mahang = hangHoa.getmahang();
            String tenhang = hangHoa.gettenhang();
            int soluongton = hangHoa.getsoluongton();
            double dongia = hangHoa.getdongia();

            String mucDoBanBuon = hangHoa.tinhMucDoBanBuon(); 

            System.out.printf("%-10s %-20s %-15s %-15s %-15s%n", mahang, tenhang, soluongton, dongia, mucDoBanBuon);
        }

        System.out.println("-------------------------------------------------------------");
    }
}



