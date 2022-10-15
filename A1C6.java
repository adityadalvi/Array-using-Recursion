
public class A1C6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = new int[a.length][a[0].length];
		int i = 0;
		loopi(i, a, b);
		int k = 0;
		loopk(k, b);

		for (i = 0; i < b.length; i++) {

		}

	}

	private static void loopk(int k, int[][] b) {
		// TODO Auto-generated method stub
		if (k < b.length) {
			int l = 0;
			loopl(k, l, b);
			System.out.println();
			k++;
			loopk(k, b);
		}

	}

	private static void loopl(int k, int l, int[][] b) {
		// TODO Auto-generated method stub
		if (l < b.length) {
			System.out.print(b[k][l] + " ");
			l++;
			loopl(k, l, b);
		}

	}

	private static void loopi(int i, int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			int j = 0;
			loopj(i, j, a, b);
			i++;
			loopi(i, a, b);
		}

	}

	private static void loopj(int i, int j, int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		if (j < a.length) {
			b[j][i] = a[i][j];
			j++;
			loopj(i, j, a, b);
		}

	}
}
