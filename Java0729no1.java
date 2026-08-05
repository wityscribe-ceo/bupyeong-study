
public class Java0729no1 {

	public static void main(String[] args) {
	
		/*
	// 날짜 및 예산
	String expenseDate = "2026년 7월 29일";
	double dailyBudget = 25000.0;
	
//	 항목 1: 식비
	String category1 = "식비 (순댓국)";
	int unitPrice1 = 5500;
	int count1 = 2;
	boolean isEssential1 = true;
	int cost1 = unitPrice1 * count1;
	
//	 항목 2 음료
	String category2 = "음료 (아메리카노)";
	int unitPrice2 = 4500;
	int count2 = 1;
	boolean isEssential2 = false;
	int cost2 = unitPrice2 * count2;
	
//	 항목3 교통비
	String category3 = "교통비 (버스왕복)";
	int unitPrice3 = 1300;
	int count3 = 2;
	boolean isEssential3 = true;
	int cost3 = unitPrice3 * count3;
	
//	총 지출 및 예산 관련 변수 계산
	int totalCost = cost1 + cost2 + cost3;
	double remainingBydget = dailyBudget - totalCost;
	double percentUsed = totalCost / dailyBudget * 100.0;
	
		
		
		
	System.out.println("===============================================");
	System.out.println("           " + expenseDate + " 가계부 지출 내역");	
	System.out.println("            (변수를 활용한 구현)                   ");
	System.out.println("===============================================");
	System.out.println("1. [" + category1 + "]");
	System.out.println("     수량: " + count1 + "개" );
	System.out.println(" 금액 : " + cost1 + "원 (" + unitPrice1 + "원 X " + count1 + "개)");
	System.out.println("  필수 지출 여부: " + isEssential1);
	System.out.println("===============================================");
	System.out.println("2. [" + category2 + "]");
    System.out.println("  수량: " + count2 + "개");
    System.out.println("  금액: " + cost2 + "원 (" + unitPrice2 + "원 x " + count2 + "개)");
    System.out.println("  필수 지출 여부: " + isEssential2);
    System.out.println("===============================================");
    System.out.println("3. [" + category3 + "]");
    System.out.println("  수량: " + count3 + "개");
    System.out.println("  금액: " + cost3 + "원 (" + unitPrice3 + "원 x " + count3 + "개)");
    System.out.println("  필수 지출 여부: " + isEssential3);
    System.out.println("===============================================");
    System.out.println("[총 지출 합계]");
    System.out.println("총액: " + totalCost + "원");
    System.out.println("===============================================");
    System.out.println("\n[예산 분석]");
    System.out.printf("일일 예산: %.0f원%n", dailyBudget);
    System.out.printf("남은 잔액: %.0f원%n", remainingBydget);
    System.out.printf("예산 사용 비율: %.2f%%%n", percentUsed); 
    System.out.println("===============================================");
    
    
    
    
    
    
    // 문제 1 주말 여행 경비 정산 (실수형 변수 집중)
		
//	 여행날짜.
		
	String tripDate = "2026 7월 29일";
	
// 하루 여행 예산 한도
	double dailyLimit = 80000.0;
	
//	첫 번째 지출 항목 
	String expenseName1 = "숙소비";
	
//	숙소비 ( 실수형 )
	double expensePrice1 = 35500.50;
	
//	 두번째 지출 항목
	String expenseName2 = "주유비";
	
	double expensePrice2 = 25000.0;
	//	세번째 지출 항목
	String expenseName3 = "간식비";
	
//	간식비( 정수형으로 초기화 후 double 변수에 저장)
	double expensePrice3 = 12300;
	
	totalTripCost: 세 가지 경비를 모두 합산한 double 타입 변수를 정의하고 계산하세요.
budgetDifference: dailyLimit에서 totalTripCost를 뺀 예산과의 차액(double)을 계산하세요. 
(음수(-)가 나오면 예산 초과입니다.)
isOverBudget: 예산(dailyLimit)이 총 지출(totalTripCost)보다 
작거나 같은지 확인하는 boolean 변수를 정의하세요.

	
	double totalTripCost = expensePrice1 + expensePrice2 + expensePrice3 ;
	double budgetDifference = dailyLimit - totalTripCost ;
	boolean isOverBudget = dailyLimit <= totalTripCost ;
	
			
	System.out.println("===============================================");
	System.out.println("           " +   tripDate + " 주말 여행 경비 정산");	
	System.out.println("===============================================");
	System.out.println("- 숙소비 :" + expensePrice1 + "원");
	System.out.println("- 주유비 :" + expensePrice2 + "원");
	System.out.println("- 간식비 :" + expensePrice3 + "원");
	System.out.println("----------------------------------------------");
	System.out.println(" 총 지출 금액 :" + totalTripCost + "원");
	System.out.println(" 예산 한도 :" + dailyLimit + "원");
	System.out.println(" 남은(초과) 금액 :" + budgetDifference + "원");
	System.out.println(" 예산 초과 여부 :" + isOverBudget );
	
		
//		문제 2
/// 목표: 용돈(int) 변수를 정의하고, 지출이 발생할 때마다 
/// **변수의 값을 직접 변경(재할당)**하여 잔액을 실시간으로 추적하는 프로그램을 작성합니다.
1. 변수 선언 및 초기화 요구 사항
 monthlyAllowance: 100000으로 초기화된 int 타입 변수를 정의합니다. 
 (이 변수는 잔액 추적에 사용되므로 잔액으로 간주합니다.) 한달 용돈액 저장
dayCount: 1로 초기화된 int 타입 변수를 정의합니다. 일수 저장
2. 계산 및 출력 요구 사항
변수의 값을 재할당(=)하여 아래의 순서대로 지출 내역과 잔액을 출력하세요.
초기 상태 출력: 월초 용돈을 출력합니다.
지출 1 (서적 구매):
bookCost 변수에 15000을 저장합니다.
monthlyAllowance 변수에서 bookCost를 뺀 결과를 다시 monthlyAllowance에 재할당합니다.
dayCount를 2로 증가시키고 현재 날짜와 잔액을 출력합니다.
지출 2 (저녁 식사):dinnerCost 변수에 22500을 저장합니다.
monthlyAllowance 변수에서 dinnerCost를 뺀 결과를 다시 monthlyAllowance에 재할당합니다.
dayCount를 3으로 증가시키고 현재 날짜와 잔액을 출력합니다.

		
	int monthlyAllowance = 100000;
	int dayCount = 1;
	int bookCost = 15000;
	
	int monthlyAllowance1 = monthlyAllowance - bookCost; 
	int dayCount1 = 2;
	
	int dinnerCost = 22500;
	int monthlyAllowance2 = monthlyAllowance1 - dinnerCost;
	int dayCount2 = 3;
	
	System.out.println("===============================================");
	System.out.println("           [ 9월 용돈 사용 기록 ]                  ");	
	System.out.println("===============================================");
	System.out.println("초기 용돈 (1일차 잔액) :" + monthlyAllowance + "원");
	System.out.println(" --- 지 출 발 생 ---");
	System.out.println(" 2일차 지출 : 서적 구매 (-" + bookCost + ")원");
	System.out.println(" 현재 잔액 :" + monthlyAllowance1 + "원");
	System.out.println(" --- 지 출 발 생 ---");
	System.out.println(" 3일차 지출 : 저녁 식사 (-" + dinnerCost + ")원");
	System.out.println(" 현재 잔액 :" + monthlyAllowance2 + "원");
	System.out.println("===============================================");
	
	
		
	int a1 = (int)10000000000000000l;
	System.out.println(a1);
	double a2 = (int) 2.333341421341241243;
			System.out.println(a2);
	
			boolean b=Boolean.parseBoolean("true");
			System.out.println(b);
		
			String str1="11.11";
			double a=Double.parseDouble(str1);
			System.out.println(a);
	
		
		boolean b=true;
		int i =1;
		Short s=2;
		char c='a';
		float f=1.234f;
		Short s2=(Short)s+c;
		Short s3=(Short)s+s;
		char c2=(char)c+s;
		int i2=c+s;
		int i3=b+j;
		
			
		*/	
		
		
			
			
		
	}

}
