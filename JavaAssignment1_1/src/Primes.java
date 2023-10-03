public class Primes {
    public static void main(String[] args)
    {
        int nValues = 50;
        label :for(int i = 2; i <= nValues; i++)
        {
            for (int j = 2; j < (int)(Math.sqrt(i)); j++)
            {
                if (i % j == 0)
                {
                    continue label; // Using labelled Continue instead of break
                }
            }
            System.out.println(i);
        }
    }
}
