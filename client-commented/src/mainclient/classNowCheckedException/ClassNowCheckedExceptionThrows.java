package mainclient.classNowCheckedException;
public class ClassNowCheckedExceptionThrows {
    public int throwsExcep(boolean b) {
        if (b) {
            return 0;
        } else {
            throw new main.classNowCheckedException.ClassNowCheckedException();
        }
    }

    public int throwsSubExcep(boolean b) {
        if (b) {
            return 0;
        } else {
            throw new main.classNowCheckedException.ClassNowCheckedExceptionSub();
        }
    }

    public int throwsClientExcep(boolean b) {
        if (b) {
            return 0;
        } else {
            throw new mainclient.classNowCheckedException.ClassNowCheckedExceptionClient();
        }
    }

    public int throwsClientSubExcep(boolean b) {
        if (b) {
            return 0;
        } else {
            throw new mainclient.classNowCheckedException.ClassNowCheckedExceptionClientSub();
        }
    }

    public int throwsExcepChecked(boolean b) throws main.classNowCheckedException.ClassNowCheckedException {
        if (b) {
            return 0;
        } else {
            throw new main.classNowCheckedException.ClassNowCheckedException();
        }
    }

    public int throwsSubExcepChecked(boolean b) throws main.classNowCheckedException.ClassNowCheckedExceptionSub {
        if (b) {
            return 0;
        } else {
            throw new main.classNowCheckedException.ClassNowCheckedExceptionSub();
        }
    }

    public int throwsClientExcepChecked(boolean b) throws mainclient.classNowCheckedException.ClassNowCheckedExceptionClient {
        if (b) {
            return 0;
        } else {
            throw new mainclient.classNowCheckedException.ClassNowCheckedExceptionClient();
        }
    }

    public int throwsClientSubExcepChecked(boolean b) throws mainclient.classNowCheckedException.ClassNowCheckedExceptionClientSub {
        if (b) {
            return 0;
        } else {
            throw new mainclient.classNowCheckedException.ClassNowCheckedExceptionClientSub();
        }
    }

    public int throwsVariableException(boolean b) {
        main.classNowCheckedException.ClassNowCheckedException e = new main.classNowCheckedException.ClassNowCheckedException();
        if (b) {
            return 0;
        } else {
            throw e;
        }
    }

    public int throwsVariableExceptionChecked(boolean b) throws main.classNowCheckedException.ClassNowCheckedException {
        main.classNowCheckedException.ClassNowCheckedException e = new main.classNowCheckedException.ClassNowCheckedException();
        if (b) {
            return 0;
        } else {
            throw e;
        }
    }
}