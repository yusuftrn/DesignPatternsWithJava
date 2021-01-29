package behavioral.ChainOfResponsibility.chainExample1;

import behavioral.ChainOfResponsibility.chainExample1.middleware.Middleware;
import behavioral.ChainOfResponsibility.chainExample1.middleware.RoleCheckMiddleware;
import behavioral.ChainOfResponsibility.chainExample1.middleware.ThrottlingMiddleware;
import behavioral.ChainOfResponsibility.chainExample1.middleware.UserExistsMiddleware;
import behavioral.ChainOfResponsibility.chainExample1.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void initServer(){
        server = new Server();
        server.register("yusuf@root.com", "123456");
        server.register("mehmet@user.com", "1425");

        Middleware middleware = new ThrottlingMiddleware(2);//request per min.
        //create your custom chain.
        middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        initServer();

        boolean success;
        do{
            System.out.print("Enter Email: ");
            String email = reader.readLine();
            System.out.print("Enter password: ");
            String password = reader.readLine();

            success = server.logIn(email, password);
        }while (!success);
    }
}
