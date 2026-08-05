package Java.com.ex;
import java.util.Scanner;
public class Java0730_7 {

	public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	int total= 0;
	
	System.out.println("=================================");
	System.out.println("     간단 가계부 입력 프로그램     ");
	System.out.println("=================================");
	System.out.println("[1/3] 첫 번째 구매 내역을 입력합니다.");
	
	System.out.print(" 물품 이름 : ");
	String item1=scanner.nextLine();
	
	System.out.print("단가 (원): ");
	int item2=Integer.parseInt(scanner.nextLine());
	
	System.out.print("갯수 : ");
	int item3=Integer.parseInt(scanner.nextLine());
	
	int itemcost1 = item2 * item3;
	total += itemcost1;
	
	
	System.out.println("--------------------------------");
	
	System.out.print(" 물품 이름 : ");
	String item4=scanner.nextLine();
	
	System.out.print("단가 (원): ");
	int item5=Integer.parseInt(scanner.nextLine());
	
	System.out.print("갯수 : ");
	int item6=Integer.parseInt(scanner.nextLine());
	
	int itemcost2 = item5 * item6;
	total += itemcost2;
	
	
	System.out.println("--------------------------------");

	System.out.print(" 물품 이름 : ");
	String item7=scanner.nextLine();
	
	System.out.print("단가 (원): ");
	int item8=Integer.parseInt(scanner.nextLine());
	
	System.out.print("갯수 : ");
	int item9=Integer.parseInt(scanner.nextLine());
	
	int itemcost3 = item8 * item9;
	total += itemcost3;
	
	scanner.close(); 
	
	System.out.println("=================================");
	System.out.println("     << 가계부 요약 >>     ");
	System.out.println("=================================");
	System.out.printf("1.%s: %d원 (%d원 X %d개)\n",item1,itemcost1,item2,item3);
	System.out.printf("2.%s: %d원 (%d원 X %d개)\n",item4,itemcost2,item5,item6);
	System.out.printf("3.%s: %d원 (%d원 X %d개)\n",item7,itemcost3,item8,item9);
	System.out.println("--------------------------------");
	System.out.println("총 지출 합계: " + total + "원");
	System.out.println("=================================");
	
	
		
		
		
	}

}
