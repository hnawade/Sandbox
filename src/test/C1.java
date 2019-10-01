package test;
import java.util.*;
import java.math.*;
	

public class C1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		String text = input.nextLine();
		input.close();
		String[] moves = text.split(", ");
		for (int i = 0; i < moves.length; i++) {
			System.out.println("gameBoard.move(" + Arrays.toString(moves[i].split(":|-")).substring(1,11) + ");");
		}
	}
		/*Scanner input = new Scanner (System.in);
		Random gen = new Random ();
		int randomNumber = 1 + gen.nextInt(100);
		System.out.println("Guess a number between 1 and 100!");
		
		int userInput = input.nextInt();
		
		while ( (userInput != randomNumber) )
		{
			if 
			
			userInput = input.nextInt();
		}
		
		System.out.println("That's correct!");
		
		input.close();
		
		String inputName = "First Name:Johny\n"
		+ "Last Name:Applseed\n"
		+ "Address:5 Apple Road\n"
		+ "Phone Number:1234567890";
		
		String name = inputName.substring(11,15);
		
		System.out.println(name);*/
}




























class tbd
{
    public static final String upper = "ABCDEFGHJKMNPQRSTUVWXYZ";
    public static final String digits = "23456789";
    public static final String alphanum = upper + digits;
    
	public static String token()
	{
		String token = "";
		for (int i = 0; i < 6; i++)
		{
			int randNum = (int) ( Math.random() * (double) alphanum.length() );
			token += alphanum.substring(randNum, randNum+1);
		}
		return token;
	}
	public static void main()
	{
		Scanner in = new Scanner (System.in);
		for (int i = 0; i < 23; i++)
		{
			String line = in.nextLine();
			String[] parts = line.split(",",6);
			String nextLine = "";
			nextLine = parts[4].trim() + "," + token() + ",,," + parts[1].trim() + ",,,,,,,,,,," + "1"; 
			System.out.println(nextLine);
			nextLine = parts[4].trim() + "," + token() + ",,," + parts[1].trim() + ",,,,,,,,,,," + "1"; 
			System.out.println(nextLine);
		}
		in.close();
	}
}

class bignumber
{
	public static void main()
	{
		BigDecimal num = new BigDecimal("1.0");
		for (int i = 0; i < 1941; i++)
		{
			num = num.multiply(BigDecimal.valueOf(150815.0));
		}
		BigDecimal newDec = num.divide(BigDecimal.valueOf(435979), 0, RoundingMode.FLOOR);
		newDec = newDec.multiply(BigDecimal.valueOf(435979));
		BigDecimal fin = num.subtract(newDec);
		System.out.println(fin);
	}
}


class format
{
	public static void main()
	{
		Scanner in = new Scanner (System.in);
		String retString = "";
		for (int i = 0; i < 26; i++)
		{
			String line = in.nextLine();
			String[] parts = line.split(",|–",4);
			String nextLine = "";
			nextLine = i + "=" + parts[2].trim() + "," + parts[1].trim();
			//System.out.println(nextLine);
			retString += nextLine;
		}
		in.close();
		System.out.println(retString);
	}
}





class Matrix
{
	private  int[][] matrix;
	private  int rows;
	private  int columns;
	
	public  int getRows()
	{
		return rows;
	}
	public  int getCol()
	{
		return columns;
	}
	private  void setRows()
	{
		System.out.println("How many rows does your matrix have?");
		Scanner row = new Scanner(System.in);
		rows = row.nextInt();
		row.close();
	}
	private  void setColumns()
	{
		System.out.println("How many columns does your matrix have?");
		Scanner col = new Scanner(System.in);
		columns = col.nextInt();
		col.close();
	}
	public  void setMatrix()
	{
		System.out.println("How many rows does your matrix have?");
		Scanner row = new Scanner(System.in);
		rows = row.nextInt();
		
		System.out.println("How many columns does your matrix have?");
		//Scanner col = new Scanner(System.in);
		columns = row.nextInt();
		
		matrix = new int[rows][columns];
		System.out.println("List your elements row by row.");
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				//Scanner element = new Scanner(System.in);
				matrix [i][j] = row.nextInt();
				//element.close();
			}
		}
		row.close();
	}
	public  void getMatrix()
	{
		System.out.print("_");
		for (int i = 0; i <  rows*2-1; i++)
			System.out.print(" ");
		System.out.println("_");
		for (int i = 0; i < matrix.length; i++)
		{
			System.out.print("|");
			for (int j = 0;j < matrix[i].length-1;j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.print(matrix[i][matrix[i].length-1]);
			System.out.println("|");
		}
		System.out.print("‾");
		for (int i = 0; i <  rows*2-1; i++)
			System.out.print(" ");
		System.out.println("‾");
		
	}
}



class guess1/*FAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAILFAIL*/
{
	private static Double[] arr;
	
