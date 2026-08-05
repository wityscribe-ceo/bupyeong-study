package com.the.ex;

public class Java001 {

	public static final String EXPENSE__DATE = "2026년 7월 28일";
	public static final String EXPENSE1__CATEGORY = "전자 용품 (건전지 AA)";
	public static final String EXPENSE2__CATEGORY = "사무 기기 (무선 마우스)";
	public static final String EXPENSE3__CATEGORY = "연결 장치 (USB 케이블)";
	
	// 건전지 AA
	public static final int EXPENSE1_UNIT_PRICE = 1500;
	public static final int EXPENSE1_COUNT = 4;
	
   // 무선 마우스	
	public static final int EXPENSE2_UNIT_PRICE = 12000;
	public static final int EXPENSE2_COUNT = 1;
	
	// USB 케이블
	public static final int EXPENSE3_UNIT_PRICE = 3000;
	public static final int EXPENSE3_COUNT = 3;

	public static final boolean EXPENSE1_IS_ESSENTIAL = true;
	public static final boolean EXPENSE2_IS_ESSENTIAL = false;
	public static final boolean EXPENSE3_IS_ESSENTIAL = true;
	
	public static final int EXPENSE1_COST = EXPENSE1_UNIT_PRICE * EXPENSE1_COUNT;
	public static final int EXPENSE2_COST = EXPENSE2_UNIT_PRICE * EXPENSE2_COUNT;
	public static final int EXPENSE3_COST = EXPENSE3_UNIT_PRICE * EXPENSE3_COUNT;
	
	public static final int TOTAL_COST = EXPENSE1_COST + EXPENSE2_COST + EXPENSE3_COST;
	
    public static final double DAILY_BUDGET = 35000.0;
    public static final double REMAINING_BUDGET = DAILY_BUDGET - TOTAL_COST;
    public static final double PERCENT_USED = TOTAL_COST / DAILY_BUDGET * 100.0;
    public static final int ESSENTIAL_COST = EXPENSE1_COST + EXPENSE3_COST;

    public static final int ESSENTIAL_COUNT = 2;

    public static final int AVERAGE_ESSENTIAL_COST = ESSENTIAL_COST / ESSENTIAL_COUNT;


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println("==========================================");
	        System.out.println("     " + EXPENSE__DATE + " 가계부 지출 내역");
	        System.out.println("     (숫자, 논리값 상수 중심)");
	        System.out.println("==========================================");

	        System.out.println("1. [" + EXPENSE1__CATEGORY + "]");
	        System.out.println("  단가: " + EXPENSE1_UNIT_PRICE + "원");
	        System.out.println("  구매 개수: " + EXPENSE1_COUNT + "개");
	        System.out.println("  금액: " + EXPENSE1_COST + "원");
	        System.out.println("  필수 지출 여부: " + EXPENSE1_IS_ESSENTIAL);
	        System.out.println("------------------------------------------");

	        System.out.println("2. [" + EXPENSE2__CATEGORY + "]");
	        System.out.println("  단가: " + EXPENSE2_UNIT_PRICE + "원");
	        System.out.println("  구매 개수: " + EXPENSE2_COUNT + "개");
	        System.out.println("  금액: " + EXPENSE2_COST + "원");
	        System.out.println("  필수 지출 여부: " + EXPENSE2_IS_ESSENTIAL);
	        System.out.println("------------------------------------------");

	        System.out.println("3. [" + EXPENSE3__CATEGORY + "]");
	        System.out.println("  단가: " + EXPENSE3_UNIT_PRICE + "원");
	        System.out.println("  구매 개수: " + EXPENSE3_COUNT + "개");
	        System.out.println("  금액: " + EXPENSE3_COST + "원");
	        System.out.println("  필수 지출 여부: " + EXPENSE3_IS_ESSENTIAL);
	        System.out.println("------------------------------------------");

	        System.out.println("[총 지출 합계]");
	        System.out.println("총액: " + TOTAL_COST + "원");
	        System.out.println();
	
	   

		
		
	}

}
