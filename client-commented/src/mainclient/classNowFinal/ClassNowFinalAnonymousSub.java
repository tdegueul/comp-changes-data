package mainclient.classNowFinal;
public class ClassNowFinalAnonymousSub {
    public void classNowFinalAnonymousSub() {
        main.classNowFinal.ClassNowFinal c = new main.classNowFinal.ClassNowFinal() {};
    }

    public void classNowFinalAnonymousSubAbs() {
        main.classNowFinal.ClassNowFinalAbs c = new main.classNowFinal.ClassNowFinalAbs() {
            @java.lang.Override
            public int m() {
                return 0;
            }
        };
    }
}