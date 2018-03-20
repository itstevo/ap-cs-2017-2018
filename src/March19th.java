import java.util.*;
public class March19th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void removeZeros(ArrayList<Integer> list)
	{
		for(int i = 0; i<list.size();i++)
		{
			if(list.get(i)==0)
			{
				list.remove(i);
				i--;
			}
		}
	}
	
	public static void removeFirstLettersandInsertFun(ArrayList<String> list)
	{
		for(int i = 0; i<list.size();i++)
		{
			list.set(i, list.get(i).substring(0, list.get(i).length()-1));
		}
		list.add(list.size()-2,"Fun" );
	}
	
	public static int countLetters(ArrayList<String> list)
	{
		int total=0;
		for(int i = 0; i<list.size();i++)
		{
			total+=list.get(i).length();
		}
		return total;
	}
	
	public static int addLengthsExceptS (ArrayList<String> list)
	{
		int totalLength=0;
		for(int i = 0; i<list.size();i++)
		{
			for(int j = 0; j < list.get(i).length(); j++)
			{
				if(list.get(i).charAt(0)=='S')
				{
					i++;
					j=0;
				}
				else if(list.get(i).charAt(j)=='n')
				{
					i++;
					j=0;
				}
			}
			totalLength+=list.get(i).length();
		}
		return totalLength;
	}
	
	public static String findMin(ArrayList<Person> list)
	{
		int indexOfSmallest=0;
		int age= list.get(0).getAge();
		for(int i = 0; i<list.size();i++)
		{
			if(list.get(i).getAge()<age)
			{
				indexOfSmallest=i;
				age=list.get(i).getAge();
			}
		}
		return list.get(indexOfSmallest).getName();
	}
	//class invariant 
	public boolean equals(Coin aCoin)
	{
		if(aCoin.getValue()==this.getValue()&&aCoin.getName.equals(this.getName()))
				{
			return true ;
				}
		else 
			return false;
	}
	public int getTotal()
	{
		int totalValue = 0;
		for(int i=0; i<coins.size();i++)
		{
			totalValue+=coins.get(i).getValue();
		}
	}
	public int count(Coin aCoin)
	{
		int totalValue = 0;
		for(int i=0; i<coins.size();i++)
		{
			if(coins.get(i).equals(aCoin))
			{
				totalValue+=coins.get(i).getValue();
			}	
		}
		return totalValue;
	}
	
	public String findSmallest()
	{
		int smallestIndex=0;
		int smallestValue=coins.get(0).getValue();
		for(int i=0; i<coins.size();i++)
		{
			if(coins.get(i).getValue()<smallestValue)
			{
				smallestIndex=i;
				smallestValue=coins.get(i).getValue();
			}
		}
		return coins.get(smallestIndex).getName();
	}
}
