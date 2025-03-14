import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class main {
    public int[] closestPrimes(int left, int right) 
    {
        boolean[] sieve=generateSieve(right);
        List<Integer> primes=new ArrayList<Integer>();
        for(int num=left;num<=right;num++)
        {
            if(sieve[num])
            {
                primes.add(num);
            }
        }
        if(primes.size()<2)
        return new int[]{-1,-1};

        int minDiff=Integer.MAX_VALUE;
        int[] pair=new int[2];

        for(int i=1;i<primes.size();i++)
        {
            int diff=primes.get(i)-primes.get(i-1);
            if(diff<minDiff)
            {
                minDiff=diff;
                pair[0]=primes.get(i-1);
                pair[1]=primes.get(i);
            }
        }
        return pair;     
    }
    private boolean[] generateSieve(int max)
    {
        boolean[] sieve=new boolean[max+1];
        Arrays.fill(sieve, true);
        sieve[0]=false;
        sieve[1]=false;

        for(int i=2;i*i<=max;i++)
        {
            if(sieve[i])
            {
                for(int j=i*i;j<=max;j+=i)
                {
                    sieve[j]=false;
                }
            }
        }
        return sieve;
    }
}
class SOE
{
	public static void main(String[] args) {
		main s=new main();
		int a=10,b=19;
		int res[]=s.closestPrimes(a, b);
		System.out.println(Arrays.toString(res));
	}
}
