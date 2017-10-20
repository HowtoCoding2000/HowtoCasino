import java.util.ArrayList;
public class RandomNameGenerator
	{
		static ArrayList <String> nameArray = new ArrayList <String>();
		static String name1 = "";
		static String name2 = "";
		public static void main(String[] args)
			{
				fillNameArray();
				pickRandomFirstName();
				pickRandomSecondName();
			}
		public static void fillNameArray()
			{
				nameArray.add("Steve");
				nameArray.add("Bill");
				nameArray.add("Frank");
				nameArray.add("Joe");
				nameArray.add("Herbert");
				nameArray.add("John");
				nameArray.add("Hank");
				nameArray.add("Paul");
				nameArray.add("Mary");
				nameArray.add("Sarah");
				nameArray.add("Maria");
				nameArray.add("Bonnie");
				nameArray.add("Suzy");
				nameArray.add("Jane");
				nameArray.add("Morgan");
				nameArray.add("Lucy");
			}
		public static void pickRandomFirstName()
			{
				int i = (int)(Math.random()*16);
				name1 = nameArray.get(i);
			}
		public static void pickRandomSecondName()
			{
				int i = (int)(Math.random()*16);
				name2 = nameArray.get(i);
			}
	}
