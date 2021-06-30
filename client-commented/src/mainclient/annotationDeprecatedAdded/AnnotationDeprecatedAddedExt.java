package mainclient.annotationDeprecatedAdded;
/* [ANNOTATION_DEPRECATED_ADDED:EXTENDS] */
public class AnnotationDeprecatedAddedExt extends main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClass {
    public void deprecatedNoSuperKey() {
        int f = /* [ANNOTATION_DEPRECATED_ADDED:FIELD_ACCESS] */
        /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        transField;
        /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        /* [ANNOTATION_DEPRECATED_ADDED:METHOD_INVOCATION] */
        transMethod();
    }

    public void deprecatedSuperKey() {
        int f = /* [ANNOTATION_DEPRECATED_ADDED:FIELD_ACCESS] */
        /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        super.transField;
        /* [ANNOTATION_DEPRECATED_ADDED:METHOD_INVOCATION] */
        super.transMethod();
    }
}