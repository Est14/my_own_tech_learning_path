#!/bin/bash
#Programa para capturar la info del usuario

#Auto: Esteban Martinez - est14.dart@gmail.com

option=0
backupName=""

echo "Programa de utilidades PotsgresQL"
echo -n "Ingresar una opcion: "
read
option=$REPLY
echo -n "Ingresar el nombre del Backup: "
read
backupName=$REPLY
echo "La opcion: $option, Backup name: $backupName"


