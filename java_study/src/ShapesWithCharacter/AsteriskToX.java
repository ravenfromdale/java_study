package ShapesWithCharacter;

public class AsteriskToX {
	public static void main(String[] args) {
		// ����� ������ ������ ��ø for
		for (int i=1; i<6; i++) {
			for (int j=1; j<6; j++) {
				if (j==i || j==6-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}