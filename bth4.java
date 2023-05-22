package bth4;
import java.util.Scanner;
import java.util.ArrayList;
public class giaodich {
	private String magiaodich;
	private String Ngaygiaodich;
	private int dongia;
	private double thanhtien;
	private float dientich;
	Scanner sc = new Scanner(System.in);
public giaodich() {
	super();
}
public giaodich( String magiaodich , String Ngaygiaodich, int dongia, double thanhtien) {
	this.magiaodich = magiaodich;
	this.Ngaygiaodich = Ngaygiaodich;
	this.dongia = dongia;
	this.thanhtien = thanhtien;
}
public String getmagiaodich() {
	return magiaodich;
}
public void setmagiaodich(String magiaodich) {
	this.magiaodich = magiaodich;
}
public String setNgaygiaodich() {
	return Ngaygiaodich;
}
public void setNgaygiaodich(String Ngaygiaodich) {
	this.Ngaygiaodich = Ngaygiaodich;
}
	public int getdongia() {
		return dongia;
	}
	public void setdongia(int dongia) {
		this.dongia = dongia;
}
	public double getthanhtien() {
		return thanhtien;
	}
	public void setdongia(double thanhtien) {
		this.thanhtien = thanhtien;
}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public float getdientich() {
		return dientich;
	}
	public void setdientich(float dientich) {
		this.dientich = dientich;
	}
	public void nhap() {

		System.out.print(" Nhap ma giao dich ");
		magiaodich =sc.nextLine();
		System.out.print(" Nhap ngay giao dich ");
		Ngaygiaodich =sc.nextLine();
		System.out.print(" Nhap don gia ");
		dongia =sc.nextInt();
		System.out.print(" Nhap dientich  ");
		dientich =Float.parseFloat(sc.nextLine());
		
	}
	public String toString() {
		return " Ma giao dich" + this.magiaodich + "  Ngay giao dich " + this.Ngaygiaodich + " don gia"  + this.dongia 
				+ " dien tich "  + this.dientich; 
	}
	
}
public class Giaodichdat extends giaodich {
	private String loaidat;
	Scanner sc = new Scanner(System.in);
public Giaodichdat() {
	super();
}
public Giaodichdat( String magiaodich , String Ngaygiaodich, int dongia, double thanhtien, String loaidat) {
	super(magiaodich, Ngaygiaodich, dongia, thanhtien);
	this.loaidat = loaidat;
}
public String getloaidat() {
	return loaidat;
}
public void setloaidat(String loaidat) {
	this.loaidat = loaidat;
}
public void nhap() {
	super.nhap();
	System.out.print(" Nhap loai dat A ; B ; C  ");
	loaidat = sc.nextLine();
}
public String toString () {
	return super.toString() + " loai dat" +this.loaidat;
}
}
public class Giaodichnha extends giaodich{
	private String loainha;
	private String diachi;
	private int choose ;
	Scanner sc = new Scanner(System.in);
	public Giaodichnha() {
		super();
	}
public Giaodichnha( String magiaodich , String Ngaygiaodich, int dongia, double thanhtien, String loainha, String diachi) {
	super(magiaodich, Ngaygiaodich, dongia, thanhtien);
	this.loainha = loainha;
	this.diachi = diachi;
}
public String getloainha() {
	return loainha;
}
public void setloainha(String loainha) {
	this.loainha = loainha;
}
public String getdiachi() {
	return diachi;
}
public void setdiachi(String diachi) {
	this.diachi = diachi;
}
public int getchoose() {
	return choose;
}
public void setchoose(int choose) {
	this.choose = choose;
}
public void nhap() {
	
	System.out.print(" Nhap dia chi");
	diachi = sc.nextLine();
	System.out.print(" Nhap loai nha  1.thuong  2.cao cap ");
	choose = sc.nextInt();
	switch (choose) {
	case 1 :
		loainha = "cao cap";
		break;
	
    case 2 :
	  loainha = "thuong";
	  break;
	  default :
		  System.out.print(" ko hop le, nhap lai ");
		  break;
}
}
public String toString() {
	return super.toString() + "loai nha "+ this.loainha + " Dia chi nha " + this.diachi ;
}
}

public class Test {
 public static void main(String[] args) {
	 ArrayList<Giaodichnha> arrGiaodichnha = new ArrayList<>();
	 ArrayList<Giaodichdat> arrGiaodichdat = new ArrayList<>();
	 int soGiaodichdat =0 , soGiaodichnha = 0;
	 long tongTiengiaodichDat =0 ,tongTiengiaodichnha =0, TBthanhtiendat =0, Tbthanhtiennha =0;
	 Scanner sc = new Scanner(System.in);
	 System.out.print(" Nhap so giao dich dat");
	 soGiaodichdat = sc.nextInt();
	 System.out.print(" Nhap so giao dich nha");
	 soGiaodichnha = sc.nextInt();
 
 System.out.print(" Nhap thong tin giao dich dat");
 for( int i =0; i < soGiaodichdat; i++) {
		 System.out.print(" Nhap thong tin dat thu " + (i+1)); 
		 Giaodichdat gdDat = new Giaodichdat();
		 gdDat.nhap();
		 arrGiaodichdat.add(gdDat);
	 }
 System.out.print(" Nhap thong tin giao dich nha");
 for( int i =0; i < soGiaodichdat; i++) {
		 System.out.print(" Nhap thong tin nha thu " + (i+1)); 
		 Giaodichnha gdNha = new Giaodichnha();
		 gdNha.nhap();
		 arrGiaodichnha.add(gdNha);
	 }
 System.out.print("  thong tin cac giao dich dat");
 for( int i =0; i < arrGiaodichdat.size() ; i++) {
	 System.out.print(arrGiaodichdat.get(i).toString());
 }
 System.out.print("  thong tin cac giao dich nha");
 for( int i =0; i < arrGiaodichnha.size() ; i++) {
	 System.out.print(arrGiaodichnha.get(i).toString());
 }
 for( int i =0; i < arrGiaodichdat.size() ; i++) {
	 if(arrGiaodichdat.get(i).getloaidat().equalsIgnoreCase("A")) {
		 tongTiengiaodichDat += arrGiaodichdat.get(i).getdientich() * arrGiaodichdat.get(i).getdongia() * 1.5;
	 }else {
		 tongTiengiaodichDat += arrGiaodichdat.get(i).getdientich() * arrGiaodichdat.get(i).getdongia() ;
 }
	 TBthanhtiendat = tongTiengiaodichDat / (arrGiaodichdat.size());
	 System.out.print("  trung binh tien giao dich dat la    "    + TBthanhtiendat);
	 for( int a =0; a < arrGiaodichnha.size() ; a++) {
		 if(arrGiaodichdat.get(a).getloaidat().equalsIgnoreCase("thuong")) {
			 tongTiengiaodichnha += arrGiaodichnha.get(a).getdientich() * arrGiaodichnha.get(a).getdongia() ;
		 }else {
			 tongTiengiaodichnha += arrGiaodichdat.get(a).getdientich() * arrGiaodichnha.get(a).getdongia() * 0.9 ;
	 }
		 Tbthanhtiennha = tongTiengiaodichnha / (arrGiaodichnha.size());
 }
 }
 }
 
}
