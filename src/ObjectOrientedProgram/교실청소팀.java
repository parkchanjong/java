package ObjectOrientedProgram;

public class 교실청소팀 {
    protected ClassRoom 담당_교실;

    private 창문닦이_v2 창문닦이_1, 창문닦이_2;
    private 바닥쓸이_v2 바닥쓸이_1, 바닥쓸이_2, 바닥쓸이_3;
    private 칠판닦이_v2 칠판닦이_1;

    private 청소담당[] 팀원들 = {
            창문닦이_1, 창문닦이_2
            바닥쓸이_1, 바닥쓸이_2, 바닥쓸이_3,
            칠판닦이_1,
    };

    public 교실청소팀 (ClassRoom 교실) {
        담당_교실 = 교실;
        창문닦이_1 = new 창문닦이_v2(교실); 창문닦이_2 = new 창문닦이_v2(교실);
        바닥쓸이_1 = new 바닥쓸이_v2(교실); 바닥쓸이_2 = new 바닥쓸이_v2(교실);
        바닥쓸이_3 = new 바닥쓸이_v2(교실); 칠판닦이_1 = new 칠판닦이_v2(교실);
    }

    public void 교실청소 () {
        for (청소담당 팀원: 팀원들) {
            팀원.청소();
        }
    }

    public boolean 청소완료 () {
        return 담당_교실.창문_깨끗함() && 담당_교실.바닥_깨끗함() && 담당_교실.칠판_깨끗함();
    }

    public void 교실_이동 (ClassRoom 교실) {
        for (청소담당 팀원: 팀원들) {
            팀원.교실_이동(교실);
        }
    }

}
