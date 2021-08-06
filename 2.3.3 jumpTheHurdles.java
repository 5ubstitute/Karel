void jumpTheHurdles () {
  while (! onBeeper ()) {
    if (frontIsClear ()) {
      moveForward ();
    }
    else {
      turnLeft ();
      while (!rightIsClear ()) {
        moveForward ();
      }
      turnRight ();
      moveForward ();
      turnRight ();
      while (frontIsClear ()) {
        moveForward ();
      }
      turnLeft ();
    }
  }
}
