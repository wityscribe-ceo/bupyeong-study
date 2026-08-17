package com.the.ex;
import java.util.Scanner;
// 출석 상태를 enum으로 정의
enum Java0313Ex2 {
   ATTENDANCE,
   ABSENCE,
   LATE,
   EARLY_LEAVE,
   OUTING,
   SICK_LEAVE,
   PUBLIC_LEAVE
}
public class Java0813Ex2 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Java0313Ex2[] students = new Java0313Ex2[10];// 예시로 10명의 학생을 관리
       boolean running = true;
       while (running) {
           // 메뉴 출력
           System.out.println("1. 전체 출석사항 출력");
           System.out.println("2. 학생 출결상태 변경");
           System.out.println("6. 프로그램 종료");
           System.out.print(">> ");
           String input = scanner.nextLine(); // 사용자 입력 받기
           switch (input) {
               case "1":
                   // 전체 출석사항 출력
                   System.out.println("전체 출석사항:");
                   for (int i = 0; i < students.length; i++) {
                       String statusDescription;
                       if (students[i] == null) {
                           statusDescription = "미입력";
                       } else {
                           switch (students[i]) {
                               case ATTENDANCE:
                                   statusDescription = "출석";
                                   break;
                               case ABSENCE:
                                   statusDescription = "결석";
                                   break;
                               case LATE:
                                   statusDescription = "지각";
                                   break;
                               case EARLY_LEAVE:
                                   statusDescription = "조퇴";
                                   break;
                               case OUTING:
                                   statusDescription = "외출";
                                   break;
                               case SICK_LEAVE:
                                   statusDescription = "병결";
                                   break;
                               case PUBLIC_LEAVE:
                                   statusDescription = "공결";
                                   break;
                               default:
                                   statusDescription = "알 수 없는 상태";
                                   break;
                           }
                       }
           System.out.println("학생 " + (i + 1) + "의 출석 상태: " + statusDescription);
                   }
                   break;
               case "2":
                   // 학생 출결상태 변경
                   System.out.print("학생 번호를 입력하세요 (1~10): ");
                   String studentInput = scanner.nextLine();
                   int studentNumber = Integer.parseInt(studentInput) - 1;
                   if (studentNumber >= 0 && studentNumber < students.length) {
                       System.out.println("변경할 상태를 선택하세요:");
                       System.out.println("0. 출석");
                       System.out.println("1. 결석");
                       System.out.println("2. 지각");
                       System.out.println("3. 조퇴");
                       System.out.println("4. 외출");
                       System.out.println("5. 병결");
                       System.out.println("6. 공결");
                       System.out.print(">> ");
                       String statusInput = scanner.nextLine();
                       int statusIndex = Integer.parseInt(statusInput);
              if (statusIndex >= 0 && statusIndex < Java0313Ex2.values().length) {
                      students[studentNumber] = Java0313Ex2.values()[statusIndex];
       System.out.println("학생 " + (studentNumber + 1) + "의 출석 상태가 변경되었습니다.");
                       } else {
                           System.out.println("잘못된 상태 번호입니다.");
                       }
                   } else {
                       System.out.println("잘못된 학생 번호입니다.");
                   }
                   break;
               case "6":
                   // 프로그램 종료
                   System.out.println("프로그램을 종료합니다.");
                   running = false;
                   break;
               default:
                   System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                   break;
           }
       }
       scanner.close();
   }
}
