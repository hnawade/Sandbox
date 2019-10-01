package Euler;
import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
//import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ProjEuler
{
	public static void main (String args[])
	{
		PI.method3();
	}
}

class problem20
{
	public static void main ()
	{
		BigInteger factorial = new BigInteger("1");
		for (int i = 1; i <= 100; i++)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		String factInString = factorial.toString();
		int sum = 0;
		for (char digit : factInString.toCharArray())
		{
			sum += Integer.parseInt(Character.toString(digit));
		}
		System.out.println(sum);
	}
}

class problem18
{
	public static void main ()
	{
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int pyramid[][] = new int[rows][];
		for (int i = 1; i < rows + 1; i++)
		{
			pyramid[i-1] = new int[i];
			for (int j = 0; j < i;j++)
			{
				pyramid[i-1][j] = in.nextInt();
			}
		}
		for (int i = rows; i > 1; i--)
		{
			for (int j = 0; j < pyramid[i-1].length-1; j++)
			{
				if (pyramid[i-1][j]>pyramid[i-1][j+1])
				{
					pyramid[i-2][j] += pyramid[i-1][j];
				} else
				{
					pyramid[i-2][j] += pyramid[i-1][j+1];
				}
			}
		}
		System.out.println(pyramid[0][0]);
		
		in.close();
	}
}

class problem17
{
	public static int and = 3;
	public static int one = 3;
	public static int two = 3;
	public static int three = 5;
	public static int four = 4;
	public static int five = 4;
	public static int six = 3;
	public static int seven = 5;
	public static int eight = 5;
	public static int nine = 4;
	public static int ten = 3;
	public static int eleven = 6;
	public static int twelve = 6;
	public static int thirteen = 8;
	public static int fourteen = 8;
	public static int fifteen = 7;
	public static int sixteen = 7;
	public static int seventeen = 9;
	public static int eighteen = 8;
	public static int nineteen = 8;
	public static int twenty = 6;
	public static int thirty = 6;
	public static int forty = 5;
	public static int fifty = 5;
	public static int sixty = 5;
	public static int seventy = 7;
	public static int eighty = 6;
	public static int ninety = 6;
	public static int hundred = 7;
	public static int thousand = 8;
	
	public static void main()
	{
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
		{
			sum += integerToNum (i);
		}
		System.out.println(sum);
	}
	
	public static int integerToNum (int integer)
	{
		int retInt = 0;
		if (integer >= 1000)
		{
			retInt = one + thousand;
			integer-=1000;
		}
		if (integer >= 100)
		{
			switch ((integer-(integer%100))/100)
			{
			case 1:
				retInt += one + hundred;
				integer-=100;
				if (integer != 0)
				{
					retInt += and;
				}
				break;
			case 2:
				retInt += two + hundred;
				integer-=200;
				if (integer != 0)
				{
					retInt += and;
				}
				break;
			case 3:
				retInt += three + hundred;
				integer-=300;
				if (integer != 0)
				{
					retInt += and;
				}
				break;
			case 4:
				retInt += four + hundred;
				integer-=400;
				if (integer != 0)
				{
					retInt += and;
				}
				break;
			case 5:
				retInt += five + hundred;
				integer-=500;
				if (integer != 0)
				{
					retInt += and;
				}
				break;
			case 6:
				retInt += six + hundred;
				integer-=600;
				if (integer != 0)
				{
					retInt += and;
				}
				break;
			case 7:
				retInt += seven + hundred;
				integer-=700;
				if (integer != 0)
				{
					retInt += and;
				}
				break;
			case 8:
				retInt += eight + hundred;
				integer-=800;
				if (integer != 0)
				{
					retInt += and;
				}
				break;
			case 9:
				retInt += nine + hundred;
				integer-=900;
				if (integer != 0)
				{
					retInt += and;
				}
				break;
				default:
					break;
			}
		}
		if (integer < 100)
		{
			if (integer >= 10 && integer < 20)
			{
				if (integer == 10)
				{
					retInt += ten;
				} else if (integer == 11)
				{
					retInt += eleven;
				} else if (integer == 12)
				{
					retInt += twelve;
				} else if (integer == 13)
				{
					retInt += thirteen;
				} else if (integer == 14)
				{
					retInt += fourteen;
				} else if (integer == 15)
				{
					retInt += fifteen;
				} else if (integer == 16)
				{
					retInt += sixteen;
				} else if (integer == 17)
				{
					retInt += seventeen;
				} else if (integer == 18)
				{
					retInt += eighteen;
				} else if (integer == 19)
				{
					retInt += nineteen;
				}
				integer = 0;
			}
			if (integer >= 20)
			{
				switch ((integer-(integer%10))/10)
				{
				case 2:
					retInt += twenty;
					integer -= 20;
					break;
				case 3:
					retInt += thirty;
					integer -= 30;
					break;
				case 4:
					retInt += forty;
					integer -= 40;
					break;
				case 5:
					retInt += fifty;
					integer -= 50;
					break;
				case 6:
					retInt += sixty;
					integer -= 60;
					break;
				case 7:
					retInt += seventy;
					integer -= 70;
					break;
				case 8:
					retInt += eighty;
					integer -= 80;
					break;
				case 9:
					retInt += ninety;
					integer -= 90;
					break;
				default:
					break;
				}
			}
			if (integer == 1)
				retInt += one;
			if (integer == 2)
				retInt += two;
			if (integer == 3)
				retInt += three;
			if (integer ==4)
				retInt += four;
			if (integer == 5)
				retInt += five;
			if( integer == 6)
				retInt += six;
			if (integer == 7)
				retInt += seven;
			if (integer == 8)
				retInt += eight;
			if (integer == 9)
				retInt += nine;				
		}
		return retInt;
	}
}

