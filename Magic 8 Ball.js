
let varryVar = Math.random();
varryVar = varryVar * 5;

let userInput = prompt("What is your question? ");

console.log("You asked: " + userInput);

let finalAnswer = Math.floor(varryVar); // rounding the number off for switch function to read

switch (finalAnswer) {
    case 0:
        console.log("Signs point to yes");
        break;
    case 1:
        console.log("My reply is no");
        break;
    case 2:
        console.log("Ask again later");
        break;
    case 3:
        console.log("Reply hazy, try again");
        break;
    case 4:
        console.log("Don't count on it");
        break;
    case 5:
        console.log("Most likely");
        break;
}