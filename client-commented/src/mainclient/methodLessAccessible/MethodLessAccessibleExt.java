package mainclient.methodLessAccessible;
public class MethodLessAccessibleExt extends main.methodLessAccessible.MethodLessAccessible {
    @java.lang.Override
    public int methodLessAccessiblePublic2Protected() {
        return 100;
    }

    @java.lang.Override
    public int methodLessAccessiblePublic2PackPriv() {
        return 101;
    }

    @java.lang.Override
    public int methodLessAccessiblePublic2Private() {
        return 102;
    }

    @java.lang.Override
    protected int methodLessAccessibleProtected2Public() {
        return 103;
    }

    @java.lang.Override
    protected int methodLessAccessibleProtected2PackPriv() {
        return 104;
    }

    @java.lang.Override
    protected int methodLessAccessibleProtected2Private() {
        return 105;
    }
}