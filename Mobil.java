// Muhammad Faiz Najmuddin
//255150707111013

public class Mobil {

private String noPlat;
private String warna;
private String manufaktur;
private double kecepatan;
 private double waktu;

 public void setNoPlat(String s) {
     noPlat = s;
 }

 public void setWarna(String s) {
     warna = s;
 }

 public void setManufaktur(String s) {
     manufaktur = s;
 }

 public void setKecepatan(double k) {
     kecepatan = rubahKecepatan(k);      
 }

 public void setWaktu(double w) {
     waktu = rubahSekon(w);
 }

 private double rubahSekon(double jam) {          
     return jam * 3600;
 }

 private double rubahKecepatan(double k) {      
     return k * 1000 / 3600;                
 } 

 public double hitungJarak() {
     return kecepatan * waktu;      
 }

 public void displayMessage() {                                      


System.out.println("Mobil anda adalah bermerek "+manufaktur);
System.out.println("mempunyai nomor plat "+noPlat);
System.out.println("serta memiliki warna "+warna);

     double jarak = hitungJarak()/1000;

     System.out.println("dan mampu menempuh jarak "+jarak+" km");
 }
}
