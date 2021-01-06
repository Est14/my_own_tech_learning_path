const express = require("express");
const router = express.Router();
const response = require('../../network/response');

router.get("/", (req, res) => {
  console.log(req.headers);
  response.sucess(req, res, "Estoy enviando algo al servidor yeah !!");
});

router.post("/", (req, res) => {
  console.log(req.query);
  if (req.query.error == "ok") {
    response.error(req, res, "Error Simulado", 400);
  } else {
    response.sucess(req, res, "Estoy enviando algo con post yeah !!", 201);
  }
});

module.exports = router;