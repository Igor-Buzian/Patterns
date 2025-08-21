public abstract class Middleware {
    private Middleware next;

    public Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware next : chain) {
        head =next

        }
    }

    public Middleware nextChain()
    {

    }
}
