import java.util.scanner;
import java.lang.math;
class restaurent
{
void greetings()
{
System.out.println("welcome");
}
void tableallotment
{
int vacancy;
if(vacancy==0)
{
System.out.println("table alloted");
}
else
{
System.out.println("reserved can you please wait");
}
void menubuffet()
{
System.out.println("starters");
System.out.println("main course");
System.out.printl("desserts");
}
void starter();
{
System.out.println("item1+item2+item3");
}
void maincourse()
{
System.out.println("item4+item5+item6+item7+item8+item9+item10"):
}
void dessert()
{
System.out.println("item11+item12+item13");
}
string executivechef()
{
system.out.println("recive the items selected by the customers");
system.out.println("distribute the items among the line cooks to be cooked");
}
string linecooks()
{ 
double orderregister()
{
arraylist<int>order=new arraylist<int>();
order.add("1");
order.add("2");
order.add("3");
}
void costofitems()
{
item1=30;
item2=25;
item3=55;;
item4=100;
item5=110;
item6=50;
item7=35;
item8=55;
item9=50;
item10=20;
item11=55;
item12=80;
item13=45;
void placeorder(string(order))
{
system.out.println("your order is placed");
}
double billing(float())
{
total bill=cost of all items+(18/100)*COST of all items;
}
public class cashregister
{
public static void main(string[] args)
{
scanner in=new
scanner(system.in)
for(i=1;i<3;i++)
system.out.println(i+"buffet items starters#",+i);
system.out.println("0,quit");
boolean quit=false;
string starters();
do
{
system.out.println("choose item from the starters");
startersitem=in.nextint();
switch(starters item)
{
case 1:
system.out.println("you've choosen item#1:");
break;
case 2:
system.out.println("you've choosen item#2:");
break;
case 3:
system.out.println("you've choosen item#3:);
break;
default:
quit=true;
system.out.println("you've did not choose an item from the starters");
break;
}while(!quit):
system.out.println("jump to main course");
}
}
{
scanner in=new
scanner(system.in)
for(i=1;i<7;i++)
system.out.println(i+"buffet items main course of items"+i);
string main course();
do
{
system.out.println("choose item from main course");
startersitem=in.nextint();
switch(main course item)
{
case 1:
system.out.println("you've choosen item#4");
break;
case 2:
system.out.println("you've choosen item#5"):
break;
case 3:
system.out.println("you've choosen item#6");
break;
case 4:
system.out.println("you've choosen item#7");
break;
case 5:
system.out.println("you've choosen item#8");
breask;
case 6:
system.out.println("you've choosen item#9");
break;
case 7:
system.out.println("you've choosen item#10");
break;
default:
system.out.println("you did not choose any item from the main course");
break;
}while(!quit):
system.out.println("jump to dessert");
}
}
scanner in=new
scanner(system.in)
for(i=1;i<3;i++)
system.out.println(i+"buffet items dessert"+i);
string dessert course();
do
{
system.out.println("choose item from dessert course");
startersitem=in.nextint();
switch(main course item)
{
case 1:
system.out.println("you've choosen item#11");
break;
case 2:
system.out.println("you've choosen item#12");
break;
case 3:
system.out.println("you've choosen item#13");
break;
default:
system.out.println("you did not choose any of the item in the dessert");
break;
}while(!quit):
double bill(float())
{
menu.put(item1,item2,item3)
menu.put(item4,item5,item6,item7,item8,item9,item10)
menu.put(item11,item12,item13)
{
order order1=new order();
order1.add(menu.get("item1,item2,item3,item4,item8,item7,item11,item13",8);
string(executive chef())
system.out.println("total for order 1:"+order1.gettotal());
}
{
order order2=new order()
order2.add(menu.get("item1,item3,item8,item9,item11,item12,item13",7);
string(executive chef())
system.out.println("total for order 2":order2.gettotal());
}
}
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
}		
if (fivehundreds > 0)	{
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
}
}