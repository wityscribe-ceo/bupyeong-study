
public class Java0729 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
        String name = "홍길동";
        int age = 29;
        double height = 170.1;

        
        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        System.out.println("키:" + height);
        
         * 
           덧셈 +
           int a = 5;
           int b = 3;
           int result = a + b;
         
        System.out.println(result);
        
        곱셈 *
        
        int a = 5;
        int b = 3;
        int result = a * b;
        System.out.println(result);
        
         // 나눈셈(/)
        
        int a  = 16;
        int b = 3;
        int result = a / b ;
        System.out.println(result);
        
        //나머지(%)
        
        int a = 11;
        int b = 4;
        int result = a % b ;
        
        System.out.println(result);

        
        // 같음(==)
        
        int a = 5;
        int b = 3;
        boolean result = (a == b);
        System.out.println(result);
        
        
        
        // 같지 않음 (!=)
        
        int a = 5;
        int b = 3;
        boolean result = (a !=b);    // true
        System.out.println(result);   
			
		크거나 같음 (>=):
		int a = 5;	
		int b = 3;	
		boolean result = (a >= b); // true
		System.out.println(result);

		작거나 같음 (<=):
		int a = 5;	
		int b = 3;	
		boolean result = (a <= b); // false
		System.out.println(result);

		크다 (>):
		int a = 5;	
		int b = 3;	
		boolean result = (a > b); // true
		System.out.println(result);

		작다 (<):
		int a = 5;	
		int b = 3;	
		boolean result = (a < b); // false
		System.out.println(result);

  		논리 곱(&&) and 연산자: 두조건이 true일때만 ture를 생성하는 연산자. 나머지는 false
		boolean a = true;	
		boolean b = false;	
		boolean result = (a && b); // false
		System.out.println(result);
		
		boolean a = true;	
		boolean b = true;	
		boolean result = (a && b); // true
		System.out.println(result);
		
		
		논리 합(||) or 연산자: 두 조건중 하나라도 true라면 true를 생성한다. 나머지는 false
		boolean a = true;	
		boolean b = false;	
		boolean result = (a || b); // true
		System.out.println(result);
		
		
		논리 부정(!):true를 false로 false를 true로 반전 한다.
		boolean a = true;	
		boolean result = !a; // false
		System.out.println(result);


		boolean a=(23 > 11); 
		boolean b=(23 < 11); 
		boolean result = a&&b ;
		System.out.println(result);
		System.out.println((23 > 11)||(23 < 11));

		대입 연산자(=):
		int a = 5;	
		int b = a;
		System.out.println(a);	
		System.out.println(b);

		덧셈 후 대입(+=):
		int a = 5;	
		a += 3; // a = a + 3;
		System.out.println(a);

		뺄셈 후 대입(-=):
		int a = 5;	
		a -= 3; // a = a - 3;
		System.out.println(a);

		곱셈 후 대입(*=):
		int a = 5;	
		a *= 3; // a = a * 3;
		System.out.println(a);

		나눗셈 후 대입(/=):
		int a = 5;	
		a /= 2; // a = a / 2;
		System.out.println(a);

		증가 연산자(++):변수의 값을 1씩 증가시킨다.
		int a = 5;	
		a++; // a = a + 1;	
		System.out.println(a);

		감소 연산자(--):변수의 값을 1씩 감소시킨다.
		int a = 5;	
		a--; // a = a - 1;	System.out.println(a);

		

		//전위 증가 연산자(++a):
		int a = 5;	
		int b = ++a; // a = a + 1, b = a;	
		System.out.println(a); 
		System.out.println(b); //6, 6


		//후위 증가 연산자(a++):
		int a = 5;	
		int b = a++; // b = a, a = a + 1;	
		System.out.println(a);  
		System.out.println(b); //6 5
		
		

        int a = 5;
        int b = 6;
        int sum = a + b ;
        a = 7 ; 
        b = 19 ;
        System.out.println(sum+","+a+","+b);
        sum = a + b ;
        System.out.println(sum+","+a+","+b);
        
        
        
        // AND(&&)  연결된  수식이 모두 true일때 true를 생성한다
           연결된 수식중 하나라도 false가 존재하면 false가 생성된다.

        
        int x = 5; 
        int y = 10;
        boolean result = (x > 0) && (y > 0);
        System.out.println(result);

        
        
        boolean isSunny = true;
        boolean hasUmbrella = true;
        boolean goingOutside = isSunny && hasUmbrella;
        System.out.println(goingOutside);
        
        boolean isRaining = true;
		boolean hasUmbrella = true;
		boolean isWorkday = false;
		boolean goOutside = isRaining && hasUmbrella && isWorkday;
		.out.println("Can I go outside? " + goOutside); 


        // OR(||) 연결된 수식중 하나라도 true가 있으면  true를 생성한다. 
        /// 연결된 수식이 모두 false일 때만 false를 생성한다.

		int age = 25; 
		boolean hasLicense = false;
		boolean canDrive = (age >= 18) || hasLicense;
		System.out.println(canDrive);  //true

		boolean isWeekend = false;    boolean isHoliday = false;
		boolean canRelax = isWeekend || isHoliday;
		System.out.println(canRelax);  // 출력: false


		int temperature = 30;
		boolean isSunny = true;
		boolean isWeekend = true;
		boolean goForSwim = (temperature > 25) || isSunny || isWeekend;
		System.out.println("Can I go for a swim? " + goForSwim);

		
//		NOT(!) 불리언 값을 반전 할때 사용한다. true는 false, false는 true를 생성한다.
		
		boolean isRaining = true;
		boolean notRaining = !isRaining;
		System.out.println(notRaining);

		boolean hasSubscription = false;    boolean canWatchMovie = !hasSubscription;
		System.out.println(canWatchMovie);  

	
		// 
		boolean isRaining = true;       boolean hasUmbrella = true;
		boolean isWorkday = false;
		boolean goOutside = (isRaining && hasUmbrella) || !isWorkday;
		System.out.println("Can I go outside? " + goOutside);

	
			
		// 증감 연산자 x++, ++x 는 x=x+1과 같다. x--,--x 는 x=x-1과 같다.
		
		a 앞뒤로 나오는것은 전에 먼저하냐 뒤에 먼저 하냐의 차이 
		
		int a=10; 
		a++;  
		a
		a= a+1
		System.out.println(a);  //11이 출력된다.

		int a=10; 
		a--;
		a
		a= a-1
		System.out.println(a);  //9이 출력된다.

		int a=10; 
		++a; 
		a=1+a
		a
		System.out.println(a);  //11이 출력된다.

		int a=10; 
		--a; 
		a=a-1
		a
		System.out.println(a);  //9이 출력된다.
		
		int a = 10 ; 
		System.out.println(a++); 
		System.out.println(a);   // 11, 10 출력이 된다.

		
		// 삼항 연산자 조건식) ? (식1) : (식2);  
		//조건식이 참이면 식1이 남고 조건식이 거짓이면 식2가 남는다.  
//		삼항연산자 : ;은 if 조건문과 비슷하다.
		
		a=true?1:0; //a=1   
		a=false?1:0;  //a=0  
		a=(11>6)?1:0; //a=1
		int b=5;	
		b=(false)?3+3:3+4; 	
		System.out.println(b); //7

		int number = 15;
		String result = (number >= 0) ? "양수" : "음수";
		System.out.println(number + "은(는) " + result + "입니다.");
*/
		
		

		
        
	}

}
