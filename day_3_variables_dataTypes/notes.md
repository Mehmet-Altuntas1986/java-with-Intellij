give name to a class in a proper way ,  final variable , how to make assignment

class names
_a     valid                 underscore
-a     not valid
1a     not valid
$a     valid                dolar sign

rules
-class isminin ilk karakteri rakam olamaz, sonraki karakterlerde rakam olabilir
-class isminin ilk karakteri  _ ile  $ dolar sign veya herhangi bir harfle baslayabilir
- ilk karakter rakamsa ,sonraki kisimda sadece  alt tire  underscore _ , dolar sign $ , yada rakam gelebilir, baska karakterler hata verir
- ilk karakter  sadece  alt tire yada harf olabilir



final double PI = 3.14;
final String BIRTHDAY="12\12\1992";
final int CAPACITY=50;


//When you write final in front of a variable it will not change later it will stay constant.


Variable in Java
is a data container that saves the data values during Java program execution. Every variable is assigned a data type that designates the type and quantity of value it can hold. Variable is a memory location name of the data.

A variable is a name given to a memory location. It is the basic unit of storage in a program.



The value stored in a variable can be changed during program execution.
A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
In Java, all the variables must be declared before use.

How to declare variables?
We can declare variables in java as pictorially depicted below as a visual aid.

float simpleInterest;
// Declaring float variable

int time = 10, speed = 20;
// Declaring and Initializing integer variable

char var = 'h';
// Declaring and Initializing character variable

int x= 5;       datatype is int        ,  variable names are a,b and c

int i3 = 100_000;      valid         if we use underscore (_) For long numbers its easier to see

long creditCardNumber = 5876_1234_3453_983L;   valid

long creditCardNumber = 5876_1234_3453_983 ;   int boundary asimi-   not valid
(java da belirtilmedikce int gibi algilamaya calisiyor ve hata olusuyor)

long l1 = 5000;   valid


int a,b,c;                     valid

int a ,String b ;            not valid

int a ;    String b ;          valid

int a ;   //declaration

a=5;  assignment

float f1 = 35e3f;   //35000.0        valid     e represents power of 10  --  e3  10 uzeri 3 demek

    double d1 = 12E4d; //120000.0  valid 


Local Variables
Instance Variables
Static Variables


Numbers
To declare and assign a number use the following syntax:

int myNumber;
myNumber = 5;

Or you can combine them:

int myNumber = 5;


To define a double floating point number, use the following syntax:

double d = 4.5;
d = 3.0;   // reassignment


If you want to use float, you will have to cast:

float f = (float) 4.5;
Or, You can use this:

float f = 4.5f; // (f is a shorter way of casting float)

The following example shows other ways you can use the underscore in numeric literals:

long creditCardNumber = 1234_5678_9012_3456L;
long socialSecurityNumber = 999_99_9999L;
float pi =  3.14_15F;
long hexBytes = 0xFF_EC_DE_5E;
long hexWords = 0xCAFE_BABE;
long maxLong = 0x7fff_ffff_ffff_ffffL;
byte nybbles = 0b0010_0101;
long bytes = 0b11010010_01101001_10010100_10010010;


You can place underscores only between digits; you cannot place underscores in the following places:

At the beginning or end of a number
Adjacent to a decimal point in a floating point literal
Prior to an F or L suffix
In positions where a string of digits is expected
The following examples demonstrate valid and invalid underscore placements (which are highlighted) in numeric literals:

// Invalid: cannot put underscores
// adjacent to a decimal point
float pi1 = 3_.1415F;

// Invalid: cannot put underscores
// adjacent to a decimal point
float pi2 = 3._1415F;

// Invalid: cannot put underscores
// prior to an L suffix
long socialSecurityNumber1 = 999_99_9999_L;


// OK (decimal literal)
int x1 = 5_2;


// Invalid: cannot put underscores
// At the end of a literal
int x2 = 52_;


// OK (decimal literal)
int x3 = 5_______2;


// Invalid: cannot put underscores
// in the 0x radix prefix
int x4 = 0_x52;


// Invalid: cannot put underscores
// at the beginning of a number
int x5 = 0x_52;


// OK (hexadecimal literal)
int x6 = 0x5_2;


// Invalid: cannot put underscores
// at the end of a number
int x7 = 0x52_;




From the image, it can be easily perceived that while declaring a variable, we need to take care of two things that are:

1. Datatype: Type of data that can be stored in this variable.

2. Dataname: Name was given to the variable.

In this way, a name can only be given to a memory location. It can be assigned values in two ways:

Variable Initialization
Assigning value by taking input
How to initialize variables?
It can be perceived with the help of 3 components that are as follows:

datatype: Type of data that can be stored in this variable.
variable_name: Name given to the variable.
value: It is the initial value stored in the variable.

Literals
You may have noticed that the new keyword isn't used when initializing a variable of a primitive type. Primitive types
are special data types built into the language; they are not objects created from a class. A literal is the source code
representation of a fixed value; literals are represented directly in your code without requiring computation.
As shown below, it's possible to assign a literal to a variable of a primitive type:

boolean result = true;
char capitalC = 'C';
byte b = 100;
short s = 10000;
int i = 100000;





		