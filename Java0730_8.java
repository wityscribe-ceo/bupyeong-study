package Java.com.ex;
import java.util.Scanner; 
public class Java0730_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	/*
	 * 
	 * 3자리 숫자를 입력하여 각자리의 숫자를 출력하시오. 
	힌트) %연산자와 /연산자를 이용하여 만들수 있다. 
	423를 100으로 나누면 몫은 4고 나머지는 23이다. 
	23를 10으로 나눈 몫은 2이고 나머지는 3이다. 
	ex)423를 입력하였다면 백의 자리:4 십의 자리:2 일의 자리:3 이 출력 되도록 만들어 보자.

	System.out.print("3자리 숫자를 입력하세요: ");
	int no1= Integer.parseInt(scanner.nextLine());
	
	int too= no1 / 100;
	int you= (no1 % 100)/10;
	int me= no1 % 10;
	
	System.out.printf("백의자리: %d  십의자리: %d  일의자리: %d 입니다." , too, you, me);
	
		
		
	//2. 두점을 입력 받아 두점의 거리를 구하는 프로그램을 만들어보자. 
	//두점의 거리를 구하는 방법을 웹에서 검색해보자.
	//힌트) Math.sqrt(25)=5 이다. x제곱은 x*x 이다.

	
	// 1. 첫 번째 점 A(x1, y1) 입력받기
    System.out.println("=== 첫 번째 점 A의 좌표 입력 ===");
    System.out.print("x1 좌표 입력>> ");
    double x1 = Double.parseDouble(scanner.nextLine());
    System.out.print("y1 좌표 입력>> ");
    double y1 = Double.parseDouble(scanner.nextLine());

    // 2. 두 번째 점 B(x2, y2) 입력받기
    System.out.println("\n=== 두 번째 점 B의 좌표 입력 ===");
    System.out.print("x2 좌표 입력>> ");
    double x2 = Double.parseDouble(scanner.nextLine());
    System.out.print("y2 좌표 입력>> ");
    double y2 = Double.parseDouble(scanner.nextLine());

    // 3. x축 거리 차이와 y축 거리 차이 계산
    double xDiff = x2 - x1;
    double yDiff = y2 - y1;

    // 4. 피타고라스 정리 적용 (x제곱은 x * x 방식 활용)
    // Math.sqrt() 괄호 안에 (x차이 * x차이) + (y차이 * y차이)를 넣어줍니다.
    double distance = Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));

    // 5. 결과 출력 (배운 printf와 줄바꿈 \n 활용)
    System.out.println("\n---------------------------------");
    System.out.printf("점 A(%.1f, %.1f)와 점 B(%.1f, %.1f) 사이의 거리\n", x1, y1, x2, y2);
    System.out.printf("➡️ 최종 거리: %.4f\n", distance);
    System.out.println("---------------------------------");

    scanner.close();
	
	3. 세로와 가로를 입력 받아 사각형의 넓이를 만드는 순서도와 프로그램을 만들어 보자.
	
	System.out.print("가로 값 입력:");
	double y1= Double.parseDouble(scanner.nextLine());
	System.out.print("세로 값 입력:");
	double y2= Double.parseDouble(scanner.nextLine());
	double y3= y1* y2;
	System.out.printf("넓이는: %f 입니다.",y3);
	
	4. 세로 가로 높이를 입력 받아 사각기둥의 부피를 만드는 순서도와 프로그램을 만들어 보자.
	
	System.out.print("가로 값 입력:");
	double y1= Double.parseDouble(scanner.nextLine());
	System.out.print("세로 값 입력:");
	double y2= Double.parseDouble(scanner.nextLine());
	System.out.print("높이 값 입력:");
	double y3= Double.parseDouble(scanner.nextLine());
	
	double y4= (y1* y2)*y3;
	System.out.printf("부피값은: %f 입니다.",y4);
	
	//5. a 센치미터가 몇 미터 몇 센치인지 출력하는 프로그램을 구현 하시오. 100cm=1m

	*/
	
	
	System.out.print("센치미터를 입력하세요: ");
	int no1= Integer.parseInt(scanner.nextLine());
	
	int too= no1 / 100;
	int you= (no1 % 100)/1;
	
	
	System.out.printf(" %d 미터  %d 센치 입니다." , too, you);
	
	
	
	
	
	
	}

}
