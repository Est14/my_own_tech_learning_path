package main

type Employee struct {
	id   int
	name string
}

func (x *Employee) setId(i int) {
	x.id = i
}

func (x *Employee) getId() int {
	return x.id
}

func (x *Employee) setName(i string) {
	x.name = i
}

func (x *Employee) getName() string {

	return x.name
}

func NewEmployee(id int, name string) *Employee {
	return &Employee{
		id:   id,
		name: name,
	}
}
