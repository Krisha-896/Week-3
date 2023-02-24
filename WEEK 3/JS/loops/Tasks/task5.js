//Reverse of the number

let number = 44554;

let result = 0;

while (number > 0) {
  temp = number % 10;

  result = result * 10 + temp;

  number = Math.floor(number / 10);
}
console.log("Reversed number is : " + result);
