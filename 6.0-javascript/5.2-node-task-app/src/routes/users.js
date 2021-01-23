const router = require("express").Router();
const User = require("../models/Users");

router.get("/users/singin", (req, res) => {
  res.render('users/singin');
});

router.post("/users/signup", async (req, res) => {
  const { name, email, password, c_password } = req.body;
  const errors = [];

  if (name === "") {
    errors.push({ text: "Please write a name" });
  }
  if (email === "") {
    errors.push({ text: "Please write an email" });
  }

  if (password === "") {
    errors.push({ text: "Please write a paswoerd" });
  }

  if (password != c_password) {
    errors.push({ text: "Passwords don't match" });
  }
  if (password.length < 4) {
    errors.push({ text: "Password must be at least 4 characters" });
  }
  if (errors.length > 0) {
    res.render("users/singup", { errors, name, email, password, c_password });
  } else {
    const userEmail = await User.findOne({ email: email });
    if (userEmail) {
      req.flash("error_msg", "Email is already in use");
      res.render("users/singup", {name, email, password, c_password });
    } else {
      const newUser = new User({ name, email, password });
      newUser.password = await newUser.encryptPassword(password);
      await newUser.save();
      req.flash("success_msg", "You are registered");
      res.redirect("/users/singin");
    }
  }
});

module.exports = router;
