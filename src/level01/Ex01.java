package level01;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 3진법 뒤집기
		int a;

		a = solution(289);	// 289를 넣었을 경우
		
		System.out.print("10진법 = " + a);
			
		}	// main
		// 성공
	 private static int solution(int share) {	
			int value1 = share;	// 처음 while문 대입
			int value2 = share;	// 두번째 while문 대입
		 	int rest; // 나머지
			int answer = 0;
			int count = 0;
			
			while (value1 != 0) {	// 배열방 갯수를 입력값에 따라 count로 채우기
				value1 /= 3;
				count++;
			}
			int array[] = new int[count];		//  나머지 값 채울 배열 선언.								
			int idx = 0; // 배열 방 0부터 채우기 시작하도록 초기화
			
			while (value2 != 0) {
				
				answer = value2 / 3;	// 몫의 값
				rest = value2 % 3;	// 나머지 값
				array[idx++] = rest; // 배열 0번방부터 차례로 나머지 대입
				value2 = answer;	// 몫에 3을 나눈 값 다시 대입
				
			}	// while
			
			
			System.out.println(Arrays.toString(array));	
			// array[] 배열에 나머지가 잘 들어갔나 확인할 겸 출력.
			
			int x = count-1;	//	3^x인 지수x 선언. (배열 방 때문에 -1)
			
			for (int i = 0; i < array.length; i++) {
				double result = Math.pow(3, x);			// 제곱근함수 사용, x가 각 방의 값에 3의 x제곱을 해줄 result 선언
				answer += array[i]*result;
				x--;
			}
			return answer;
		}


	}	//class