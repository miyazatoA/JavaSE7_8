package java8.sample.Function;

public class IntOparatorTest {
	public static void main(String[] args){
		IntOparator op = ( i0 , i1 ) -> i0 + i1;
		System.out.println(op.apply(10, 20));
	}
}
