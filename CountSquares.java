/**
 * Created by liliia on 23.06.2018.
 */
public class CountSquares {
    static int countSquares(int a, int b)
    {
        int count = 0; // Initialize result


        for (int i = a; i <= b; i++)


            for (int j = 1; j * j <= i; j++)
                if (j * j == i)
                    count++;
        return count;
    }
}
