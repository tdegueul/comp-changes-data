package mainclient.methodNowStatic;
public class MethodNowStaticExt extends main.methodNowStatic.MethodNowStatic {
    public int methodNowStaticClientSuperKeyAccess() {
        return super.methodNowStatic();
    }

    public int methodNowStaticClientNoSuperKeyAccess() {
        return methodNowStatic();
    }
}