package mainclient.annotationDeprecatedAdded;
public class AnnotationDeprecatedAddedExtSub extends main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClassSub {
    public void deprecatedNoSuperKey() {
        int f = /* [ANNOTATION_DEPRECATED_ADDED:FIELD_ACCESS] */
        transField;
        /* [ANNOTATION_DEPRECATED_ADDED:METHOD_INVOCATION] */
        transMethod();
    }

    public void deprecatedSuperKey() {
        int f = /* [ANNOTATION_DEPRECATED_ADDED:FIELD_ACCESS] */
        super.transField;
        /* [ANNOTATION_DEPRECATED_ADDED:METHOD_INVOCATION] */
        super.transMethod();
    }
}