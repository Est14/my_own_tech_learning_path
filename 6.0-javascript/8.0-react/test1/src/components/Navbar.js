import React, { useState } from "react";
import Switch from "./Switch";
import { Link } from "react-router-dom";
import  State from "./State";
import "./Navbar.css";

function Navbar() {
  const [click, setClick] = useState(false);

  const handleClick = () => setClick(!click);
  const closeMobileMenu = () => setClick(false);

  return (
    <div>
      <nav className="navbar">
        <Link to="/" className="navbar-logo">
          EST14
        </Link>
        <div className="menu-icon" onClick={handleClick}>
          <i className={click ? "fas fa-times" : "fas fa-bars"} />
        </div>
        <ul className={click ? "nav-menu active" : "nav-menu"}>
          <li className="nav-item">
            <div className="nav-links" onClick={closeMobileMenu}>
              <Switch />
              <span className="conection">Off / On</span>
            </div>
          </li>
          <li className="nav-item">
            <Link to="/" className="nav-links" onClick={closeMobileMenu}>
              <State />
              <span className="conection">Power</span>
            </Link>
          </li>
          <li className="nav-item">
            <Link to="/" className="nav-links" onClick={closeMobileMenu}>
              <span className="start"></span>
              <span className="conection">Start</span>
            </Link>
          </li>
        </ul>
      </nav>
    </div>
  );
}

export default Navbar;
