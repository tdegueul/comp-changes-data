package mainclient.methodNoLongerThrowsCheckedException;
public class MethodNoLongerThrowsCheckedExceptionMI {
    public void callSuperMethod() {
        main.methodNoLongerThrowsCheckedException.MethodNoLongerThrowsCheckedException m = new mainclient.methodNoLongerThrowsCheckedException.MethodNoLongerThrowsCheckedExceptionExt();
        try {
            m.noLongerThrowsExcep();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public int callInterMethod() {
        main.methodNoLongerThrowsCheckedException.IMethodNoLongerThrowsCheckedException m = new mainclient.methodNoLongerThrowsCheckedException.MethodNoLongerThrowsCheckedExceptionImp();
        try {
            return m.noLongerThrowsExcep();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void callSubtypeMethod() {
        main.methodNoLongerThrowsCheckedException.MethodNoLongerThrowsCheckedExceptionSub m = new main.methodNoLongerThrowsCheckedException.MethodNoLongerThrowsCheckedExceptionSub();
        try {
            m.noLongerThrowsExcep();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public void callClientSubtypeMethod() {
        mainclient.methodNoLongerThrowsCheckedException.MethodNoLongerThrowsCheckedExceptionExt m = new mainclient.methodNoLongerThrowsCheckedException.MethodNoLongerThrowsCheckedExceptionExt();
        try {
            m.noLongerThrowsExcep();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public int callImpMethod() {
        mainclient.methodNoLongerThrowsCheckedException.MethodNoLongerThrowsCheckedExceptionImp m = new mainclient.methodNoLongerThrowsCheckedException.MethodNoLongerThrowsCheckedExceptionImp();
        try {
            return m.noLongerThrowsExcep();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}