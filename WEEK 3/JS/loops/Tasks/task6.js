//palindrome
var number = 153351;
var original = number;
let result = 0;

while (number > 0) {
  temp = number % 10;

  result = result * 10 + temp;

  number = Math.floor(number / 10);
}
if (original == result) {
  console.log("number is palindrome");
} else {
  console.log("number is not palindrome");
}
