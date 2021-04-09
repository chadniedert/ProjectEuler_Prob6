// Link:  https://projecteuler.net/problem=6

class Main {
    public static void main(String[] args) {
		int sumSquares = 0;
		int squareOfSum = 0;

		for (int i = 1; i < 11; i++)
		{
			sumSquares += i * i;
		}

		for (int i = 1; i < 11; i++)
		{
			squareOfSum += i;
		}
		squareOfSum *= squareOfSum;

		System.out.println(squareOfSum - sumSquares);
    }
}