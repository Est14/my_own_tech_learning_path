#!/bin/bash
#Programa que trata los tipos de operadores

#Auto: Esteban Martinez - est14@gmail.com
numA=10
numB=14

echo "Operadores aritmeticos"
echo "Numeros: A=$numA  y B=$numB"
echo "Sumar A + B =" $((numA + numB))
echo "Restar A - B =" $((numA - numB))
echo "Multiplicar A * B =" $((numA * numB))
echo "Dividir A / B =" $((numA / numB))
echo "Residuo A % B =" $((numA % numB))


echo -e "\nOperadores Relacionales"
echo "Numeros: A=$numA y B=$numB"
echo "A > B =" $((numA > numB))
echo "A < B =" $((numA < numB))
echo "A >= B =" $((numA >= numB))
echo "A <= B =" $((numA <= numB))
echo "A == B =" $((numA == numB))
echo "A != B =" $((numA != numB))


echo -e "\nOperadores Asignacion"
echo "Numeros: A=$numA y B=$numB"
echo "Sumar A += B" $((numA += numB))
echo "Restar A -= B" $((numA -= numB))
echo "Mul A *= B =" $((numA *= numB))
echo "Div A /= B =" $((numA /= numB))
echo "Resi A %= B =" $((numA %= numB))
