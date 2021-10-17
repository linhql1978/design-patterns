package proxy;

public class AppClient {
    public static void main(String[] args) {
        ServiceInterface serviceInterface = new ProxyService();

        serviceInterface.operation();
    }
}
