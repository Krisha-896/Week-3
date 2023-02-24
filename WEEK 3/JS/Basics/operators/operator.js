console.log("Hello");

var x = 250;
console.log("The value of x is ", x);

var a = 10;
var b = 20;
var temp;

temp = a;
a = b;
b = temp;

console.log("changed value of a is ", a);
console.log("changed value of b is ", b);

//arithmatic operator
console.log("summation of a and b is", a + b);
console.log("substraction of a and b is", a - b);
console.log("mutliplication of a and b is", a * b);
console.log("division of a and b is", a / b);

//assignment operator
var x = 250;
x += 10;
console.log("The value of x after x+=10 is", x);

var x = 250;
x -= 10;
console.log("The value of x after x-=10 is", x);

var x = 250;
x *= 10;
console.log("The value of x after x*=10 is", x);

var x = 250;
x /= 25;
console.log("The value of x after x/=25 is", x);
