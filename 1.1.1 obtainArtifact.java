void obtainArtifact () {
  turnRight ();
  moveForward ();
  turnLeft ();
  repeat (3) {
    moveForward ();
  }
  turnLeft ();
  moveForward ();
  pickBeeper ();
  moveForward ();
  turnLeft ();
  repeat (3) {
    moveForward ();
  }
  turnLeft ();
  moveForward ();
  dropBeeper ();
}
