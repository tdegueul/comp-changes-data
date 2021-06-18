package mainclient.methodNowAbstract;
public class MethodNowAbstractImp implements main.methodNowAbstract.IMethodNowAbastract {
    @java.lang.Override
    public int methodStayAbstract() {
        return 0;
    }

    public int methodNowAbstractClient() {
        return main.methodNowAbstract.IMethodNowAbastract.methodNowAbstract();
    }
}