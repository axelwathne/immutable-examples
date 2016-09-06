package jz16.immutables.ex2;

import static java.lang.System.out;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Modifiable;

@Immutable
interface ADef {
	String id();
	Optional<String> desc();
	Map<String, LocalDate> dates();
}

@Modifiable
abstract class BDef {
	abstract String id();
	abstract List<Number> nums();
}

class Ex2 {
	public static void main(String[] args) {
		A a1 = A.builder().id("Ting1").desc("Beskrivelse").build();
		A a2 = A.builder().from(a1).id("Ting2").putDate("now", LocalDate.now()).build();
		B b = B.create().addNum(3).setId("Gjenstand1");

		out.println(a1);
		out.println(a2);
		out.println(b);
		a2.dates().put("later", LocalDate.MAX);
	}
}