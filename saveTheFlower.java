void saveTheFlower () {
  moveForward ();
  pickBeeper ();
  repeat (4) {
    turnLeft ();
    moveForward ();
    moveForward ();
    turnRight ();
    moveForward ();
  }
  dropBeeper ();
  repeat (4) {
    moveForward ();
    turnRight ();
    moveForward ();
    moveForward ();
    turnLeft ();
  }
}
