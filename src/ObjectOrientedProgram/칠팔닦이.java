package ObjectOrientedProgram;

public class 칠팔닦이 {

    private ClassRoom 담당_교실;
    private int 지우개_깨끗함 = 0;

    public 칠팔닦이(ClassRoom 교실) {
        담당_교실 = 교실;
    }

    public void 칠판_닦기 () {
        while (!담당_교실.칠판_꺠끗함()) {
            if (지우개_깨끗함 <= 10)
                털기(지우개_깨끗함);
        }
        담당_교실.칠판_닦기(지우개_깨끗함);
    }
}
