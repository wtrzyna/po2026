public class Choinka1 {
 public static void main(String[] args) {
	 String wejscie = args[0];
	 int wejscieINT = Integer.parseInt(wejscie);
	 int licz = 1;
	 String tekst = "";
	 int dlugosc = 0;
 while(licz <= wejscieINT) {
 while (dlugosc != licz) {
	 tekst = tekst + "*";
	 dlugosc = dlugosc + 1;
 }
 System.out.println(tekst);
 licz = licz + 1;
 }
 }
}