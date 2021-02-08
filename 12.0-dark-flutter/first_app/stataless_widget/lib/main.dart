import 'package:flutter/material.dart';

void main() {
  runApp(new MaterialApp(
    home: Myapp(),
  ));
}

class Myapp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      appBar: new AppBar(
        title: new Text(
          "Ajartar",
          style: new TextStyle(color: Colors.white, fontSize: 30.0),
        ),
      ),
      body: new Container(
        child: Center(
            child: new Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: <Widget>[
            new MyCard(
              title: new Text(
                'I love flutter',
                style: new TextStyle(color: Colors.brown, fontSize: 30.0),
              ),
              icon: new Icon(
                Icons.favorite,
                size: 40.0,
                color: Colors.blue,
              ),
            ),
            new MyCard(
              title: new Text('I like this video',
                  style: new TextStyle(color: Colors.brown, fontSize: 30.0)),
              icon: new Icon(
                Icons.thumb_up,
                size: 40.0,
                color: Colors.greenAccent,
              ),
            ),
            new MyCard(
                title: new Text('A jarcartar.com',
                    style: new TextStyle(color: Colors.brown, fontSize: 30.0)),
                icon: new Icon(
                  Icons.local_drink,
                  size: 40.0,
                  color: Colors.orangeAccent,
                ))
          ],
        )),
      ),
    );
  }
}

class MyCard extends StatelessWidget {
  final Widget title;
  final Widget icon;

  MyCard({this.title, this.icon});

  @override
  Widget build(BuildContext context) {
    return new Container(
      padding: const EdgeInsets.only(bottom: 3.0),
      child: new Card(
          child: Container(
        padding: EdgeInsets.all(20.0),
        child: Column(
          children: <Widget>[this.title, this.icon],
        ),
      )),
    );
  }
}
