import 'dart:io';

void main(List<String> arguments) {
  var D = stdin.readLineSync();
  int dis = int.parse(D!);
  if (dis <= 800) {
    stdout.writeln("1");
  } else if (dis > 800 && dis <= 1400) {
    stdout.writeln("2");
  } else if (dis > 1400 && dis <= 2000) {
    stdout.writeln("3");
  }
}
