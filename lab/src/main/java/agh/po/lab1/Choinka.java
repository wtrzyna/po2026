package agh.po.lab1;

public class Choinka {
 public static void main(String[] args) {
	 
	 int licz = 1;
	 String tekst = "";
	 int dlugosc = 0;
 while(licz <= 10) {
 while (dlugosc != licz) {
	 tekst = tekst + "*";
	 dlugosc = dlugosc + 1;
 }
 System.out.println(tekst);
 licz = licz + 1;
 }
 }
}