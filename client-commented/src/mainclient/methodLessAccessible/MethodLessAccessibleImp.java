package mainclient.methodLessAccessible;
public class MethodLessAccessibleImp implements main.methodLessAccessible.IMethodLessAccessible {
    @java.lang.Override
    public int methodLessAccessiblePackPriv2Public() {
        return 0;
    }

    @java.lang.Override
    public int methodLessAccessiblePublic2PackPriv() {
        return 0;
    }
}