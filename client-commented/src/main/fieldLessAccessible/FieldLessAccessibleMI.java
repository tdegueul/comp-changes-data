package main.fieldLessAccessible;
public class FieldLessAccessibleMI {
    public void clientPublic() {
        main.fieldLessAccessible.FieldLessAccessible c = new main.fieldLessAccessible.FieldLessAccessible();
        int i = c.public2packageprivate;
    }

    public void clientProtected() {
        main.fieldLessAccessible.FieldLessAccessible c = new main.fieldLessAccessible.FieldLessAccessible();
        int i = c.protected2packageprivate;
    }
}