/*
Exercise 4.6
Rock Paper Scissors game

This is a game between two computer players, where both will make a random selection 
of either Rock, Paper, or Scissors (alternatively, you could create a version using 
    real player input!). Rock will beat out Scissors, Paper will beat out Rock, and 
    Scissors will beat out Paper. You can use JavaScript to create your own version 
    of this game, applying the logic with an if statement. Since this project is a 
    little more difficult, here are some suggested steps:

    1. Create an array that contains the variables Rock, Paper, and Scissors.
    2. Set up a variable that generates a random number 0-2 for player1 and then do 
    the same for player 2's selection. The number represents the index values in the 
    array of the 3 items.
    3. Create a variable to hold a response message to the game user. This can show 
    the random results for both players and then also the result for the computer of 
    the matching item from the array.
    4. Create a condition to handle player1's and player2's selections. If both are 
    the same, this results in a tie.
    5. Use conditions to apply the game logic and return the correct results. There 
    are several ways to do this with the condition statements, but you could check 
    which player's index value is bigger and assign the victory accordingly, with the 
    exception of Rock beating Scissors.
    6. Add a new output message that shows each player's selection and the result of 
    the game.
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