import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class SecondDuplicateElement
{
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,73,3,2};
		
		Map<Integer,Long> cc=Arrays.stream(a).boxed().collect(Collectors.groupingBy((s)->s,Collectors.counting()));
		
		Optional<Integer> sde=Arrays.stream(a).boxed()
				.filter((i)->cc.get(i)>1)
				.distinct()
				.skip(1)
				.findFirst();
		
		sde.ifPresentOrElse(System.out::print,()->System.out.println("not found"));
	}
}

