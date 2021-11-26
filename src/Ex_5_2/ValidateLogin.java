package Ex_5_2;

public class ValidateLogin {

    public boolean Validate(String userId){
        if (userId.equals("1111")){
            System.out.println(userId+" 登录成功 ");
            return true;
        }
        else {
            System.out.println(userId+" 登录失败 ");
        }
        return false;
    }
}
