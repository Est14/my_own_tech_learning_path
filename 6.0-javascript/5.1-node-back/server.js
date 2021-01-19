// This module allow us create a server
const http = require("http");

const handleServer = (req, res) => {
  res.writeHead(200);
  res.write("<h1> Hello Esteban </h1>");
  res.end();
};

const server = http.createServer(handleServer);

server.listen(3000, () => {
  console.log("Server PORT: 3000");
});
