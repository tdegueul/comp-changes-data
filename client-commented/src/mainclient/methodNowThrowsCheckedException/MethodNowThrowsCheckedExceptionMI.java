package mainclient.methodNowThrowsCheckedException;
public class MethodNowThrowsCheckedExceptionMI {
    public void callSuperMethod() {
        main.methodNowThrowsCheckedException.MethodNowThrowsCheckedException m = new mainclient.methodNowThrowsCheckedException.MethodNowThrowsCheckedExceptionExt();
        m.nowThrowsExcep();
    }

    public int callInterMethod() {
        main.methodNowThrowsCheckedException.IMethodNowThrowsCheckedException m = new mainclient.methodNowThrowsCheckedException.MethodNowThrowsCheckedExceptionImp();
        return m.nowThrowsExcep();
    }

    public void callSubtypeMethod() {
        main.methodNowThrowsCheckedException.MethodNowThrowsCheckedExceptionSub m = new main.methodNowThrowsCheckedException.MethodNowThrowsCheckedExceptionSub();
        m.nowThrowsExcep();
    }

    public void callClientSubtypeMethod() {
        mainclient.methodNowThrowsCheckedException.MethodNowThrowsCheckedExceptionExt m = new mainclient.methodNowThrowsCheckedException.MethodNowThrowsCheckedExceptionExt();
        m.nowThrowsExcep();
    }

    public int callImpMethod() {
        mainclient.methodNowThrowsCheckedException.MethodNowThrowsCheckedExceptionImp m = new mainclient.methodNowThrowsCheckedException.MethodNowThrowsCheckedExceptionImp();
        return m.nowThrowsExcep();
    }
}