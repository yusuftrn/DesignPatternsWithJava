package behavioral.ChainOfResponsibility.chainExample1.middleware;

public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
       if(email.equals("yusuf@root.com")){
           System.out.println("Hello Admin!");
           return true;
       }
       System.out.println("Hello, user!");
       return checkNext(email, password);
    }
}