class problem16
{
	public static void main()
	{
		BigInteger number = new BigInteger("1");
		for (int i = 0; i < 1000; i++)
		{
			number = number.multiply(BigInteger.valueOf((long) 2));
		}
		String numString = number.toString();
		int sum = 0;
		for (int i = 0; i<numString.length(); i++)
		{
			sum += Integer.parseInt(numString.substring(i, i+1));
		}
		System.out.println("Sum: " + sum);
	}
}

class problem15
{
	private static int max = 20;
	private static int pointerX = 0;
	private static int pointerY = 0;
	private static List<Integer> xList = new ArrayList<Integer>();
	private static List<Integer> yList = new ArrayList<Integer>();
	private static int paths = 1;
	
	
	public static void main()
	{
		while ((pointerX != max && pointerY != max) || xList.size() != 0)
		{
			if (pointerX != max && pointerY != max)
			{
				xList.add(pointerX);
				yList.add(pointerY);
				pointerX++;
				paths += 1;
			}
			else
			{
				pointerX = xList.remove(xList.size()-1);
				pointerY = yList.remove(yList.size()-1);
				pointerY++;
			}
			System.out.println(xList);
			System.out.println("(" + pointerX + "," + pointerY + ")");
		}
		System.out.println("Paths: " + paths);
	}
}

class problem12
{
	public static long triNum(long n)
	{
		return (long) (((double)n)*((double)(n+1))/2.0);
	}
	
	public static void main()
	{
		boolean conditionmet = false;
		long trials = 0;
		long finalNum = 0;
		while (!conditionmet)
		{
			trials++;
			long testnum = triNum(trials);
			long threshhold = (long) Math.pow(testnum, 0.5)+1;
			int numOfFactors = 0;
			for (int i = 1; i < threshhold; i++)
			{
				if (testnum % i == 0)
				{
					numOfFactors++;
				}
			}
			if ((threshhold-1) * (threshhold-1) == testnum)
			{
				numOfFactors = numOfFactors * 2 - 2;
			}
			else
			{
				numOfFactors = numOfFactors * 2 - 1;
			}
			if (numOfFactors > 500)
			{
				conditionmet = true;
				finalNum = testnum;
			}
			System.out.println("The number is: " + finalNum);
		}
	}
}

class PI
{
	private static double Big = Math.pow(10, 15);
	
