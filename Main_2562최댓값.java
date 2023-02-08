import java.util.Scanner;

public class Main_2562최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int cnt = 2;
		for (int i = 0; i < 9; i++) {
			// 9번 입력
			int n = sc.nextInt();
			if(n > max) {
				max = n;
				cnt++;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
		

	}

}
