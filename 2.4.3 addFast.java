void addFast () {
    repeat (8) {
        if (onBeeper ()) {
            moveForward ();
            if (onBeeper ()) {
                moveForward ();
                if (onBeeper ()) {
                    add ();
                    moveForward ();
                    dropBeeper ();
                }
                else {
                    carry ();
                }
            }
            else {
                moveForward ();
                if (onBeeper ()) {
                    carry ();
                }
                else {
                    add ();
                }
            }
        }
        else {
            moveForward ();
            if (onBeeper ()) {
                moveForward ();
                if (onBeeper ()) {
                    carry ();
                }
                else {
                    add ();
                }
            }
            else {
                moveForward ();
                if (onBeeper ()) {
                    add ();
                }
                else {
                    turnRight ();
                    moveForward ();
                    turnRight ();
                }
            }
        }
        while (frontIsClear ()) {
            moveForward ();
        }
        turnAround ();
    }
}

void add () {
    moveForward ();
    dropBeeper ();
    turnRight ();
    moveForward ();
    turnRight ();
}

void carry () {
    turnRight ();
    moveForward ();
    dropBeeper ();
    turnRight ();
}
