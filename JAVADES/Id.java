package freshman;

import java.util.Scanner;

public class Id {
	String myID = "bcrhs008";
	String ID;

	String input() {
		System.out.println("���̵� �Է��Ͽ� �ֽÿ�");
		Scanner sc = new Scanner(System.in);
		ID = sc.next();
		return ID;
	}

	void test() {
		for (int i = 0; i < myID.length(); i++) {
			if(myID.length()<ID.length())
			if (myID.charAt(i) == ID.charAt(i)) {

				if (i == (ID.length() - 1)) {
					System.out.println("��ġ�մϴ�.");
					return;
				}
				
				else {
					continue;
				}
			}

			else {
				System.out.println("��ġ���� �ʾƿ�");
				return;
			}
		}
	}
}
