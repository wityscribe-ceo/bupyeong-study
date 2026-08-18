package com.the.ex;

// 1. Car 클래스 구현 (모든 필드 public)
class Car {
    public String model; // 외부에서 자유롭게 읽고 변경 가능
    public int speed = 0;

    // 생성자
    public Car(String model) {
        this.model = model;
    }

    public void statement() {
        System.out.println("현재 차종: " + this.model + " --- 속력은 " + this.speed + "입니다.");
    }

    public void speedUp() {
        this.speed += 10;
    }

    public void speedDown() {
        this.speed -= 10;
    }
}

// 2. CellPhone 클래스 구현 (모든 필드 public)
class CellPhone {
    public String ownerName;   
    public String ownerNumber; 
    public String targetName;
    public String targetNumber;
    public String message;

    // 생성자
    public CellPhone(String ownerName, String ownerNumber) {
        this.ownerName = ownerName;
        this.ownerNumber = ownerNumber;
    }

    public void sendInput(String targetName, String targetNumber, String message) {
        this.targetName = targetName;
        this.targetNumber = targetNumber;
        this.message = message;
    }

    public void sendInput(String targetName, String targetNumber) {
        this.targetName = targetName;
        this.targetNumber = targetNumber;
        this.message = ""; 
    }

    public void sendMsgButton() {
        System.out.println("[" + this.ownerName + "의 폰] " + this.targetName + "(" + this.targetNumber + ")에게 메시지 전송: " + this.message);
    }

    public void sendButton() {
        System.out.println("[" + this.ownerName + "의 폰] " + this.targetName + "(" + this.targetNumber + ")에게 전화를 겁니다.");
    }
}

// 3. 메인 실행 클래스
public class Java0818Ex7 {
    public static void main(String[] args) {
        // --- Car 클래스 테스트 ---
        System.out.println("=== Car 클래스 동작 ===");
        Car c1 = new Car("소나타");
        c1.statement();    
        c1.speedUp();      
        c1.speedUp();      
        c1.statement();    
        
        // [public 활용 예시] 메서드를 안 쓰고 외부에서 속도를 직접 조작할 수 있습니다.
        c1.speed = 150; 
        c1.model = "그랜저"; // 차종도 중간에 직접 변경 가능
        System.out.println("[강제변경 후] 차종: " + c1.model + ", 속도: " + c1.speed);
        
        System.out.println();

        // --- CellPhone 클래스 테스트 ---
        System.out.println("=== CellPhone 클래스 동작 ===");
        CellPhone phone = new CellPhone("홍길동", "010-1111-1111");
        
        phone.sendInput("홍길남", "010-2222-2222", "안녕");
        phone.sendMsgButton();
        
        // [public 활용 예시] sendInput 메서드를 거치지 않고 직접 값을 대입할 수 있습니다.
        phone.targetName = "이순신";
        phone.targetNumber = "010-3333-3333";
        phone.sendButton();
    }
}
