package com.the.ex;

public class School07 {

	public static final String EXPENSE_DATE = "2026년 7월 28일";
	public static final String EXPENSE1_CATEGORY = "식비 (순댓국)";
	public static final String EXPENSE2_CATEGORY = "음료 (아메리카노)";
	public static final String EXPENSE3_CATEGORY = "교통비 (버스 왕복)";
	
	public static final int EXPENSE1_FOOD_UNIT_PRICE = 5500 ;
	public static final int EXPENSE1_FOOD_COUNT = 2 ;
	public static final int EXPENSE2_COFFEE_UNIT_PRICE = 4500;
	public static final int EXPENSE2_COFFEE_COUNT = 1;
	public static final int EXPENSE3_TRANSPORT_UNIT_PRICE = 1300;
	public static final int EXPENSE3_TRANSPORT_COUNT = 2 ;
	
	public static final boolean EXPENSE1_IS_ESSENTIAL = true;
	public static final boolean EXPENSE2_IS_ESSENTIAL = false;
	public static final boolean EXPENSE3_IS_ESSENTIAL = true;
	
	
	
	public static final int EXPENSE1_COST =
            EXPENSE1_FOOD_UNIT_PRICE * EXPENSE1_FOOD_COUNT;

    public static final int EXPENSE2_COST =
            EXPENSE2_COFFEE_UNIT_PRICE * EXPENSE2_COFFEE_COUNT;
  

    public static final int EXPENSE3_COST =
            EXPENSE3_TRANSPORT_UNIT_PRICE * EXPENSE3_TRANSPORT_COUNT;
    
    public static final int ESSENTIAL_COST = EXPENSE1_COST + EXPENSE3_COST ;
	
    public static final int TOTAL_COST = EXPENSE1_COST + EXPENSE2_COST + EXPENSE3_COST ;
    
	public static final double DAILY_BUDGET = 25000.0;
	public static final double REMAINING_BUDGET = DAILY_BUDGET- TOTAL_COST ;

	public static final double PERCENT_USED = TOTAL_COST / DAILY_BUDGET * 100.0; 
    
	public static final int ESSENTIAL_COUNT = 2;
	
	public static final int AVERAGE_ESSENTIAL_COST = ESSENTIAL_COST / ESSENTIAL_COUNT ;
	
    
    
	public static void main(String[] args) {

	System.out.println("  " + EXPENSE_DATE + "가계부 지출 내역");
	System.out.println("  (숫자, 논리값 상수중심)");
	System.out.println("------------------------------------------");
	System.out.println("1. [" + EXPENSE1_CATEGORY + "]");
	System.out.println("   단가 : " + EXPENSE1_FOOD_UNIT_PRICE + "원");
	System.out.println("  수량 : " + EXPENSE1_FOOD_COUNT + "개");
    System.out.println("  금액 : " + EXPENSE1_COST + "원");
    System.out.println("  필수 지출 여부 : " + EXPENSE1_IS_ESSENTIAL);
    System.out.println("------------------------------------------");

    System.out.println("2. [" + EXPENSE2_CATEGORY + "]");
    System.out.println("  단가 : " + EXPENSE2_COFFEE_UNIT_PRICE + "원");
    System.out.println("  수량 : " + EXPENSE2_COFFEE_COUNT + "개");
    System.out.println("  금액 : " + EXPENSE2_COST + "원");
    System.out.println("  필수 지출 여부 : " + EXPENSE2_IS_ESSENTIAL);
    System.out.println("------------------------------------------");

    System.out.println("3. [" + EXPENSE3_CATEGORY + "]");
    System.out.println("  단가 : " + EXPENSE3_TRANSPORT_UNIT_PRICE + "원");
    System.out.println("  수량 : " + EXPENSE3_TRANSPORT_COUNT + "회");
    System.out.println("  금액 : " + EXPENSE3_COST + "원");
    System.out.println("  필수 지출 여부 : " + EXPENSE3_IS_ESSENTIAL);
    System.out.println("------------------------------------------");

    System.out.println("[총 지출 합계]");
    System.out.println("총액 : " + TOTAL_COST + "원");

	
    System.out.println("      [예산 분석]");
    System.out.println(" 일일 예산:"+ DAILY_BUDGET + "원" );
    System.out.println(" 남은 잔액:" + REMAINING_BUDGET + "원" );
    System.out.println(" 예산 사용 비율:" + PERCENT_USED + "%" );
    
    System.out.println("[필수 지출 분석]");
    System.out.println("필수 지출 총액:" + ESSENTIAL_COST + "원" );
    System.out.println("필수 지출 평균:" + AVERAGE_ESSENTIAL_COST + "원" );
	
    
    
	}

}
