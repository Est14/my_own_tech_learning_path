class Phone {
  constructor(color, peso, resolucionP, resolucionC, ram) {
    this.color = color;
    this.peso = peso;
    this.resolucionP = resolucionP;
    this.resolucionC = resolucionC;
    this.ram = ram;
    this.On = false;
    this.Off = true;
  }

  infoCel() {
    console.log(
      `Color: ${this.color}\nPeso: ${this.peso}lb\nRes_Pantalla: ${this.resolucionP}px\nRes_Camara: ${this.resolucionC} px\nRAM: ${this.ram}`
    );
  }

  powerOn() {
    if (this.Off === true) {
      console.log("Encendiendo ...");
      setTimeout(() => {
        console.log("Encendido");
        console.log("--o--");
        this.On = true;
        this.Off = false;
      }, 2000);
    } else {
      console.log("");
    }
  }

  powerOff() {
    if (this.On === true) {
      console.log("Apangando ...");
      setTimeout(() => console.log("Apagado"), 2000);
      console.log("--o--");
      this.Off = true;
      this.On = false;
    } else {
      console.log("-----");
    }
  }

  reboot() {
    if (this.On === true) {
      console.log("Reiniciando ...");
      setTimeout(() => console.log("Apagado"), 1000);
      setTimeout(() => console.log("Encendido"), 2000);
      console.log("--o--");
    } else {
      console.log("-----");
    }
  }

  record_picture () {
    if (this.On === true) {
      console.log("Click");
    } else {
      console.log("-----");
    }
  }

  record_video() {
    if (this.On) {
      console.log("Recording -o-");
    } else {
      console.log("-----");
    }
  }
}

const motoOne = new Phone("Blue", 0.2, "500x1080", 24, 2);
motoOne.infoCel();
motoOne.powerOff();
motoOne.record_video();
motoOne.powerOn();
motoOne.record_video();
