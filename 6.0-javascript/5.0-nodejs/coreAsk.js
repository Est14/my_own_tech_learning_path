const readLine = require("readline");

const rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Do you like nodejs ?", (answer) => {
  console.log(`Your answer ${answer}`);
});
