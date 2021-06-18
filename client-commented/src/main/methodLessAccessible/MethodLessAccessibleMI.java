package main.methodLessAccessible;
public class MethodLessAccessibleMI {
    public void clientPublic() {
        main.methodLessAccessible.MethodLessAccessible c = new main.methodLessAccessible.MethodLessAccessible();
        int i = c.methodLessAccessiblePublic2PackPriv();
    }

    public void clientProtected() {
        main.methodLessAccessible.MethodLessAccessible c = new main.methodLessAccessible.MethodLessAccessible();
        int i = c.methodLessAccessibleProtected2PackPriv();
    }
}