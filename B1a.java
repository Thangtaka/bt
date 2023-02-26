import java.util.Scanner;
class hinhtron {
   private float PI = 3.14f;
    private float r;
    private float chuvi;
    private float dientich;
 public void tinhdientich(){
    dientich = PI * r * r;
 }
 void nhapr(){
    System.out.println("nhap vao gia tri r: ");
    try(Scanner scanner = new Scanner(System.in)){
        //rest of your code
        this.r = scanner.nextFloat();

 }
    
 }
  public void tinhchuvi(){
     chuvi = PI * r ;
 }
 public float getchuvi(){
    return chuvi;
 }
 public float getdientich(){
    return dientich;
 }
}
 class Lopmain
{
    public static void main(String[] args){
        System.out.println("xuat du lieu cua hinh tron");
        hinhtron HinhTron = new hinhtron();
        HinhTron.nhapr();
        HinhTron.tinhchuvi();
        HinhTron.tinhdientich();
        float  chuvi = HinhTron.getchuvi();
        System.out.println("chu vi hinh tron la " + chuvi);
        float dientich = HinhTron.getdientich();
        System.out.println("dien tich hinh tron la " + dientich);
       

}
}
