package Ex_5_2;

public class RealSearch implements Search{

    @Override
    public void DoSearch(String userId, String keyword) {
        System.out.println(userId+" 查询 "+keyword);
    }
}
