package proxy;

public class ProxyService implements ServiceInterface{

    private ServiceInterface realService;

    @Override
    public void operation() {
        if(realService==null){
            realService = new RealService();
        }

        this.doSomethingBeforeRealOperation();
        realService.operation();
        this.doSomethingAfterRealOperation();
    }

    private void doSomethingBeforeRealOperation(){
        System.out.println("ProxyService do something before real operation");
    }

    private void doSomethingAfterRealOperation(){
        System.out.println("ProxyService do something after real operation");
    }
}
