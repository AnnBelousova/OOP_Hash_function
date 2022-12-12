package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private Queue<T> queue = new LinkedList<>();

    public void addTransport(T transport) {
        if (transport.getClass() == Bus.class) {
            throw new RuntimeException(transport.getClass() + " - this type of transport is not served");
        } else {
            queue.offer(transport);
        }
    }
    public void serve(){
        T transport = queue.poll();
        if(transport != null){
            System.out.println(transport.getBrand() + " " + transport.getModel() + " is served.");
            serve();
        }else {
            System.out.println("There are no transport.");
        }
    }
}
