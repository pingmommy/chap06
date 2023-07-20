package com.example.ex20;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100]; // 현재 null 값이 입력됨. 
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run= false;
			}
			
		}
		System.out.println("end");
		
	}
	//계좌생성
	private static void createAccount() {
		System.out.println("계좌생성");
		System.out.println("계좌번호");
		String ano=scanner.next();
		System.out.println("계좌주");
		String owner =scanner.next();
		System.out.println("초기입금액: ");
		int money =scanner.nextInt();
		
		Account account = new Account(ano, owner, money);
		boolean isCreate = false; // 생성못했다
		for(int i =0; i<accountArray.length; i++) {
			if(accountArray[i] ==null) {
				accountArray[i]=account;
				isCreate=true;
				System.out.println("결과: 계좌가 생성됨.");
				break;
			}
			//if(isCreate)
				//System.out.println("결과: 계좌가 생성됨.");
		//	else
				//System.out.println("결과: 계좌생성실패");
		}


	}
	//계좌목록보기
	private static void accountList() {
		
		for(int i =0; i<accountArray.length; i++) {
			if(accountArray[i] ==null) {
				break;
			}
			Account account = accountArray[i];
			System.out.printf("%10s %10s %10d\n", account.getAno(),account.getOwner(),account.getBalance());
			}
	}
    //예금하기
	private static void deposit() {	
		System.out.println("=========");
		System.out.println("예금");
		System.out.print("계좌번호:");
		String ano=scanner.next();
		System.out.print("예금액:");
		int money =scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account ==null) {
			System.out.println("해당계좌가 없습니다. ");
			return; 
		}
		account.setBalance(account.getBalance()+money);
		System.out.println("결과: 해당금액을 예금했습니다.");
		System.out.println("잔고 : "+account.getBalance());

	}
    //출금하기
	private static void withdraw() {
		System.out.println("=========");
		System.out.println("출금");
		System.out.print("계좌번호:");
		String ano=scanner.next();
		System.out.print("출금액:");
		int money =scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account ==null) {
			System.out.println("해당계좌가 없습니다. ");
			return; 
		}
		account.setBalance(account.getBalance()-money);
		System.out.println(account.getBalance()+"결과: 해당금액을 출금했습니다.");
		System.out.println("잔고 : "+account.getBalance());
	
	}
	
	
	//Accont 배열에서 ano와 동일한 Account 객체찾기
	private static Account findAccount(String ano) {
		for(Account account : accountArray)
		{
			if(account== null)
				break;
			else {
				if(ano.equals(account.getAno()))
					return account;
					
			}
		}
		
		return null;
	}
	
	}
	
	
	

