//Factorial of number
var num = 5;
if (num === 0 || num === 1) {
  console.log("Please enter value other than 1 & 0");
}
for (var i = num - 1; i >= 1; i--) {
  num *= i;
}
console.log("factorial of the given number is ", num);
