package lab01;

public class Matrix_Test {
	public static void main(String[] args) {
		Matrix mat1 = new Matrix(new double[][] { { 1, -2 }, { 3, 4 }, { 5, 6 } });
		Matrix mat2 = new Matrix(new double[][] { { 1, 2, 3 }, { 4, 5, 6 } });

		System.out.println("ù��° ���");
		System.out.println(mat1);
		System.out.println("\n�ι�° ���");
		System.out.println(mat2);
		System.out.println("\nù��° ��� + ù��° ���");
		System.out.println(Matrix.add(mat1,mat1));
		System.out.println("\n�ι�° ��� - �ι�° ���");
		System.out.println(Matrix.minus(mat2, mat2));
		System.out.println("\nù��° ��� * �ι�° ���");
		System.out.println(Matrix.multiply(mat1, mat2));
		
		System.out.println("\nù��° ��� + �ι�° ���");
		System.out.println(Matrix.add(mat1,mat2));
		System.out.println("\nù��° ��� - �ι�° ���");
		System.out.println(Matrix.minus(mat1, mat2));
		System.out.println("\nù��° ��� * ù��° ���");
		System.out.println(Matrix.multiply(mat1, mat1));
	}
}
