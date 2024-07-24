package code.bind.dp.array;

//https://www.youtube.com/watch?v=sVAB0p58tlg
public class KnapsackProblem {
	// A utility function that returns
	// maximum of two integers
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// Returns the maximum value that can
	// be put in a knapsack of capacity W
	static int knapSack(int W, int wt[], int val[], int v) {
		int i, w;
		int K[][] = new int[v + 1][W + 1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= v; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}

		return K[v][W];
	}

	// Driver Code
	public static void main(String[] args) {
		int value[] = { 1, 4, 4, 5, 7 };
		int weight[] = { 1, 2, 3, 4, 5 };

		int W = 9;
		int v = value.length;

		System.out.println(knapSack(W, weight, value, v));
	}
}
