void fillTheHoles () {
  repeat (4) {
    moveForward ();
    turnRight ();
    moveForward ();
    dropBeeper ();
    turnAround ();
    moveForward ();
    turnRight ();
    moveForward ();
  }
}
