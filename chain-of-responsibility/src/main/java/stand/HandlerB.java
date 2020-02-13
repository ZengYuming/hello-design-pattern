package stand;

/**
 * 具体处理者B
 * 处理它所负责的请求，可访问后继者，如果可以自己可以处理就处理，不可以就转发给后继者处理
 */
public class HandlerB extends Handler {
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
//            10-20处理此请求
            System.out.println(this.getClass().getName() + "处理请求" + request);
        } else if (successor != null) {
            //转发给后继者
            successor.handleRequest(request);
        }
    }
}
