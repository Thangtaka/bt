package buoi2.th2;
import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
private int soTK;
private String tenTK;
private double sotien;
private String trangthai;

Scanner sc = new Scanner(System.in);
public Account() {
}

public Account(int soTK, String tenTK, double sotien, String trangthai) {
this.soTK = soTK;
this.tenTK = tenTK;
this.sotien = sotien;
this.trangthai = trangthai;
}
public int getsoTK() {
return this.soTK;
}

public void setSoTK(int soTK) {
this.soTK = soTK;
}

public String gettenTK() {
return this.tenTK;
}

public void setTenTK(String tenTK) {
this.tenTK = tenTK;
}
public String gettrangthai() {
 return this.trangthai;
}
public void settrangthai( String trangthai) {
	this.trangthai = trangthai;
}
public double getsotien() {
return this.sotien;
}

public void setSoTienTrongTK(double sotien) {
this.sotien = sotien;
}

@Override
public String toString() {
NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
String str1 = currencyEN.format(sotien);
return soTK + "-" + tenTK + "-" + str1;
}
public double napTien() {
double nap;
System.out.print("Nhập số tiền bạn cần nạp: ");
nap = sc.nextDouble();
if (nap >= 0) {
sotien = nap + sotien;
NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
String str1 = currencyEN.format(nap);
System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
} else {
System.out.println("Số tiền nạp vào không hợp lệ!");
}
return nap;
}

public double rutTien() {
double phi = 5;
double rut;
System.out.print("Nhập số tiền bạn cần rút: ");
rut = sc.nextDouble();
if (rut <= (sotien - phi)) {
sotien = sotien - (rut + phi);
NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
String str1 = currencyEN.format(rut);
System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là $5.");
} else {
System.out.println("Số tiền muốn rút không hợp lệ!");
return rutTien();
}
return rut;
}
public double tinhtienlaisuat() {
double laiSuat = 0.035;
sotien = sotien + sotien * laiSuat;
NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
String str1 = currencyEN.format(sotien);
System.out.println("Bạn vừa được " + str1 + " từ lai suat 1 tháng");
return sotien;
}

void inTK() {
NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
String str1 = currencyEN.format(sotien);
System.out.printf("%-10d %-20s %-20s %-20s \n", soTK, tenTK,trangthai, str1);
}
}
public class Main {
static Scanner sc = new Scanner(System.in);
static void nhapTK(Account tk) {
System.out.println("Nhập số tài khoản: ");
tk.setSoTK(sc.nextInt());
sc.nextLine();
System.out.println("Nhập tên tài khoản: ");
tk.setTenTK(sc.nextLine());
tk.setSoTienTrongTK(50);
}
public static void main(String[] args) {
Account a[] = null;
int k, b, n = 0;
long s, d, c, f;
boolean flag = true;
do{
System.out.println("Bạn chọn làm gì: ");
System.out.println("1.Thêm thông tin của các khách hàng\n"
+ "2.Xuất danh sách thông tin của các khách hàng\n" + "3.Nạp tiền\n" + "4.Rút tiền\n"
+ "5.tinh lai suat sau 1 thang \n" + "6.Chuyển khoản\n" + "Số khác để thoát");
b = sc.nextInt();
switch (b) {
case 1:
System.out.println("Nhập số lượng khách hàng bạn muốn nhập: ");
n = sc.nextInt();
a = new Account[n];
for (int i = 0; i < n; i++) {
	System.out.println("Khách hàng số: " + (i+1));
a[i] = new Account();
nhapTK(a[i]);
}
break;
case 2:
System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "Số tiền trong TK");
for (int i = 0; i < n; i++) {
a[i].inTK();
}
break;
case 3:
System.out.println("Nhập số tài khoản khách hàng cần nạp tiền: ");
s = sc.nextLong();
for (int i = 0; i < n; i++) {
d = a[i].getsoTK();
if (s == d) {
System.out.println("Bạn chọn tài khoản: " + d);
a[i].napTien();
} else {
System.out.println("");
  }
}
break;
case 4:
System.out.println("Nhập số tài khoản khách hàng cần rút tiền: ");
s = sc.nextLong();
for (int i = 0; i < n; i++) {
d = a[i].getsoTK();
if (s == d) {
System.out.println("Bạn chọn tài khoản: " + d);
a[i].rutTien();
 }
}
break;
case 5:
System.out.println("Nhập số tài khoản khách hàng cần tinh lai suat: ");
s = sc.nextLong();
for (int i = 0; i < n; i++) {
d = a[i].getsoTK();
if (s == d) {
System.out.println("Bạn chọn tài khoản: " + d);
a[i].tinhtienlaisuat();} 
else {
	System.out.println("");
	}
}
break;
case 6:
double chuyen,nhan,tienChuyen;
System.out.print("Nhập số tài khoản khách hàng chuyển tiền: ");
s = sc.nextLong();
System.out.print("Nhập số tài khoản khách hàng nhận tiền: ");
c = sc.nextLong();
for (int i = 0; i < n; i++) {
d = a[i].getsoTK();
if (s == d) {
chuyen = a[i].getsotien();
for (int j = 0; j < n; j++) {
f = a[j].getsoTK();
if (c == f) {
nhan = a[j].getsotien();
System.out.println("Nhập số tiền cần chuyển");
tienChuyen = sc.nextDouble();
if (tienChuyen <= chuyen) {
chuyen = chuyen - tienChuyen;
nhan = nhan + tienChuyen;
a[i].setSoTienTrongTK(chuyen);
a[j].setSoTienTrongTK(nhan);
System.out.println("Tài khoản số " + d + " vừa chuyển: $" + tienChuyen);
System.out.println("Tài khoản số " + f + " vừa nhận: $" + tienChuyen);
}else{
System.out.println("Số tiền nhập không hợp lệ!");}
} else {
System.out.println("");
}
}
} else {
System.out.println("");
}
}
break;
default:
System.out.println("Bye!!");
flag = false;
break;
}
} while (flag);
}
}


