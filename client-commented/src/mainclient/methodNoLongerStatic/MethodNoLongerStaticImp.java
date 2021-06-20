package mainclient.methodNoLongerStatic;
/* [METHOD_NOW_ABSTRACT:IMPLEMENTS] */
public class MethodNoLongerStaticImp implements main.methodNoLongerStatic.IMethodNoLongerStatic {
    public int methodNoLongerStaticClient() {
        return /* [METHOD_NOW_ABSTRACT:METHOD_INVOCATION] */
        main.methodNoLongerStatic.IMethodNoLongerStatic.methodNoLongerStatic();
    }
}