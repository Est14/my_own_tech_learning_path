package main

import "fmt"

type Person struct {
	name string
}

type Employee struct {
	id int
}

type FullTimeEmployee struct {
	Employee
	Person
	area string
}

type TemporaryEmployee struct {
	Employee
	Person
	deparment string
}

func (x FullTimeEmployee) getDetail() string {

	return "FullTime Employee"
}

func (x TemporaryEmployee) getDetail() string {

	return "Temporary Employee"
}

func (x FullTimeEmployee) hello() string {

	return "Hey FullTime Employee"
}

func (x TemporaryEmployee) hello() string {

	return "Hey Temporary Employee"
}

// Mi interface
type getDetails interface {
	getDetail() string
	hello() string
}

func PrintDetails(x getDetails) {
	fmt.Println(x.getDetail())
}

func Hello(x getDetails) {
	fmt.Println(x.hello())
}

func main() {
	e := FullTimeEmployee{}
	e.id = 14
	e.name = "Esteban Martinez"
	PrintDetails(e)
	e2 := TemporaryEmployee{}
	e2.name = "Elliot"
	e2.id = 7
	PrintDetails(e2)
	Hello(e2)
}
