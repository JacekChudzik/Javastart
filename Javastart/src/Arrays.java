
public class Arrays {
	public static void main(String[] args) {

		double[][] arr = new double[3][3];
		
		arr[0][0] = 1.0;
		arr[0][1] = 1.5;
		arr[0][2] = 2.0;
		arr[1][0] = 1.5;
		arr[1][1] = 2.0;
		arr[1][2] = 2.5;
		arr[2][0] = 2.0;
		arr[2][1] = 2.5;
		arr[2][2] = 3.0;
		
		
		System.out.println("suma iloczynów przekątnych: " + (arr[0][0]*arr[1][1]*arr[2][2] + arr[0][2]*arr[1][1]*arr[2][0]));
		System.out.println("iloczyn sum środkowego wiersza i kolumny: "+ ((arr[0][1]+arr[1][1]+arr[2][1]) * (arr[1][0]+arr[1][1]+arr[1][2])));
		
		
		
		double sum = 0;
		for (int x = 0; x<arr.length;x++){
			sum = sum + arr[0][x] + arr[1][x]+ arr[2][x];
		
			
			
		}
		
		sum = sum - arr[1][1];
		System.out.println("suma elementów przy krawędzi: " + sum);
		
		
	}
}
