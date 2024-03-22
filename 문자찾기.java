/*
    < 문자 찾기 >
    문자 한개, 문자열 한개를 입력받아
    입력받은 문자가 문자열에 몇개 존재하는지 출력하시오

*/

package javala;
import java.util.Scanner;

public class Main {
	public int solution(String str, char t) {
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		for(int i=0; i<str.length(); i++) {
			if(t == str.charAt(i)) answer++;	
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
				
		System.out.println(T.solution(str, c));
	}

}
