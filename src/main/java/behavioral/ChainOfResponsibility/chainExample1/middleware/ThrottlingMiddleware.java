package behavioral.ChainOfResponsibility.chainExample1.middleware;

public class ThrottlingMiddleware extends Middleware {

    private int requestPerMin;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMin) {
        this.requestPerMin = requestPerMin;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * Please, not that checkNext() call can be inserted both in the beginning
     * of this method and in the end.
     *
     * This gives much more flexibility than a simple loop over all middleware
     * objects. For instance, an element of a chain can change the order of
     * checks by running its check after all other checks.
     */
    @Override
    public boolean check(String email, String password) {
        if(System.currentTimeMillis() > currentTime + 60_000){
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        if(request > requestPerMin){
            System.out.println("Request limit exceeded.");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
}
