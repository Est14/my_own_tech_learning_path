import 'package:flutter/material.dart';

class DescriptionPlace extends StatelessWidget {
  String namePlace;
  double stars;
  String description;

  DescriptionPlace(this.namePlace, this.stars, this.description);

  @override
  Widget build(BuildContext context) {
    final starHalf = Container(
      margin: EdgeInsets.only(
        top: 323.0,
        right: 3.0,
      ),
      child: Icon(Icons.star_half, color: Color(0xFFf2C611)),
    );

    final starBorder = Container(
      margin: EdgeInsets.only(
        top: 323.0,
        right: 3.0,
      ),
      child: Icon(Icons.star_border, color: Color(0xFFf2C611)),
    );

    final star = Container(
      margin: EdgeInsets.only(
        top: 323.0,
        right: 3.0,
      ),
      child: Icon(Icons.star, color: Color(0xFFf2C611)),
    );

    final titleStars = Row(
      children: <Widget>[
        Container(
            margin: EdgeInsets.only(
              top: 320.0,
              left: 20.0,
              right: 20.0,
            ),
            child: new Text(
              namePlace,
              style: TextStyle(
                  fontSize: 30.0,
                  fontWeight: FontWeight.w900,
                  fontFamily: "Lato"),
              textAlign: TextAlign.left,
            )),
        Row(
          children: <Widget>[star, star, star, star, starHalf],
        )
      ],
    );

    final descriptionFinal = Row(
      children: <Widget>[
        Container(
          margin: EdgeInsets.only(
            top: 15.0,
            left: 20.0,
            right: 20.0,
          ),
          child: new Text(description,
              style: TextStyle(
                  fontSize: 16.0,
                  fontWeight: FontWeight.bold,
                  fontFamily: "Lato",
                  color: Color(0xFF56575a))),
        )
      ],
    );

    return Column(
      children: <Widget>[
        titleStars,
        descriptionFinal,
      ],
    );
  }
}
