var name = 'Esteban';
var lastName = 'martinez'

var nameInUpperCase = name.toUpperCase();  // toUpperCase is a funtion
var nameInLowerCase = name.toLowerCase();  // toLowerCase is a funtion
var lenOfName = name.length  // length is an atribute 
var fullName = `${name} ${lastName}`;
var str = name.substr(1,2); // str is a funtion
var capitalaizeLastName = lastName[0].toUpperCase() + lastName.substr(1, lastName.length - 1)
var capitalaizeLastName = lastName.replace(lastName[0], (l) => l.toUpperCase())
