/*
* Created by Seth Clark
* Rock, Paper, Scissors Game
*/

let userChoice = prompt("Let's play Rock, Paper, Scissors! Type 0 for Rock. Type 1 for Paper. Type 2 for Scissors. We will see who wins!");
userChoice = Number(userChoice);

let player2 = Math.random();
player2 = player2 * 3;
player2 = Math.floor(player2);

switch (userChoice) {
    case 0:
        console.log("You chose Rock!");
        break;
    case 1:
        console.log("You chose Paper!");
        break;
    case 2:
        console.log("You chose Scissors!");
        break;
    default:
        console.log("That's not a 0, or a 1, or a 2 for that matter. Try again. Enter 0 for Rock, 1 for Paper, or 2 for Scissors.");
        break;
}
switch (player2) {
    case 0:
        console.log("I have chosen Rock!");
        break;
    case 1:
        console.log("I have chosen Paper!");
        break;
    case 2:
        console.log("I have chosen Scissors!");
        break;
}

if (userChoice === 0 & player2 === 2) {
    console.log("You win!");
} else if (userChoice === 2 & player2 === 0) {
    console.log("I win!");
} else if (userChoice < player2) {
    console.log("I win!");
} else if (player2 < userChoice) {
    console.log("You win!");
} else {
    console.log("It's a tie!")
}