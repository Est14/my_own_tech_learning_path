import React, { Component } from "react";


function EstadoHijo(props){
    return(
        <div>
            <h3>
                {props.contadorHijo}
            </h3>
        </div>
    )
}

class Estado extends Component {
  constructor(props) {
    super(props);
    this.state = {
      contador: 0,
    };

    setInterval(() => {
      this.setState({ contador: this.state.contador + 1 });
    }, 2000);
  }
  render() {
    return (
      <div>
        <h2>Estado</h2>
        <p>Se pasamos el estado al hijo</p>
        <EstadoHijo contadorHijo={this.state.contador} />
      </div>
    );
  }
}

export default Estado;
