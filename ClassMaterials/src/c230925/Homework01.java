package c230925;

import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {
	
	public void program1() {
		String text1 = "Hello Everyone";
		char[] charArr = text1.toCharArray();
		int count = 0;
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == 'e') {
				count++;
			}
		}
		System.out.println("문자 'e'의 갯수 : "+count);
	}
				
	public void program2() {
		String text2 = "ABCDE";
		StringBuffer sb = new StringBuffer(text2);
		String reverse = sb.reverse().toString();
		
		System.out.println(reverse);
	}
	
	public void program3() {
		String text3 = "i am a boy";
		String changeInput3 = text3.replaceAll("\\s", "");
		
		System.out.println(changeInput3);
						
	}
	
	public void program4() {
		String text4 = "Hello Everyone";
		char[] charArr = text4.toCharArray();
		
		for(int i = 0; i < charArr.length; i++) {
			if(Character.isUpperCase(charArr[i])) {
				charArr[i] = Character.toLowerCase(charArr[i]);
			}
			else if(Character.isLowerCase(charArr[i])) {
				charArr[i] = Character.toUpperCase(charArr[i]);
			}
		}		
		System.out.println(charArr);
	}
	
	public void findCharIndex() {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		
		char[] charArr = input1.toCharArray();
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == 'e') {
				System.out.println(i);
			}
		}
		sc.close();
	}
	
	public void countWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String input2 = sc.nextLine();
		String trimInput2 = input2.trim();
		String[] stIndex = trimInput2.split("\\s");
		
		System.out.println("단어의 갯수 : "+stIndex.length);
		sc.close();
	}
	
	public void Prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input3 = sc.nextInt();
		
		for(int i = 2; i < input3; i++) {
			if(input3 % i == 0) {
				System.out.println("소수가 아닙니다");
				break;
			}						
		}
		System.out.println("소수입니다");
		sc.close();
	}
	
	public void calculateDigitSum() {
		int num = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		while(num!=0) {            
            sum += num%10;           
            num /= 10;
        }
		
        System.out.println("각 자리수의 합 : " + sum);
        sc.close();
		
	}
	
	public void FindCommonItems() {
		int[] arr1 = {8, 17, 17, 30, 35};
		int[] arr2 = {12, 17, 25, 30, 30, 35};
		int[] arr3 = {12, 17, 30, 35, 35, 42};
		
		arr1 = Arrays.stream(arr1).distinct().toArray();
		arr2 = Arrays.stream(arr2).distinct().toArray();
		arr3 = Arrays.stream(arr3).distinct().toArray();
		
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				for(int k = 0; k < arr3.length; k++) {
					if(arr1[i] == arr2[j] & arr2[j] == arr3[k]) {												
						System.out.println(arr1[i]);
					}
				}
			}
		}				
	}
	
	public void upDownGame() {		
		System.out.println("숫자 맞추기 게임!");
		int com = (int)(Math.random()*1000);
		int count = 10;		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("숫자를 선택하세요");
			int input = sc.nextInt();
		
			if(com > input) {
				System.out.println("더 크다");
				count--;
			}
		
			if(com < input) {
				System.out.println("더 작다");
				count--;
			}
		
			if(com == input) {
				System.out.println("축하합니다!! 정답입니다.");
				System.out.println("게임을 종료합니다");
				break;
			}
		
			if(count == 0) {
				System.out.println("기회를 전부 사용하셧습니다.");
				System.out.println("게임을 재시작 하시겟습니까?");
				System.out.println("예(1) 아니오(2)");
			
				int reStart = sc.nextInt();
				if(reStart == 1) {
					com = (int)(Math.random()*1000);
					count = 10;
					continue;
				}
				
				if(reStart == 2) {
					System.out.println("게임이 종료되었습니다.");
					break;
				}
			}	
		}
		sc.close();
	}
	
}
