void mowTheLawn () {
  repeat (2) {
    mowRow ();
    turnLeft ();
    moveForward ();
    turnLeft ();
    mowRow ();
    turnRight ();
    moveForward ();
    turnRight ();
  }
  mowRow ();
  turnLeft ();
  moveForward ();
  turnLeft ();
  mowRow ();
}

void mowRow () {
  repeat (6) {
    moveForward ();
    pickBeeper ();
  }
  moveForward ();
}
