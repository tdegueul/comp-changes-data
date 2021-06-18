package mainclient.fieldMoreAccessible;
public class FieldMoreAccessibleMI {
    private main.fieldMoreAccessible.FieldMoreAccessible c;

    public FieldMoreAccessibleMI() {
        c = new main.fieldMoreAccessible.FieldMoreAccessible();
    }

    public void public2packageprivate() {
        int v = c.public2packageprivate;
    }

    public void public2private() {
        int v = c.public2private;
    }

    public void public2protected() {
        int v = c.public2protected;
    }
}