// const moneyBox = (coins) => {
//     var saveCoins = 0
//     saveCoins += coins
//     console.log(`MoneyBox = ${saveCoins}`)
// }

// moneyBox(5);
// moneyBox(10);


// This is a closure
const moneyBox = () => {
    var saveCoins = 0;
    const countMoney = (coins) =>{
        saveCoins += coins;
        console.log(`MoneyBox: $${saveCoins}`)
    }
    return countMoney;
}

let myMoneyBox = moneyBox();

myMoneyBox(4);
myMoneyBox(5);
myMoneyBox(100);
