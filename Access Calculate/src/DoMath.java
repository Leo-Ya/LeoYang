
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-11));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2.0, 4.0));
		System.out.println(Calculate.toDegrees(7 * 3.14159 / 12));
		System.out.println(Calculate.toImproperFrac(10, 1, 5));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(7, 2, 5, 1, "x"));
	}
}
