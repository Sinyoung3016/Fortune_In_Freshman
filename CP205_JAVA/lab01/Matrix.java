package lab01;

public class Matrix {
	double[][] matrix;
	int a;
	int b;

	public Matrix(double[][] arr) {
		this.matrix = arr;
		this.a = matrix.length;
		this.b = matrix[0].length;
	}

	public Matrix(int a, int b) {
		matrix = new double[a][b];
		this.a = a;
		this.b = b;

	}

	public static Matrix add(Matrix m1, Matrix m2) {
		Matrix m3 = new Matrix(m1.a, m1.b);
		if (m1.a != m2.a && m1.b != m2.b) {
			System.out.println("두 행렬의 행과 열의 길이가 같아야 합니다.");
			m3 = null;
		}else {
			for (int i = 0; i < m1.a; i++) {
				for (int j = 0; j < m1.b; j++) {
					m3.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
				}
			}
		}
		return m3;
	}

	public static Matrix minus(Matrix m1, Matrix m2) {
		Matrix m3 = new Matrix(m1.a, m1.b);
		if (m1.a != m2.a && m1.b != m2.b) {
			System.out.println("두 행렬의 행과 열의 길이가 같아야 합니다.");
			m3 = null;
		}else {
			for (int i = 0; i < m1.a; i++) {
				for (int j = 0; j < m1.b; j++) {
					m3.matrix[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
				}
			}
		}
		return m3;
	}

	public static Matrix multiply(Matrix m1, Matrix m2) {
		Matrix m3 = new Matrix(m1.a, m2.b);
		if (m1.b != m2.a) {
			System.out.println("첫번째 행렬의 열의 길이과 두번째 행렬의 행의 길이가 같아야 합니다.");
			m3 = null;
		}else {
			for (int i = 0; i < m1.a; i++) {
				for (int j = 0; j < m1.a; j++) {
					for (int k = 0; k < m1.b; k++) {
						m3.matrix[i][j] += (m1.matrix[i][k] * m2.matrix[k][j]);
					}
				}
			}
		}
		return m3;
	}

	public String toString() {
		String answer = "";
		for (int i = 0; i < a; i++) {
			if(i == 0)
				answer += "[";
			else
				answer += "\n [";
			
			for (int j = 0; j < b; j++) {
				if (j == b - 1)
					answer += matrix[i][j];
				else
					answer += matrix[i][j] + ", ";
			}
			answer += "]";
		}
		return "[" + answer + "]";
	}
}
