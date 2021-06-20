package mainclient.classNoLongerPublic;
public class ClassNoLongerPublicExt extends main.classNoLongerPublic.ClassNoLongerPublic {
    public void accessNoSuperField() {
        int i = /* [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS] */
        field;
    }

    public void accessSuperField() {
        int i = /* [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS] */
        super.field;
    }

    public void accessNoSuperMethod() {
        int i = /* [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION] */
        method();
    }

    public void accessSuperMethod() {
        int i = /* [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION] */
        super.method();
    }
}