	public static double mean(Double[] arr)
	{
		double avg = 0.0;
		for (double ele: arr)
		{
			avg+=ele;
		}
		return avg/((double) arr.length);
	}
	
	public static double stdev(Double[] arr)
	{
		double stdev = 0.0;
		Double temp[] = new Double[arr.length];
		double mean = mean(arr);
		for (int i = 0; i < arr.length; i++)
		{
			temp[i] = Math.pow(arr[i]-mean, 2);
		}
		stdev = Math.pow(mean(temp),0.5);
		
		return stdev;
	}
	
	public static void main (String[] args)
	{
		System.out.println("How many numbers?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		arr = new Double [num];
		System.out.println("Enter " + num + " following numbers");
		arr[0] = in.nextDouble();
		for (int i = 1; i < arr.length; i++)
		{
			arr[i]=in.nextDouble();
		}
		in.close();
		System.out.println("Done");
		Double[][] arrarr = new Double[arr.length][];
		arrarr[0] = arr;
		for (int j = 1; j < arr.length; j++)
		{
			Double[] tempArr = new Double[arrarr[j-1].length-1];
			for (int i = 0; i < tempArr.length; i++)
				tempArr[i] = arrarr[j-1][i+1] - arrarr[j-1][i];
			arrarr[j]=tempArr;
		}
		arrarr[arrarr.length-1] = new Double[]{arrarr[arrarr.length-1][0], arrarr[arrarr.length-1][0]};
		for (int i = arrarr.length-2; i>=0; i--)
		{
			Double[] tempArr = new Double[arrarr[i].length+1];
			for (int j = 0;j < tempArr.length-1;j++)
				tempArr[j]=arrarr[i][j];
			tempArr[tempArr.length-1] = tempArr[tempArr.length-2]+arrarr[i+1][tempArr.length-2];
			arrarr[i] = tempArr;
		}
		System.out.println(arrarr[0][arrarr[0].length-1]);
	}
}


class ArrayListClass
{
	private static List<Long> arrL = new ArrayList<Long>();
	public static boolean isPalindrome (long num)
	{
		 long n = num;
		 long rev = 0;
		 while (num >= 1)
		 {
		      long dig = num % 10;
		      rev = rev * 10 + dig;
		      num = num / 10;
		 }
		 return n == rev;
	}
	public static void main(String[] args)
	{
		for (long i = 61036; i<610351; i=i+1)
		{
			if (isPalindrome((long)(i*Math.pow(2, 14))))
			{
				arrL.add((long)(i*Math.pow(2, 14)));
			}
		}
		for (int i = 0; i < arrL.size(); i++)
			System.out.println(arrL.get(i));
		System.out.println("done");
		long sum = 0;
		for (int i = 0; i < arrL.size(); i++)
			sum+=arrL.get(i);
		System.out.println(sum);
	}
}

class MergeSort
{
	private static int[] arr;
	
	private static int[] merge(int[] arr1, int[] arr2)
	{
		int[] retArr = new int[arr1.length+arr2.length];
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < retArr.length;i++)
		{
			if (arr1[count1] > arr2[count2])
			{
				retArr[i] = arr2[count2];
				count2++;
			} else
			{
				retArr[i] = arr1[count1];
				count1++;
			}
		}
		return retArr;
	}
	
	private static int[] merge2(int n)
	{
		int retArr[] = new int[n];
		return retArr;
	}
	private static void merge3()
	{
		
	}
	public static void main()
	{
		System.out.println("How many integers");
		Scanner in = new Scanner (System.in);
		int num = in.nextInt();
		arr = new int[num];
		System.out.println("Enter " + num + " numbers");
		arr [0] = in.nextInt();
		for (int i = 1; i < num; i++)
		{
			System.out.println("Next");
			arr[i] = in.nextInt();
		}
		in.close();
		
		
	}
}


class InversionSort
{
	private static int[] arr;
	private static int count = 0;
	
	public static int[] sortArr (int[] inarr)
	{
		/*int[] sorted = new int[inarr.length];
		for (int i = 0; i < inarr.length;i++)
			sorted[i] = inarr[i];
			
		for (int i = 0; i < inarr.length; i++)
			sorted = swap(findMin(inarr),i, sorted);
		return sorted;*/
		arr = inarr;
		for (count = 0; count < inarr.length; count++)
		{
			swap(findMin(),count);
		}
		return arr;
	}
	
	private static int findMin()
	{
		int retInt = arr.length-1;
		for (int i = count; i < arr.length;i++)
		{
			if (arr[i] < arr[retInt])
			{
				retInt = i;
			}
		}
		return retInt;
	}
	
