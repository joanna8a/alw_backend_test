import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountRepeatedChars {
	public Map<Character, Integer> count(String input) {
		String lowerCase = input.toLowerCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if (map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c, ++cnt);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}

	public String reducedAnswer(String inputText) {
		Map<Character, Integer> map = count(inputText);

		String outputAnswer = "";
		//System.out.println(map.toString());
		boolean removed = map.entrySet().removeIf(entries -> entries.getValue() < 2);
		//System.out.println(map.toString());
		if (removed) {
			StringBuilder sb = new StringBuilder('"' + inputText + '"' + "=> {");
			Iterator<Character> it = map.keySet().iterator();
			while (it.hasNext()) {
				Character key = (Character) it.next();
				sb.append("'" + key + "': " + map.get(key) + "', ");
			}
			sb.append("}");
			outputAnswer = sb.toString();
		}
		return outputAnswer;
	}

}
