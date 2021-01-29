package behavioral.ChainOfResponsibility.chainExample1.middleware;

public abstract class Middleware {
    private Middleware next;

    //Building chains of middleware objects
    public Middleware linkWith(Middleware next){
        this.next = next;
        return next;
    }

    //Subclasses will implement this method with concrete checks.
    public abstract boolean check(String email, String password);

    //Runs check on the next object in chain or ends traversing if we are in last object in chain.
    protected boolean checkNext(String email, String password){
        if(next == null){
            return true;
        }
        return next.check(email, password);
    }
}
