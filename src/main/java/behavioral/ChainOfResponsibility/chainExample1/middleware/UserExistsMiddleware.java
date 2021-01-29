package behavioral.ChainOfResponsibility.chainExample1.middleware;

import behavioral.ChainOfResponsibility.chainExample1.server.Server;

public class UserExistsMiddleware extends Middleware {

    private Server server;

    public UserExistsMiddleware(Server server){
        this.server = server;
    }


    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("This email is not registered.");
            return false;
        }
        if(!server.isValidPassword(email, password)){
            System.out.println("Wrong password for: " + email);
            return false;
        }
        return checkNext(email, password);
    }
}
