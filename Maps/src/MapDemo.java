import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner file = new Scanner(new File("integers.txt"));
		List<Integer> list = new LinkedList<Integer>();
		
		while(file.hasNext())
		{
			list.add(Integer.parseInt(file.next()));
		}
		
		System.out.println(list);
		
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(Integer x: list)
		{
			if(map.containsKey(x))
			{
				map.put(x, map.get(x)+1);
			}
			else { map.put(x, 1); }
		}
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> keys = set.iterator();
		
		while(keys.hasNext())
		{
			Integer k = keys.next();
			System.out.println(k + ": " + map.get(k));
		}
	}
	
	

}
