package stand;

/**
 * 定义一个处理请求的接口
 */
public abstract class Handler {
    protected Handler successor;

    //设置继任者
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //处理请求
    public abstract void handleRequest(int request);
}
