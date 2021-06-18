package mainclient.methodNoLongerStatic;
public class MethodNoLongerStaticMI {
    public int methodNoLongerStaticClientClass() {
        return main.methodNoLongerStatic.MethodNoLongerStatic.methodNoLongerStatic();
    }

    public int methodNoLongerStaticClientObject() {
        main.methodNoLongerStatic.MethodNoLongerStatic m = new main.methodNoLongerStatic.MethodNoLongerStatic();
        return m.methodNoLongerStatic();
    }
}