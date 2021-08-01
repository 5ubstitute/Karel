void increment () {
  while (onBeeper ()) {
    pickBeeper ();
    moveForward ();
  }
  dropBeeper ();
}
