package memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento save(){
        return new Memento(state);
    }

    public void restore(Memento memento){
        this.state = memento.state;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }

    public static class Memento {
        private String state;

        public String getState() {
            return state;
        }

        public Memento(String state) {
            this.state = state;
        }
    }
}
