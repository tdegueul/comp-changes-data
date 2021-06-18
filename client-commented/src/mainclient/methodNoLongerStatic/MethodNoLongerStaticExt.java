package mainclient.methodNoLongerStatic;
public class MethodNoLongerStaticExt extends main.methodNoLongerStatic.MethodNoLongerStatic {
    public int methodNoLongerStaticSuperKeyAccess() {
        return super.methodNoLongerStatic();
    }

    public int methodNoLongerStaticNoSuperKeyAccess() {
        return main.methodNoLongerStatic.MethodNoLongerStatic.methodNoLongerStatic();
    }
}