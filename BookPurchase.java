package com.the.ex;

//

import com.the.dto.*;

public class BookPurchase {

	public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
		
	 PurchaseItem book1=new PurchaseItem();	
	 PurchaseItem book2=new PurchaseItem();
	 PurchaseItem book3=new PurchaseItem();
	 
	 System.out.println("1번째 책 입력");
	 System.out.print("책 이름:");
	 book1.name=sc.nextLine();
	System.out.println("단가(원):");
	 book1.price=Integer.parseInt(sc.nextLine());
	 System.out.println("수량:");
	 book1.quantity=Integer.parseInt(sc.nextLine());
	 
	 
	 System.out.println("2번째 책 입력");
	 System.out.print("책 이름:");
	 book2.name=sc.nextLine();
	System.out.println("단가(원):");
	 book2.price=Integer.parseInt(sc.nextLine());
	 System.out.println("수량:");
	 book2.quantity=Integer.parseInt(sc.nextLine());
	 
	 
	 System.out.println("3번째 책 입력");
	 System.out.print("책 이름:");
	 book3.name=sc.nextLine();
	System.out.println("단가(원):");
	 book3.price=Integer.parseInt(sc.nextLine());
	 System.out.println("수량:");
	 book3.quantity=Integer.parseInt(sc.nextLine());
	 
	 book1.cost=book1.price*book1.quantity;
	 book2.cost=book2.price*book2.quantity;
	 book3.cost=book3.price*book3.quantity;
	 
	 System.out.println(String.format("책이름은 %s,가격은 %d,구매권수는 %d, %d*%d권은 %d원 이고",
			 book1.name,book1.price,book1.quantity,book1.price,book1.quantity,book1.cost));
	 System.out.println(String.format("책이름은 %s,가격은 %d,구매권수는 %d, %d*%d권은 %d원 이며",
			 book2.name,book2.price,book2.quantity,book2.price,book2.quantity,book2.cost));
	 System.out.println(String.format("책이름은 %s,가격은 %d,구매권수는 %d, %d*%d권은 %d원 이다.",
			 book3.name,book3.price,book3.quantity,book3.price,book3.quantity,book3.cost));
	 
	 //구매한 총 구매액은 얼마인가?
	 int totalCost=book1.cost+book2.cost+book3.cost;
	 PurchaseItem.totalcost=totalCost;
	 System.out.println("총금액:" + PurchaseItem.totalcost);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
