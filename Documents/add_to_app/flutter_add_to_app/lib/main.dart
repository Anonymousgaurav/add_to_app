import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:flutter_spinkit/flutter_spinkit.dart';

void main() => runApp(chooseWidget(PlatformDispatcher.instance.defaultRouteName));

Widget chooseWidget(String route) {
  switch (route) {
  // name of the route defined in the host app
    case 'splashRoute':
      return const MyFlutterView();

    default:
      return const MyFlutterView();
  }
}

class MyFlutterView extends StatelessWidget {
  const MyFlutterView({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      home: SplashScreen(),
    );
  }
}

class SplashScreen extends StatelessWidget {
  const SplashScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return const Scaffold(
      backgroundColor: Colors.white,
      body: SpinKitDoubleBounce(
        color: Colors.purple,
        size: 100.0,
      ),
    );
  }
}