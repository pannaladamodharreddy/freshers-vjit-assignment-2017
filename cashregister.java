import java.util.scanner;
import java.lang.math;
public class cashregister{
public static void main(string[] args)
{
scanner input=new scanner(system.in);
double total=0.0;
doble price, cash, coupon;
double subtotal, totalwithtax, finaltax, cashleft, amount;
int itemcounter=0;
int ones, twos, fives, tens, twenties, fifties, hundreds, , twohundreds,fivehundreds, twothousands;
double taxamount=0.18;
system.out.println("enter price or 0 to quit");
price=input.nextdouble();
while(price!=0)
{
total=total+price;
itemcounter=itemcounter+1;
system/out.println("enter price or 0 to quit");
price=input.nextdouble();
}
if(itemcounter!=0)
{
system.out.println("enter if any coupon or press 0 to continue");
coupon=input.nextdouble();
while(coupon!=0)
{
coupontotal=coupontotal+coupon;
couponcounter=couponcounter+1;
System.out.print("Enter coupon amount or 0 to quit: ");
coupon = input.nextDouble();
}
system.out.printf("ITEM TOTAL: %.2f%n", total);
		system.out.printf("\n" + "coupon total", coupontotal);
		subtotal = total - coupontotal;
		system.out.printf("\n" + "subtotal", subtotal);
		taxpercentage = taxamount * 118;
		system.out.printf("\n" +tax percentage", taxpercentage);
		totalwithtax = taxamount * subtotal;
		system.out.printf("\n" + "taxamount", totalwithtax);
		finaltotal = totalwithtax + subtotal;
		system.out.printf("\n" + "total", finaltotal);
		system.out.print("\n" + "Enter amount of cash given: ");
		cash = input.nextDouble();
		cashowed = cash - finaltotal;
		System.out.printf("\n" + "change owed: %.2f%n", cashowed);
fivehundreds=(int) math.floor(cashowed/fivehundreds);
hundreds=(int) math.floor(cashowed/hundreds);
fifties=(int) math.floor(cashowed/fifties);
twenties = (int) Math.floor(cashowed/twenties);
		tens = (int) Math.floor((cashowed - twenties * twenties)/tens);
		fives = (int) Math.floor((cashowed-twenties * twenties - tens * tens)/fives);
		ones = (int) Math.floor((cashowed - twenties * twenties - tens * TENS - fives * fives));
        		
		
if (fivehundreds > 0)
	{
		System.out.print("500.00: " + fivehundreds + "\n");
	}
		
	if (hundreds> 0)
	{
		System.out.print("100.00: " + hundreds + "\n");
	}
		
	if (fifties> 0)
	{
		System.out.print("50.00: " + fifties + "\n");
	}	
	
	if ( twenties> 0)
	{
		System.out.print("20.00: " + ones + "\n");
	}	
	
	if (tens > 0)
	{
		System.out.print("10.00: rs " + tens+ "\n");
	}	
		
	if (fives > 0)
	{
		System.out.print("5.00: rs " + fives + "\n");
	}
		
	if (twos > 0)
	{
		System.out.print("2.00: rs: " + twos + "\n");
	}
		
	if (ones > 0)
	{
		System.out.print("1.00 rs: " + ones + "\n");
	}
