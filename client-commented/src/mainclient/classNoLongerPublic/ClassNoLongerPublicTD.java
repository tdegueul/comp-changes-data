package mainclient.classNoLongerPublic;
public class ClassNoLongerPublicTD {
    /* [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY] */
    main.classNoLongerPublic.ClassNoLongerPublic field;

    public ClassNoLongerPublicTD(/* [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY] */
    main.classNoLongerPublic.ClassNoLongerPublic field) {
        /* [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY] */
        /* [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY] */
        this.field = /* [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY] */
        field;
    }

    public void refClassNoLongerPublic() {
        /* [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY] */
        main.classNoLongerPublic.ClassNoLongerPublic c = /* [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION] */
        new main.classNoLongerPublic.ClassNoLongerPublic();
    }
}