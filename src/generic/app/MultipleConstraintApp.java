package generic.app;

/**
 * @author Novin on 03/07/2022
 * @project Learn-Java-Generic
 */
public class MultipleConstraintApp {
    public static void main(String[] args) {
        Data<Manager> managerData = new Data<>(new Manager());
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee implements CanSayHello{
        @Override
        public void sayHello(String name) {

        }
    }

    public static class VicePresident extends Employee implements CanSayHello {
        @Override
        public void sayHello(String name) {

        }
    }

    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
