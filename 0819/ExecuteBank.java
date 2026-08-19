package com.the.ex;

import java.util.ArrayList;
import java.util.Scanner;
import com.the.dto.BankUser;
import com.the.en.LoginUserState;

public class ExecuteBank {
    
    // 프로그램 진행 상태값 저장
    public static LoginUserState loginUserState = LoginUserState.LOGOUT;
    
    // 로그인한 사용자 계정 정보
    public static BankUser loginUser = null;
    
    // admin 사용자 계정 정보
    public static BankUser adminUser = new BankUser("admin", "1111", 0);
    
    // 은행 사용자 유저 관리 ArrayList
    public static ArrayList<BankUser> bankUserList = new ArrayList<BankUser>();
    
    // 사용자 입력 처리를 위한 변수들
    public static Scanner sc = new Scanner(System.in);
    public static String inputId = null;
    public static String inputPw = null;
    public static double inputAccount = 0;

    public static void main(String[] args) {
        // 3명의 은행 사용자 등록
        bankUserList.add(new BankUser("user1", "user1", 0));
        bankUserList.add(new BankUser("user2", "user2", 0));
        bankUserList.add(new BankUser("user3", "user3", 0));

        // 은행 프로그램 메인 루프
        while (!loginUserState.equals(LoginUserState.EXIT)) {
            loginUserState = LoginUserState.LOGOUT;
            
            // 사용자로부터 id, pw 입력
            System.out.println("\n--------------------------------");
            System.out.println("id 입력 (종료를 원하면 exit 입력) >>");
            ExecuteBank.inputId = sc.nextLine();         
            
            // 1. exit 입력 확인 (비밀번호 입력 전에 빠르게 탈출)
            if (inputId.equals("exit")) {
                loginUserState = LoginUserState.EXIT;
                break;
            }
            
            System.out.println("pw 입력 >>");
            ExecuteBank.inputPw = sc.nextLine();

            // 2. USER_LOGIN인지 확인
            boolean isFlag = true;
            for (BankUser bankUser : bankUserList) {
                if (bankUser.equals(new BankUser(inputId, inputPw, 0))) {
                    System.out.println(bankUser + "님 로그인 하셨습니다.");
                    loginUserState = LoginUserState.USER_LOGIN;
                    ExecuteBank.loginUser = bankUser;
                    isFlag = false;
                    break;
                }
            }

            if (isFlag) {
                System.out.println("없는 유저입니다. 관리자로 확인해 보겠습니다.");
            }
                
            // 3. ADMIN_LOGIN인지 확인 (유저 로그인 실패 시에만 실행)
            if (!loginUserState.equals(LoginUserState.USER_LOGIN)) {
                if (ExecuteBank.adminUser.equals(new BankUser(inputId, inputPw, 0))) {
                    System.out.println("관리자 로그인 성공");
                    loginUserState = LoginUserState.ADMIN_LOGIN;
                } else {
                    System.out.println("관리자 로그인 실패. 다시 입력해 주세요.");
                }
            }

            // 4. 프로그램 상태에 따른 하위 메뉴 실행
            switch (loginUserState) {    
                case ADMIN_LOGIN:
                    // 관리자 메뉴 루프
                    boolean isAdmMenu = true;
                    while (isAdmMenu) {
                        System.out.println("\n--- [ 관리자 메뉴 작업 ] ---");
                        System.out.println("1.계정추가  2.계정삭제  3.id,pw변경  4.모든 사용자 출력  5.종료 >>");
                        String admChoice = sc.nextLine();
                        
                        switch (admChoice) {
                            case "1":
                                System.out.println("추가할 id 입력 >>");
                                inputId = sc.nextLine();            
                                System.out.println("추가할 pw 입력 >>");
                                inputPw = sc.nextLine();
                                bankUserList.add(new BankUser(inputId, inputPw, 0));
                                System.out.println("계정이 성공적으로 추가되었습니다.");
                                break;
                                
                            case "2":
                                System.out.println("삭제할 id 입력 >>");
                                inputId = sc.nextLine();            
                                System.out.println("삭제할 pw 입력 >>");
                                inputPw = sc.nextLine();
                                boolean removed = bankUserList.remove(new BankUser(inputId, inputPw, 0));
                                if (removed) {
                                    System.out.println("계정이 삭제되었습니다.");
                                } else {
                                    System.out.println("일치하는 계정이 없습니다.");
                                }
                                break;
                                
                            case "3":
                                BankUser preBankUser; // 변경 전 유저 객체
                                BankUser nextBankUser; // 변경 후 유저 객체
                                
                                System.out.println("변경 전 id 입력 >>");
                                inputId = sc.nextLine();            
                                System.out.println("변경 전 pw 입력 >>");
                                inputPw = sc.nextLine();
                                preBankUser = new BankUser(inputId, inputPw, 0);
                                
                                if (bankUserList.contains(preBankUser)) {
                                    int preUserIndex = bankUserList.indexOf(preBankUser);
                                    double currentAccount = bankUserList.get(preUserIndex).getAccount();
                                    
                                    System.out.println("변경 후 id 입력 >>");
                                    inputId = sc.nextLine();            
                                    System.out.println("변경 후 pw 입력 >>");
                                    inputPw = sc.nextLine();
                                    
                                    nextBankUser = new BankUser(inputId, inputPw, currentAccount);
                                    bankUserList.set(preUserIndex, nextBankUser);
                                    System.out.println("정보가 수정되었습니다.");
                                } else {
                                    System.out.println("변경 전 유저 정보를 잘못 입력했습니다.");
                                }
                                break;
                                
                            case "4":
                                System.out.println("=== 모든 사용자 출력 ===");
                                for (BankUser item : bankUserList) {
                                    System.out.println(item);
                                }
                                break;
                                
                            case "5":
                                isAdmMenu = false;
                                System.out.println("관리자 메뉴를 종료합니다.");
                                break;
                                
                            default:
                                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                                break;
                        }                
                    }
                    break;
                    
                case USER_LOGIN:
                    // 사용자 메뉴 루프
                    boolean isUseMenu = true;
                    while (isUseMenu) {
                        System.out.println("\n--- [ 사용자 메뉴 작업 ] ---");
                        System.out.println("1.입금  2.출금  3.잔액조회  4.종료 >>");
                        String userChoice = sc.nextLine();
                        
                        switch (userChoice) {
                            case "1":
                                System.out.println("입금액 입력 >>");
                                inputAccount = Double.parseDouble(sc.nextLine());
                                if (inputAccount <= 0) {
                                    System.out.println("0원 이하의 금액은 입금할 수 없습니다.");
                                    break;
                                }
                                loginUser.setAccount(loginUser.getAccount() + inputAccount);
                                System.out.println("입금 완료! 현재 잔액 정보: " + loginUser);
                                break;
                                
                            case "2":
                                System.out.println("출금액 입력 >>");
                                inputAccount = Double.parseDouble(sc.nextLine());
                                if (inputAccount <= 0) {
                                    System.out.println("0원 이하의 금액은 출금할 수 없습니다.");
                                    break;
                                }
                                if (loginUser.getAccount() < inputAccount) {
                                    System.out.println("잔액이 부족합니다! 현재 잔액: " + loginUser.getAccount() + "원");
                                } else {
                                    loginUser.setAccount(loginUser.getAccount() - inputAccount);
                                    System.out.println("출금 완료! 현재 잔액 정보: " + loginUser);
                                }
                                break;
                                
                            case "3":
                                System.out.println("=== 사용자 잔액 정보 ===");
                                System.out.println(loginUser);
                                break;
                                
                            case "4":
                                System.out.println("사용자 메뉴를 종료합니다.");
                                isUseMenu = false;
                                break;
                                
                            default:
                                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                                break;
                        }
                    }
                    break;            
                    
                case LOGOUT:
                    System.out.println("로그인 작업 실패, 다시 시도해 주세요.");
                    break;
                    
                case EXIT:
                    System.out.println("프로그램 종료");
                    break;
                    
                default:
                    System.out.println("알 수 없는 프로그램 상태");
                    loginUserState = LoginUserState.EXIT;
                    break;    
            }        
        } // while(마지막) 종료

        System.out.println("프로그램이 완전히 종료되었습니다.");
        sc.close();
    }
}