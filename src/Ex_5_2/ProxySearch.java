package Ex_5_2;

public class ProxySearch implements Search{

    private final Search search = new RealSearch();

    @Override
    public void DoSearch(String userId, String keyword) {
        if (Validate(userId)){
            search.DoSearch(userId,keyword);
            Logger(userId);
        }
    }

    public boolean Validate(String userId){
        ValidateLogin validateLogin = new ValidateLogin();
        return validateLogin.Validate(userId);
    }

    public void Logger(String userId){
        Logger logger = new Logger();
        logger.Log(userId);
    }
}
