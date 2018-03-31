package backJoon;

import java.util.Scanner;

public class BackJoonilosayook {
	private static Scanner sc;

	public static void main(String[] args) {

		int N;
		double M = 0;
		double hap = 0;
		double avg = 0.00f;
		double[] s = new double[1000];

		sc = new Scanner(System.in);
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			s[i] = sc.nextInt();
			if (s[i] <= 100 && s[i] >= 0) {
				continue;
			} else {
				System.out.println("�����Դϴ�.");
			}
		}

		for (int j = 0; j < N; j++) {
			if (M <= s[j]) {
				M = s[j];
			}
		}
		for (int k = 0; k < N; k++) {
			s[k] = (s[k] / M) * 100;
		}
		for (int a = 0; a < N; a++) {
			hap += s[a];
		}
		avg = hap / N;
		String avs = String.format("%.2f", avg);

		System.out.println(avs);
	}

}
