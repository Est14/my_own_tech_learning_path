class Animal {
  constructor(especie, age, color) {
    this.especie = especie;
    this.age = age;
    this.color = color;
  }
}

class Perro extends Animal {
  constructor(especie, age, color) {
    super(especie, age, color);
    this.raza = null;
  }

  set modificaRaza(raza) {
    this.raza = raza;
  }

  get raza(){
      return this.raza
  }

  verinfo() {
    console.log(
      `Especia ${this.especie}\nAge: ${this.especie}\nColor: ${this.color}\nRaza: ${this.raza}`
    );
  }
}

const dog1 = new Perro("Perro", 7, "Brown");
console.log(dog1.age);
dog1.modificaRaza = "Chiguagua";
dog1.verinfo();
