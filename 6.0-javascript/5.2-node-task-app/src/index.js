const express = require("express");
const path = require("path");
const exphbs = require("express-handlebars");
const methodOverride = require("method-override");
const session = require("express-session");

// Initializations
const app = express();
const db = require("./dabases");

// Settings
app.set("port", process.env.PORT || 3500);
app.set("views", path.join(__dirname, "views"));
app.engine(
  ".hbs",
  exphbs({
    defaultLayout: "main",
    layoutsDir: path.join(app.get("views"), "layouts"),
    partialsDir: path.join(app.get("views"), "partials"),
    extname: ".hbs",
  })
);
app.set("view engine", ".hbs");

// Middleware
app.use(express.urlencoded({ extended: false }));
app.use(methodOverride("_method"));
app.use(
  session({
    secret: "SiulNabetse",
    resave: true,
    saveUninitialized: true,
  })
);

// Gloval varibles

// Routes
app.use(require("./routes/index"));
app.use(require("./routes/notes"));
app.use(require("./routes/users"));

// Static files
app.use(express.static(path.join(__dirname, "public")));

// Server run
app.listen(app.get("port"), () => {
  console.log(`Server on port ${app.get("port")}`);
});
