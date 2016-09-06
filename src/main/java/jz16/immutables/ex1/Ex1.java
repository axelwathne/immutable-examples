package jz16.immutables.ex1;

import static java.lang.System.out;

import org.immutables.value.Value.Immutable;


@Immutable interface A { 
	String id(); 
}


public class Ex1 {
	public static void main(String[] args){
		out.println(
				ImmutableA.builder()
				.id("1")
				.build());
	}
}
