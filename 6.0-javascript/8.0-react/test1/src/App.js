import "./App.css";
import Navbar from "./components/Navbar";
import Switch from "./components/Switch";
import { BrowserRouter as Router } from "react-router-dom";

function App() {
  return (
    <Router className="App">
      <Navbar />
      <Switch />
    </Router>
  );
}

export default App;
