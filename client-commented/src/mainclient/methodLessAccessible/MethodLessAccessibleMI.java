package mainclient.methodLessAccessible;
public class MethodLessAccessibleMI {
    main.methodLessAccessible.MethodLessAccessible m;

    public MethodLessAccessibleMI() {
        m = new main.methodLessAccessible.MethodLessAccessible();
    }

    public int methodLessAccessiblePub2ProClientSimpleAccess() {
        return m.methodLessAccessiblePublic2Protected();
    }

    public int methodLessAccessiblePub2PackPrivClientSimpleAccess() {
        return m.methodLessAccessiblePublic2PackPriv();
    }

    public int methodLessAccessiblePub2PrivClientSimpleAccess() {
        return m.methodLessAccessiblePublic2Private();
    }
}