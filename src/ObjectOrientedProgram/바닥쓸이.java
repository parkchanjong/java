package ObjectOrientedProgram;

public class 바닥쓸이 {

    private ClassRoom 담당_교실;
    private double 쓰레받기_채움 = 0;

    public 바닥쓸이 (ClassRoom 교실) {
        담당_교실 = 교실;
    }

    public void 바닥_쓸기 () {
        while (!담당_교실.바닥_꺠끗함()) {
            if (쓰레받기_채움 >= 0.9)
                비우기(쓰레받기_채움);
        }
        담당_교실.바닥_쓸기(쓰레받기_채움);
    }
}
