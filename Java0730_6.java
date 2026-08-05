package Java.com.ex;
import java.util.Scanner;
public class Java0730_6 {
	public final static int SNACK_PRICE=2500;
	public static void main(String[] args) {
		// 과자 가격이 2500일때 사용자가 돈을지불하면
		//과자 몇봉지와 거스름돈 얼마를 받아야하는지 출력하는 프로그램
		// purchaseCount 몇봉지 샀나
		// inputAmount   사용자가 지불한 총금액
		// change        잔돈
		
	// 사용자에게 과자 하나는 2500원 입니다. 얼마를 입금할 계획이신가요?
	// 내가 11000원 줄께 
	// 총 4봉지 구매 가능하고 잔돈은 1000원입니다.
		
	Scanner scanner=new Scanner(System.in);
	
	System.out.println(String.format(
	 "사용자에게 과자 하나는 %d원 입니다. 얼마를 입금할 계획이신가요?",
	 Java0730_6.SNACK_PRICE));
		
	int inputAmount = Integer.parseInt(scanner.nextLine());
	
	int purchaseCount = inputAmount / Java0730_6.SNACK_PRICE;
	
	int change= inputAmount%Java0730_6.SNACK_PRICE;
	System.out.println("총입금액"+inputAmount);
	System.out.println("최대 구매 한 갯수:" + purchaseCount);
	System.out.println("최대 구매후 잔돈:" + change);
	scanner.close();
	
	
	
	
	
	
	
	
	
	}

}
