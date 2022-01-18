package co.incubyte.main;

import org.testng.collections.Lists;

import java.util.List;

public class PrimeFactor {

    public static List<Integer> FindFactors(int n) {
        List<Integer> factors = Lists.newArrayList();
        for (int divisor = 2; n > 1; divisor++)
            for(; n % divisor == 0; n /= divisor)
                factors.add(divisor);
        return factors;
    }
}