package generic.app;

/**
 * @author Novin on 03/07/2022
 * @project Learn-Java-Generic
 */
public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);

//        NumberData<String> stringNumberData = new NumberData<String>();

    }

    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data){
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
