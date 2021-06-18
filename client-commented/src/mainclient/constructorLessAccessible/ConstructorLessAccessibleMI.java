package mainclient.constructorLessAccessible;
public class ConstructorLessAccessibleMI {
    public void clientPublic() {
        main.constructorLessAccessible.ConstructorLessAccessiblePub2Pro c1 = new main.constructorLessAccessible.ConstructorLessAccessiblePub2Pro();
        main.constructorLessAccessible.ConstructorLessAccessiblePub2PackPriv c2 = new main.constructorLessAccessible.ConstructorLessAccessiblePub2PackPriv();
        main.constructorLessAccessible.ConstructorLessAccessiblePub2Priv c3 = new main.constructorLessAccessible.ConstructorLessAccessiblePub2Priv();
    }
}