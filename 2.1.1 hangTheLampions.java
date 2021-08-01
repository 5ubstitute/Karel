void hangTheLampions () {
  repeat (10) {
    turnLeft ();
    pickBeeper ();
    while (frontIsClear ()) {
      moveForward ();
    }
    dropBeeper ();
    turnAround ();
    while (frontIsClear () {
      moveForward ();
    }
    turnLeft ();
    if (frontIsClear ()) {
      moveForward ();
    }
  }
}