	private static void swap(int a, int b)
	{
		int temp = arr[b];
		arr [b] = arr[a];
		arr[a] = temp;
	}
	public static void main()
	{
		System.out.println("How many integers");
		Scanner in = new Scanner (System.in);
		int num = in.nextInt();
		arr = new int[num];
		System.out.println("Enter " + num + " numbers");
		arr [0] = in.nextInt();
		for (int i = 1; i < num; i++)
		{
			System.out.println("Next");
			arr[i] = in.nextInt();
		}
		for (count = 0; count < num; count++)
		{
			swap(findMin(),count);
		}
		in.close();
		System.out.print("\n\nThis is your sorted array: ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}



class Fibonacci
{
	public static long fibSlow (long n)
	{
		if (n <= 1) {
			return n;
		}

		return fibSlow (n-1) +fibSlow (n-2);
	}

	public static long fibLinear (long n)
	{
		if (n <= 1) {
			return n;
		}
		n--;
		long prev = 0;
		long curr = 1;
		long next = 1;
		while (n > 0) {
			prev = curr;
			curr = next;
			next = prev + curr;
		}
		return curr;
	}

	public static long fibLogarithmic(long n) {
		int M[][] = new int[][]{{1,1},{1,0}};
		int F[][] = M;
		if (n <= 0)
			return n;
		for (int i = 2; i < n; i++) {
			int a =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
			int b =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
			int c =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
			int d =  F[1][0]*M[0][1] + F[1][1]*M[1][1];

			F[0][0] = a;
			F[0][1] = b;
			F[1][0] = c;
			F[1][1] = d;
		}
		return F[0][0];
	}

	public static void main()
	{
		Scanner in = new Scanner(System.in);
		while (true)
		{
			System.out.println("Enter a number");
			double input = in.nextDouble();
			for (int i = 1; i <= input; i++)
				System.out.print(fibSlow(i)+ " ");
			System.out.println();
		}
	}
}


class fact
{
	public static double factorial (double n)
	{
		if (n != 1)
		{
			return n*factorial(n-1);
		}
		return n;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (true)
		{
			System.out.println("Enter a number");
			double input = in.nextDouble();
			System.out.println(factorial(input));
		}
	}
}




class C2
{
	private static List<Integer> arrL = new ArrayList<Integer>();
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	
	private static void print (List<Integer> arr)
	{
		for (int i = 0; i < arr.size(); i++)
		{
			System.out.print(arr.get(i) + " ");
		}
	}

	private static void shuffle()
	{
		for (int i = 0; i < arrL.size(); i++)
		{
			int i2 = (int) (Math.random()*(arrL.size())-1);
			int temp = arrL.get(i);
			arrL.set(i, arrL.get(i2));
			arrL.set(i2, temp);
		}
	}
	private static void add(int n)
	{
		for (int i = 0; i < arrL.size(); i++)
		{
			arrL.set(i, arrL.get(i)+n);
		}
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		String input = in.nextLine();
		while (isInteger(input))
		{
			arrL.add(Integer.parseInt(input));
			input = in.nextLine();
		}
		if (input.equalsIgnoreCase("Done"))
		{
			while (!input.equals("nothing"))
			{
				System.out.println("What do you want to do with the following array");
				print(arrL);
				input = in.nextLine();
				if (input.equalsIgnoreCase("shuffle"))
				{
					shuffle();
				} else if (input.equalsIgnoreCase("add"))
				{
					System.out.println("Enter a number");
					input = in.nextLine();
					if (isInteger(input))
					{
						add(Integer.parseInt(input));
					}
				} else if (input.equalsIgnoreCase("sort"))
				{
					Integer[] temp = arrL.toArray(new Integer[arrL.size()]);
					int[] temp2 = new int[temp.length];
					for (int i = 0; i < temp.length; i++)
						temp2[i] = temp[i];
					temp2 = InversionSort.sortArr(temp2);
					for (int i = 0; i < temp.length; i++)
						temp[i] = temp2[i];
					arrL = new ArrayList<Integer>(Arrays.asList(temp));
				}
			}
		}
		in.close();
		System.out.print("This is your final array: ");
		print(arrL);
	}
}	
class Calc
{
	private static int one;
	private static int two;
	
	private static int mult ()
	{
		return one*two;
	}
	private static double divide()
	{
		return (double)one/two;
	}
	private static int subtract()
	{
		return one - two;
	}
	private static int add()
	{
		return one + two;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		int cases = in.nextInt();
		for (int i = 0; i < cases; i ++)
		{
			boolean valid = false;
			while (!valid)
			{
				System.out.println("First Number: ");
				one = in.nextInt();
				System.out.println("Operator");
				String b = in.next();
				System.out.println("Second Number: ");
				two = in.nextInt();
				if (b.equals("+"))
				{
					System.out.println(add());
					valid = true;
				}else if (b.equals("-"))
				{
					System.out.println(subtract());
					valid = true;
				}else if (b.equals("*"))
				{
					System.out.println(mult());
					valid = true;
				} else if (b.equals("/"))
				{
					System.out.println(divide());
					valid = true;
				} else
				{
					System.out.println("Invalid operation, start over");
				}
			}
		}
		
		System.out.println("Done with " + cases + " operation(s)\nExiting Program");
		in.close();
	}
}
