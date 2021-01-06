let name1 = "Esteban";
let lastname1 = "martinez";

let str1 = new String("A object string");
console.log(typeof lastname1);
console.log(str1.length);

 // ----- Lower ------ Upper -------------- //
let name1InUpperCase = name1.toUpperCase(); // toUpperCase is a funtion
let name1InLowerCase = name1.toLowerCase(); // toLowerCase is a funtion

// -------------Capitalize------------- //
let capitalaizeLastname1 =
  lastname1[0].toUpperCase() + lastname1.substr(1, lastname1.length - 1);

let capitalaizeLastname1 = lastname1.replace(lastname1[0], (l) =>
  l.toUpperCase());