	public static void method1 ()
	{
		double Sum = 0.0;
		int j = 0;
		for (double i = 0.0; i < Big; i++)
		{
			double term = (4.0*Big*Big - 4.0*i*i+4*i - 1.0);
			term = Math.pow(term, -0.5);
			term = term * 4.0;
			Sum = Sum + term;
			if (((int) i) % 10000000 == 0)
			{
				System.out.print("Ten Million ");
				System.out.println(j);
				j++;
			}
		}
		System.out.println(Sum);
	}
	public static void method2 ()
	{
		int iterations = 25;
		double approximation = 0.5;
		//BigDecimal approx = new BigDecimal("0.5");
		for (int i = 0; i < iterations; i++)
		{
			approximation = 0.5 + 0.5 * Math.pow(approximation, 0.5);
		}
		approximation = Math.pow(approximation, 0.5);
		approximation = Math.pow(0.5 - 0.5 * approximation, 0.5);
		approximation = Math.pow(2.0, iterations+3.0) * approximation;
		System.out.println((approximation));
	}
	public static void method3 ()
	{
		int num = 10000;
		BigDecimal approximation = new BigDecimal("0.0");
		for (double i = 0.0; i < num; i++)
		{
			BigDecimal numer = new BigDecimal("3.0");
			for (double j = i+1.0; j < 2.0*i+1.0; j++)
				numer = numer.multiply(BigDecimal.valueOf((long) j));
			BigDecimal denom = new BigDecimal("16.0");
			denom = denom.pow((int) i);
			for (double j = 1.0; j < i+1.0; j++)
				denom = denom.multiply(BigDecimal.valueOf((long) j));
			denom = denom.multiply(BigDecimal.valueOf((long) (2*i+1)));
			BigDecimal term = numer.divide(denom, 10000,RoundingMode.HALF_UP);
			approximation = approximation.add(term);
			if (((int) i) % 100 == 0)
			{
				System.out.println("Approximation: " + approximation.toString());
				System.out.println("    Iteration: " + i + "\n");
			}
		}
		System.out.println("Approximation: " + approximation.toString());
	}
}
//3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196442881097566593344612847564823378678316527120190914564856692346034861045432664821339360726024914127372458700660631558817488152092096282925409171536436789259036001133053054882046652138414695194151160943305727036575959195309218611738193261179310511854807446237996274956735188575272489122793818301194912983367336244065664308602139494639522473719070217986094370277053921717629317675238467481846766940513200056812714526356082778577134275778960917363717872146844090122495343014654958537105079227968925892354201995611212902196086403441815981362977477130996051870721134999999837297804995105973173281609631859502445945534690830264252230825334468503526193118817101000313783875288658753320838142061717766914730359825349042875546873115956286388235378759375195778185778053217122680661300192787661119590921642019893809525720106548586327886593615338182796823030195203530185296899577362259941389124972177528347913151557485724245415069595082953311686172785588907509838175463746493931925506040092770167113900984882401285836160356370766010471018194295559619894676783744944825537977472684710404753464620804668425906949129331367702898915210475216205696602405803815019351125338243003558764024749647326391419927260426992279678235478163600934172164121992458631503028618297455570674983850549458858692699569092721079750930295532116534498720275596023648066549911988183479775356636980742654252786255181841757467289097777279380008164706001614524919217321721477235014144197356854816136115735255213347574184946843852332390739414333454776241686251898356948556209921922218427255025425688767179049460165346680498862723279178608578438382796797668145410095388378636095068006422512520511739298489608412848862694560424196528502221066118630674427862203919494504712371378696095636437191728746776465757396241389086583264599581339047802759009946576407895126946839835259570982582262052248940772671947826848260147699090264013639443745530506820349625245174939965143142980919065925093722169646151570985838741059788595977297549893016175392846813826868386894277415599185592524595395943104997252468084598727364469584865383673622262609912460805124388439045124413654976278079771569143599770012961608944169486855584840635342207222582848864815845602850601684273945226746767889525213852254995466672782398645659611635488623057745649803559363456817432411251507606947945109659609402522887971089314566913686722874894056010150330861792868092087476091782493858900971490967598526136554978189312978482168299894872265880485756401427047755513237964145152374623436454285844479526586782105114135473573952311342716610213596953623144295248493718711014576540359027993440374200731057853906219838744780847848968332144571386875194350643021845319104848100537061468067491927819119793995206141966342875444064374512371819217999839101591956181467514269123974894090718649423196156794520809514655022523160388193014209376213785595663893778708303906979207734672218256259966150142150306803844773454920260541466592520149744285073251866600213243408819071048633173464965145390579626856100550810665879699816357473638405257145910289706414011097120628043903975951567715770042033786993600723055876317635942187312514712053292819182618612586732157919841484882916447060957527069572209175671167229109816909152801735067127485832228718352093539657251210835791513698820914442100675103346711031412671113699086585163983150197016515116851714376576183515565088490998985998238734552833163550764791853589322618548963213293308985706420467525907091548141654985946163718027098199430992448895757128289059232332609729971208443357326548938239119325974636673058360414281388303203824903758985243744170291327656180937734440307074692112019130203303801976211011004492932151608424448596376698389522868478312355265821314495768572624334418930396864262434107732269780280731891544110104468232527162010526522721116603966655730925471105578537634668206531098965269186205647693125705863566201855810072936065987648611791045334885034611365768675324944166803962657978771855608455296541266540853061434443185867697514566140680070023787765913440171274947042056223053899456131407112700040785473326993908145466464588079727082668306343285878569830523580893306575740679545716377525420211495576158140025012622859413021647155097925923099079654737612551765675135751782966645477917450112996148903046399471329621073404375189573596145890193897131117904297828564750320319869151402870808599048010941214722131794764777262241425485454033215718530614228813758504306332175182979866223717215916077166925474873898665494945011465406284336639379003976926567214638530673609657120918076383271664162748888007869256029022847210403172118608204190004229661711963779213375751149595015660496318629472654736425230817703675159067350235072835405670403867435136222247715891504953098444893330963408780769325993978054193414473774418426312986080998886874132604722
//3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196442881097566593344612847564823378678316527120190914564856692346034861045432664821339360726024914127372458700660631558817488152092096282925409171536436789259036001133053054882046652138414695194151160943305727036575959195309218611738193261179310511854807446237996274956735188575272489122793818301194912983367336244065664308602139494639522473719070217986094370277053921717629317675238467481846766940513200056812714526356082778577134275778960917363717872146844090122495343014654958537105079227968925892354201995611212902196086403441815981362977477130996051870721134999999837297804995105973173281609631859502445945534690830264252230825334468503526193118817101000313783875288658753320838142061717766914730359825349042875546873115956286388235378759375195778185778053217122680661300192787661119590921642019893809525720106548586327886593615338182796823030195203530185296899577362259941389124972177528347913151557485724245415069595082953311686172785588907509838175463746493931925506040092770167113900984882401285836160356370766010471018194295559619894676783744944825537977472684710404753464620804668425906949129331367702898915210475216205696602405803815019351125338243003558764024749647326391419927260426992279678235478163600934172164121992458631503028618297455570674983850549458858692699569092721079750930295532116534498720275596023648066549911988183479775356636980742654252786255181841757467289097777279380008164706001614524919217321721477235014144197356854816136115735255213347574184946843852332390739414333454776241686251898356948556209921922218427255025425688767179049460165346680498862723279178608578438382796797668145410095388378636095068006422512520511739298489608412848862694560424196528502221066118630674427862203919494504712371378696095636437191728746776465757396241389086583264599581339047802759009946576407895126946839835259570982582262052248940772671947826848260147699090264013639443745530506820349625245174939965143142980919065925093722169646151570985838741059788595977297549893016175392846813826868386894277415599185592524595395943104997252468084598727364469584865383673622262609912460805124388439045124413654976278079771569143599770012961608944169486855584840635342207222582848864815845602850601684273945226746767889525213852254995466672782398645659611635488623057745649803559363456817432411251507606947945109659609402522887971089314566913686722874894056010150330861792868092087476091782493858900971490967598526136554978189312978482168299894872265880485756401427047755513237964145152374623436454285844479526586782105114135473573952311342716610213596953623144295248493718711014576540359027993440374200731057853906219838744780847848968332144571386875194350643021845319104848100537061468067491927819119793995206141966342875444064374512371819217999839101591956181467514269123974894090718649423196156794520809514655022523160388193014209376213785595663893778708303906979207734672218256259966150142150306803844773454920260541466592520149744285073251866600213243408819071048633173464965145390579626856100550810665879699816357473638405257145910289706414011097120628043903975951567715770042033786993600723055876317635942187312514712053292819182618612586732157919841484882916447060957527069572209175671167229109816909152801735067127485832228718352093539657251210835791513698820914442100675103346711031412671113699086585163983150197016515116851714376576183515565088490998985998238734552833163550764791853589322618548963213293308985706420467525907091548141654985946163718027098199430992448895757128289059232332609729971208443357326548938239119325974636673058360414281388303203824903758985243744170291327656180937734440307074692112019130203303801976211011004492932151608424448596376698389522868478312355265821314495768572624334418930396864262434107732269780280731891544110104468232527162010526522721116603966655730925471105578537634668206531098965269186205647693125705863566201855810072936065987648611791045334885034611365768675324944166803962657978771855608455296541266540853061434443185867697514566140680070023787765913440171274947042056223053899456131407112700040785473326993908145466464588079727082668306343285878569830523580893306575740679545716377525420211495576158140025012622859413021647155097925923099079654737612551765675135751782966645477917450112996148903046399471329621073404375189573596145890193897131117904297828564750320319869151402870808599048010941214722131794764777262241425485454033215718530614228813758504306332175182979866223717215916077166925474873898665494945011465406284336639379003976926567214638530673609657120918076383271664162748888007869256029022847210403172118608204190004229661711963779213375751149595015660496318629472654736425230817703675159067350235072835405670403867435136222247715891504953098444893330963408780769325993978054193414473774418426312986080998886874132604700

