package main.constructorLessAccessible;
public class ConstructorLessAccessibleMI {
    public void clientPublic() {
        main.constructorLessAccessible.ConstructorLessAccessiblePub2PackPriv c = new main.constructorLessAccessible.ConstructorLessAccessiblePub2PackPriv();
    }

    public void anonymousAccess() {
        main.constructorLessAccessible.ConstructorLessAccessiblePub2PackPriv c = new main.constructorLessAccessible.ConstructorLessAccessiblePub2PackPriv() {};
    }
}