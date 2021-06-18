package mainclient.methodNowFinal;
public class MethodNowFinalExt extends main.methodNowFinal.MethodNowFinal {
    // [METHOD_NOW_FINAL:METHOD_OVERRIDE]
    @java.lang.Override
    public int methodNowFinal() {
        return 1;
    }

    // [METHOD_NOW_FINAL:METHOD_OVERRIDE]
    @java.lang.Override
    public int sMethodNowFinal() {
        return 10;
    }

    public int methodNowFinalClient() {
        return super.methodNowFinal();
    }
}