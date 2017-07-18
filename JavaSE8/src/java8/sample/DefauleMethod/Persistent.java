package java8.sample.DefauleMethod;

interface Persistent {
	default String getName() { 
		return "Persistent getName()";
	}
}
