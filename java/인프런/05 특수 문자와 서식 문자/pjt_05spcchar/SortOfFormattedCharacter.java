package pjt_05spcchar;

public class SortOfFormattedCharacter {
	public static void main(String[] args) {
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);

		System.out.println();

		// 서식문자 정렬 기능
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);

		System.out.println();

		// 서식문자 소수점 제한 기능
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%.3f\n", 1.23);
	}
}
