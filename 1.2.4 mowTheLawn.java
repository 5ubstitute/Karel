void mowTheLawn () {
  repeat (3) {
    mowRow ();
    turnLeft ();
    moveForward ();
    turnLeft ();
    mowRow ();
    if (rightIsClear()) {
      turnRight();
      moveForward();
      turnRight();
    }
  }
}

void mowRow () {
  repeat (6) {
    moveForward ();
    pickBeeper ();
  }
  moveForward ();
}