class problem14
{
	private static int count = 0;
	private static long max = 0;
	private static int maxCount = 0;
	private static long nextInt(long num)
	{
		count++;
		if (num % 2==0)
		{
			return num/2;
		}
		else
		{
			return 3*num+1;
		}
	}
	
	public static void main()
	{
		for (int i = 1000000-1; i >=1000; i--)
		{
			System.out.println(i);
			count = 0;
			long number = i;
			while (number != 1)
			{
				number = nextInt(number);
				//System.out.println("    " + number);
			}
			if (count > maxCount)
			{
				max = i;
				maxCount = count;
			}
		}
		System.out.println(max);
	}
}

class problem10
{
	public static void main()
	{
		long sum = 0;
		for (int i = 2; i < 2000000;i++)
		{
			boolean isPrime=true;
			for (int j = 2; (j < i && isPrime); j++)
			{
				if (i%j == 0)
				{
					isPrime = false;
				}
				System.out.println(j);
			}
			if (isPrime)
			{
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.print("Sum: ");
		System.out.println(sum); //142913828922 
	}
}

class problem8
{
	public static String num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
	public static void main()
	{
		long maxprod = 1;
		for (int i = 0; i<1000-13; i++)
		{
			long product = 1;
			long next = 0;
			for (int j = i; j < i+13; j++)
			{
				next = (long) Integer.parseInt(num.substring(j, j+1));
				product*=next;
			}
			if (product > maxprod)
			{
				maxprod = product;

			}
		}
		System.out.println(maxprod);
	}
}

class problem7
{
	public static boolean isPrime(int num)
	{
		for (int i = (int)Math.pow(num, 0.5); i>=2;i--)
			if (num % i == 0)
				return false;
		return true;
	}
	public static void main(int n)
	{
		int i = 0;
		for (i = 2; n!=0; i++)
			if (isPrime(i))
				n--;
		System.out.println(i-1);
	}
}

class problem5
{
	public static double findGCF (double a, double b)
	{
		if (b == 0)
			return a;
		return findGCF(b,a%b);
	}
	public static void main(int n)
	{

		int retInt = n;
		for (int i = retInt; i > 0; i--)
			retInt*=((double)i)/findGCF(retInt,i);
		System.out.println(retInt);
	}
}

class problem4
{
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
	public static void main()
	{
		long p=0;
		for (long i = 999; i>=100;i--)
			for (long j = 999; j>=100; j--)
				if (j*i>p && isPalindrome(j*i))
					p = j*i;
		System.out.println(p);
	}
}

class problem2
{
	public static void main()
	{
		long sum = 2;
		long i = 1;
		long j = 2;
		while (i < 4000000)
		{
			long temp = j;
			j += i;
			i = temp;
			if (j%2==0)
			{
				sum+=j;
			}
		}
		System.out.println(sum);
	}
}

class problem1
{
	private static boolean isMultiple(int n)
	{
		if ((n%3==0) || (n%5==0))
			return true;
		return false;
	}
	
	public static void main (int n)
	{
		int sum = 0;
		for (int i = 1; i<n; i++)
			if (isMultiple (i))
				sum+=i;
		System.out.println(sum);
	}
}