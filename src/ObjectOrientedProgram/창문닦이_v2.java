package ObjectOrientedProgram;

public class 창문닦이_v2 implements 청소담당 {
    private ClassRoom 담당_교실;
    private int 행주_깨끗함 = 100;
    private double 윈덱스_리터 = 10.0;

    public 창문닦이_v2(ClassRoom 교실) {
        담당_교실 = 교실;
    }

    public void 창문_닦기() {
        while (!담당_교실.창문_깨끗함()) {
            if (행주_깨끗함 <= 10)
                빨아오기(행주_깨끗함);
            if (윈덱스_리터 <= 1)
                리필해오기(윈덱스_리터);
            담당_교실.창문_닦기(행주_깨끗함, 윈덱스_리터);
        }
    }

    @Override
    public void 청소() {
        창문_닦기();
    }

    @Override
    public void 교실_이동(ClassRoom 교실) {
        담당_교실 = 교실;
    }
}
