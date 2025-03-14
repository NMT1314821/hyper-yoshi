import java.util.HashSet;
import java.util.Set;

class longestSubStringwrc
{
	public static void subStringrw(String s)
	{
		Set<Character> hs=new HashSet<Character>();		
		int left=0,maxlen=0,strInd=0;
		String lsstr="";
		for(int right=0;right<s.length();right++)
		{
			while(hs.contains(s.charAt(right)))
			{
				hs.remove(s.charAt(left));
				left++;
			}
			hs.add(s.charAt(right));
			if(right-left+1>maxlen)
			{
				maxlen=right-left+1;
				strInd=left;
				lsstr=s.substring(strInd,right+1);
				
			}
			
		}
		System.out.println(lsstr);
		System.out.println(maxlen);
	}
	
	public static void main(String[] args) {
		
		subStringrw("abcabcbb");
	}
}