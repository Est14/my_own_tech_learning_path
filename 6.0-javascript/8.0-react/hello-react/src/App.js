import React from "react";
import "./App.css";
import Estado from "./components/Estado";
import Eventos from "./components/Eventos";
import Propiedades from "./components/Propiedades";
import RenderizadoCondicional from "./components/RenderizadoCond"
import RenderizadoEle from "./components/RenderizadoEle";

function App() {
  return (
    <div className="App">
      <h1>Hey man</h1>
      <hr />
      <Propiedades
        string="props_string"
        numero={10}
        booleano={true}
        array={["mango", "Patilla", "Banano"]}
        area = {(num=2) => num * num}
      />
      <hr/>
      <Estado/>
      <hr/>
      <RenderizadoCondicional />
      <hr/>
      <RenderizadoEle/>
      <hr></hr>
      <Eventos />
    </div>
  );
}

export default App;
