package mainclient.annotationDeprecatedAdded;
public class AnnotationDeprecatedAddedSA {
    /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
    main.annotationDeprecatedAdded.AnnDeprAddedEmptyClass emptyClass;

    /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
    main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClass nonEmptyClass;

    main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClassSub nonEmptyClassSub;

    main.annotationDeprecatedAdded.AnnDeprAddedFieldMethod nonDepClass;

    java.util.List<main.annotationDeprecatedAdded.IAnnDeprAdded> deprInterfaceAsTypeParam;

    public void deprecatedClassEmpty() {
        /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        main.annotationDeprecatedAdded.AnnDeprAddedEmptyClass a = /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        /* [ANNOTATION_DEPRECATED_ADDED:METHOD_INVOCATION] */
        new main.annotationDeprecatedAdded.AnnDeprAddedEmptyClass();
    }

    public void deprecatedClassNonEmpty() {
        /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClass a = /* [ANNOTATION_DEPRECATED_ADDED:METHOD_INVOCATION] */
        new main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClass();
        int f = /* [ANNOTATION_DEPRECATED_ADDED:FIELD_ACCESS] */
        a.transField;
        /* [ANNOTATION_DEPRECATED_ADDED:METHOD_INVOCATION] */
        /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        a.transMethod();
    }

    public void deprecatedClassNonEmptySub() {
        main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClassSub a = new main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClassSub();
        int f = /* [ANNOTATION_DEPRECATED_ADDED:FIELD_ACCESS] */
        a.transField;
        /* [ANNOTATION_DEPRECATED_ADDED:METHOD_INVOCATION] */
        a.transMethod();
    }

    public void deprecatedField() {
        main.annotationDeprecatedAdded.AnnDeprAddedFieldMethod a = new main.annotationDeprecatedAdded.AnnDeprAddedFieldMethod();
        int f = a.field;
    }

    public void deprecatedMethod() {
        main.annotationDeprecatedAdded.AnnDeprAddedFieldMethod a = new main.annotationDeprecatedAdded.AnnDeprAddedFieldMethod();
        int m = a.method();
    }

    public void deprecatedClassAnonymous() {
        /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        main.annotationDeprecatedAdded.AnnDeprAddedEmptyClass a = /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        new main.annotationDeprecatedAdded.AnnDeprAddedEmptyClass() {};
        /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClass b = /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        new main.annotationDeprecatedAdded.AnnDeprAddedNonEmptyClass() {};
    }

    public void deprecatedInterfaceAnonymous() {
        /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        main.annotationDeprecatedAdded.IAnnDeprAdded a = /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
        new main.annotationDeprecatedAdded.IAnnDeprAdded() {};
    }

    public void deprecatedClassAsParameter(/* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
    main.annotationDeprecatedAdded.AnnDeprAddedEmptyClass a) {
    }

    /* [ANNOTATION_DEPRECATED_ADDED:TYPE_DEPENDENCY] */
    public main.annotationDeprecatedAdded.IAnnDeprAdded deprecatedInterfaceAsReturnType() {
        return null;
    }

    public void deprecatedInterfaceAsTypeParam() {
        java.util.List<main.annotationDeprecatedAdded.IAnnDeprAdded> a = null;
    }
}