import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Anagram {
	public static void main(String[] args) {
		String str[]={"abc","bca","cab","ab","ba","c","dog","god"};
		findAnagram(str);
	}

	private static void findAnagram(String[] str) {
		Map<String,List<String>> map=new HashMap<>();
		for (int i=0;i<str.length;i++)
		{
			char[] arr=str[i].toCharArray();
			Arrays.sort(arr);
			String newStr=new String(arr);
			if (map.containsKey(newStr))
			{
				List <String> values= map.get(newStr);
				values.add(str[i]);
				map.put(newStr,values);
			}
			else
			{
				List <String> values = new ArrayList<>();
				values.add(newStr);
				map.put(newStr, values);
			}
		}

		for(Map.Entry<String,List<String>> e: map.entrySet())
		{
			System.out.println(e.getKey() + "  " + e.getValue());
		}
	}
}
