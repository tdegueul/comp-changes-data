package mainclient.methodNowAbstract;
public class MethodNowAbstractExt extends main.methodNowAbstract.MethodNowAbstract {
    @java.lang.Override
    public int methodStayAbstract() {
        return 0;
    }

    public int methodNowAbstractClientSuperKey() {
        return super.methodNowAbstract();
    }

    public int methodNowAbstractClientNoSuperKey() {
        return methodNowAbstract();
    }
}