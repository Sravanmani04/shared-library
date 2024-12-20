// byte
byte b = 10
println b 
println Byte.MIN_VALUE // is -128
println Byte.MAX_VALUE // is 127
println "***************************************"
//short 
short s = 100
println s
println Short.MIN_VALUE // is -32768
println Short.MAX_VALUE // is 32767
println "***************************************"

//int
int i = 1000
println i
println Integer.MIN_VALUE // is -2147483648
println Integer.MAX_VALUE // is 2147483647
println "***************************************"


//long
long l = 100000L //10000L<--typecasting
println l 
println Long.MIN_VALUE 
println Long.MAX_VALUE
println "***************************************"

// float
float f = 100.002F // used for decimal numbers
println f
println Float.MIN_VALUE 
println Float.MAX_VALUE
println "***************************************"

// Double
double d = 1000.00002D
println d
println Double.MIN_VALUE 
println Double.MAX_VALUE
println "***************************************"

//char -> only stores single character otherwise throws exception
char c = "A"
println c
println "***************************************"

// boolean
boolean flag = true
println flag
println "***************************************"

//string
String st = "Groovy"
println st
println "***************************************"

// byte
def x = 10
println x
println x.getClass().getName() // gives the type of the variable
println Byte.MIN_VALUE // is -128
println Byte.MAX_VALUE // is 127
println "***************************************"

// Typecasting
def y = (byte)10
println y