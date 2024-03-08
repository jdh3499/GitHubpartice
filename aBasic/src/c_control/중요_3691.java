package c_control;

public class 중요_3691 {

	public static void main(String[] args) {
		 /* 문제  : 8의 숫자 세기(구글입사문제)

		 * 

		1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?for문쓰기

		8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.

		(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)

		결과 : 4000
		  */
				int count = 0; // 숫자 8의 등장 횟수를 카운트하는 변수
				int i = 1; // 반복을 위한 변수 초기화

				do {
					int su = i;
					int thousands = su / 1000; // 1000의 자리수 추출
					int hundreds = (su % 1000) / 100; // 100의 자리수 추출
					int tens = (su % 100) / 10; // 10의 자리수 추출
					int ones = su % 10; // 1의 자리수 추출

					if (thousands == 8) {
						count++; // 1000의 자리수가 8인 경우 count 변수 증가
					}
					if (hundreds == 8) {
						count++; // 100의 자리수가 8인 경우 count 변수 증가
					}
					if (tens == 8) {
						count++; // 10의 자리수가 8인 경우 count 변수 증가
					}
					if (ones == 8) {
						count++; // 1의 자리수가 8인 경우 count 변수 증가
					}

					i++; // 다음 숫자로 이동
				} while (i <= 10000);

				System.out.println(count); // 결과 출력
			}

	}


