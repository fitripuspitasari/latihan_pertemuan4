import java.util.Scanner;
public class lat3{
	public static void main(String[] args)
{
Scanner input = new Scanner (System.in);
int nilai;
System.out.print("Masukkan nilai = ");
nilai = input.nextInt();

//posisi if ebrjalan
if(nilai % 2 == 0){
System.out.println("Angka yang dimasukkan adalah Genap");
}
else
System.out.println("Angka yang dimasukkan adalah Ganjil");
}
}