void decrement () {
  while (!onBeeper ()) {
    dropBeeper ();
    moveForward ();
  }
  pickBeeper ();
}
