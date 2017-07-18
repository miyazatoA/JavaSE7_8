package java8.practice.answers.Function;

// 1. 関数インターフェースのアノテーションを付与しましょう
@FunctionalInterface
// 2. DoubleOperatorインターフェースを宣言してください
public interface DoubleOparator {
// 3. double型の引数を2つ取得する apply メソッドを宣言してください
	public double apply (double x , double y); 
}
