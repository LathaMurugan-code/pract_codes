class Numbers{
int x,y,z;
public Numbers(int x, int y, int z)
{
this.x = x;
this.y = y;
this.z = z;
}
public void isGreat()
{
if(x>=y)
{
if(x>=z)
{
System.out.println("x is greater");
}
else
{
System.out.println("z is greater");
}
}
else
{
if(y>=z)
{
System.out.println("y is greater");
}
else
{
System.out.println("z is greater");
}
}
}
public static void main (String[] args)
{
Numbers greater = new Numbers(10,45,20);
greater.isGreat();
}
}