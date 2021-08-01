void cleanTheRoom () {
  repeat (5) {
    clean ();
    cleanRow ();
    turnLeft ();
    moveForward ();
    clean ();
    turnLeft ();
    cleanRow ();
    if (rightIsClear ()) {
      turnRight ();
      moveForward ();
      turnRight ();
    }
  }
}

void cleanRow () {
  repeat (9) {
    moveForward ();
    clean ();
  }
}

void clean () {
  if (onBeeper ()) {
    pickBeeper ();
  }
}
