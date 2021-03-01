package ObjectOrientedProgram;

public abstract class 교실_청소당번 {
    private ClassRoom 담당_교실;

    public void 교실_청소당번(ClassRoom 교실) {
        담당_교실 = 교실;
    }

    public void 교실_이동(ClassRoom 교실) {
        담당_교실 = 교실;
    }

    public void 청소() {
    }

}
