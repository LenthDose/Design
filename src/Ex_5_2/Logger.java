package Ex_5_2;

public class Logger {

    private static int count;
    public void Log(String userId){

        System.out.println(userId+" 的查询次数+1");
        System.out.println(userId+" 查询的总次数 "+ ++count);
    }
}
