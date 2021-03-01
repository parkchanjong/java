package ObjectOrientedProgram;

public class 과학실청소팀_v2 extends 교실청소팀{
    public 과학실청소팀_v2(ClassRoom 교실) {
        super(교실);
        실험기구닦이_1 = new 실험기구닦이(교실);
    }

    @Override
    public void 교실청소 () {
        super.교실청소();
        실험기구닦이_1.청소();
    }

    @Override
    public boolean 청소완료 () {
        return super.청소완료() && 담당_교실.실험기구_깨끗함();
    }

    @Override
    public void 교실_이동 (ClassRoom 교실) {
        super.교실_이동(교실);
        실험기구닦이_1..교실_이동(교실);
    }
}
