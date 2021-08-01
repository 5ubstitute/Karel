void defuseOneBomb () {
  repeat (9) {
    moveForward ();
  }
  pickBeeper ();
  turnAround ();
  repeat (9) {
    moveForward ();
  }
  turnAround ();
}
