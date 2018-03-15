package grammar.defaultparam;

import com.google.common.collect.Lists;

import java.util.List;

import static grammar.defaultparam.ConstantsKt.DEFAULT_SEPARATOR;
import static grammar.defaultparam.JoinFunction.join;
import static grammar.defaultparam.JoinKt.joinToString;

public class FunctionMain {
	public static void main(String[] args) {
		List<String> list = Lists.newArrayList("a", "b", "c", "d");

		System.out.println(joinToString(list));
		System.out.println(joinToString(list, " / "));
		System.out.println(joinToString(list, " / ", "("));
		System.out.println(joinToString(list, " / ", "(", ")"));

		System.out.println(join(list));
		System.out.println(join(list, DEFAULT_SEPARATOR));
	}
}
