#!/bin/bash
#Programa para capturar la info del usuario

#Auto: Esteban Martinez - est14.dart@gmail.com

option=0
backupName=""

echo "Programa de utilidades PotsgresQL"
read -p "Ingresar una opcion: " option
read -p "Ingresar el nombre del Backup: " backupName
echo "La opcion: $option, Backup name: $backupName"

