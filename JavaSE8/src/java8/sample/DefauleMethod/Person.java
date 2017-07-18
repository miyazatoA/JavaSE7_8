package java8.sample.DefauleMethod;

interface Person {
	long getId();
	default String getName() {
		return "Person getName()";
	}
}
