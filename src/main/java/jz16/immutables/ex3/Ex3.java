package jz16.immutables.ex3;

import static java.lang.System.out;

import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Style;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Style(visibility=ImplementationVisibility.PRIVATE)
@Immutable interface A {
	String id();
}

public class Ex3 {
	public static void main(String[] args) {
		out.println(new ABuilder().id("a1").build());
	}
}
