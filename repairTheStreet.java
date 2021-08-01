void repareTheStreet () {
  repeat (10) {
    if (rightIsClear ()) {
      turnRight ();
      moveForward ();
      dropBeeper ();
      turnAround ();
      moveForward ();
      turnRight ();
    }
    if (frontIsClear ()) {
      moveForward ();
    }
  }
}
