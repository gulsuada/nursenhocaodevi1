import java.util.Scanner;
public class VkeOdevi {
public static void main(String[] args) { 
 Scanner klavye = new Scanner(System.in);
System.out.println("boyunuzu metre cinsinden giriniz : ");
	double boy =klavye.nextDouble();
	System.out.println("Kilonuzu kg cinsinden giriniz : ");
	double kg = klavye.nextDouble();
	double VKE = (boy*boy)/kg;
	if(VKE<18.5)
	System.out.println("Zayıf");
	else if (VKE>=18.5 && VKE<=29.9) 
	System.out.println("Orta");
	else if(VKE>=25 && VKE<=29.9)
	System.out.println("Kilolu");
	System.out.println("boyunuzu metre cinsinden giriniz");
	double boy1 = klavye.nextDouble();
	System.out.println("Kilonuzu kg cinsinden giriniz : ");
	double kg1= klavye.nextDouble();
	double VKE2 = (boy1*boy1)/kg1;
	if (VKE2<18.5)
	System.out.println("Zayıf");
	else if (VKE2>=18.5 && VKE2<=29.9) 
	System.out.println("Orta");
	else if(VKE2>=25 && VKE2<=29.9)
	System.out.println("Kilolu");
	System.out.println("boyunuzu metre cinsinden giriniz : ");
	double boy2 = klavye.nextShort();
	System.out.println("Kilonuzu kg cinsinden giriniz : ");
	double kg2 = klavye.nextShort();
	double VKE3 = (boy2*boy2)/kg2;
	if (VKE3<18.5)
	System.out.println("Zayıf");
	else if (VKE3>=18.5 && VKE3<=29.9) 
	System.out.println("Orta");
	else if(VKE3>=25 && VKE3<=29.9)
	System.out.println("Kilolu");
}

	

}


}







	


