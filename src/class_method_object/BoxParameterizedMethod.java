package class_method_object;

class Box2{
    double height;
    double width;
    double depth;
    
    void setDimensions(double h, double w, double d) {
	height = h;
	width = w;
	depth = d;
    }
    
    double volume() {
	return height * width * depth;
    }
}

class BoxParameterizedMethod {
    public static void main(String[] args) {
	Box2 a = new Box2();
	Box2 b = new Box2();
	
	a.setDimensions(10, 15, 20);
	b.setDimensions(3, 6, 9);
	
	System.out.println(a.volume());
	System.out.println(b.volume());
    }
}

/*While some methods don’t need parameters, most do. Parameters allow a method to be
generalized. That is, a parameterized method can operate on a variety of data and/or be
used in a number of slightly different situations. To illustrate this point, let’s use a very
simple example. Here is a method that returns the square of the number 10:
int square()
{
return 10 * 10;
}
While this method does, indeed, return the value of 10 squared, its use is very limited.
However, if you modify the method so that it takes a parameter, as shown next, then you
can make square( ) much more useful.
int square(int i)
{
return i * i;
}
Now, square( ) will return the square of whatever value it is called with. That is, square( ) is
now a general-purpose method that can compute the square of any integer value, rather
than just 10.
Here is an example:
    int x, y;
    x = square(5); // x equals 25
    x = square(9); // x equals 81\
    y = 2;
    x = square(y); // x equals 4
    
While this-Box code works, it is troubling for two reasons. First, it is clumsy and error prone.
For example, it would be easy to forget to set a dimension.
    */