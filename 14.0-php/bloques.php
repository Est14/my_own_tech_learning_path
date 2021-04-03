<?php
// Asignation
$num = 9;
$lang = [
    'es' => 'español',
    'en' => 'english'
];

// Math
echo "Suma 2 + 2" . ((int) 2 + (int) 2);
echo "Resta 2 - 2" . ((int) 2 - (int) 2);
echo "Mul 2 * 2" . ( 2 * 2);
echo "Div 2 / 2" . ( 2 / 2);
echo "Mod 2 % 2" . ( 2 % 2);
echo "Exp 2 ** 2" . ( 2 ** 2);

if (condicion){
    #code
} elseif(condicion){
    #code
}else{
    #code
}

switch ($login){
    case true:
        #code ... 
        break;

    case false:
        #code ... 
        break;

    default:
        #code ... 
        break;
}

foreach ($datos as $key => $value) {

}

$a = 1;

while ($a <= 10){
    #code ... 
    $a++;
}

for ($i=0; $i < 10; $i++) { 
    # code...
}