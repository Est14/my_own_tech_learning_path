var name1 = "Esteban";
var lastname1 = "martinez";

let str1 = new String("A object string");
console.log(typeof lastname1);
console.log(str1.length);

var name1InUpperCase = name1.toUpperCase(); // toUpperCase is a funtion
var name1InLowerCase = name1.toLowerCase(); // toLowerCase is a funtion
var lenOfname1 = name1.length; // length is an atribute
var fullname1 = `${name1} ${lastname1}`;
var str = name1.substr(1, 2); //
var capitalaizeLastname1 =
  lastname1[0].toUpperCase() + lastname1.substr(1, lastname1.length - 1);
var capitalaizeLastname1 = lastname1.replace(lastname1[0], (l) =>
  l.toUpperCase()
);
