package adapter.target;

import adapter.adaptee.OtherAdaptee;

public class OtherAdapter implements Target{

    private OtherAdaptee otherAdaptee;

    public OtherAdapter(OtherAdaptee otherAdaptee) {
        this.otherAdaptee = otherAdaptee;
    }

    @Override
    public void request() {
        this.otherAdaptee.specificRequest();
    }
}
