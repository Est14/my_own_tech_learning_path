import 'package:flutter/material.dart';

class AppTheme {
  static ThemeData light() {
    return ThemeData();
  }

  static ThemeData dark() {
    return ThemeData(
      brightness: Brightness.dark,
    );
  }
}
