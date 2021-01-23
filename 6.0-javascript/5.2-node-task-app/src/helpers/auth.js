const helpers = {};

helpers.isAuthenticated = (req, res, next) => {
  if (req.isAuthenticated()) {
    return next();
  } else {
    req.flash();
    res.redirect("/users/signin");
  }
};

module.exports = helpers;
