package ObjectOrientedProgram;

public class 칠판닦이_v2 implements 청소담당 {
    private ClassRoom 담당_교실;
    private int 지우개_깨끗함 = 0;

    public 칠판닦이_v2(ClassRoom 교실) {
        담당_교실 = 교실;
    }

    public void 칠판_닦기() {
        while (!담당_교실.지우개_깨끗함()) {
            if (지우개_깨끗함 <= 10)
                털기(지우개_깨끗함);
            담당_교실.칠판_닦이(지우개_깨끗함);
        }
    }

    @Override
    public void 청소() {
        칠판_닦기();
    }

    @Override
    public void 교실_이동(ClassRoom 교실) {
        담당_교실 = 교실;
    }
}
