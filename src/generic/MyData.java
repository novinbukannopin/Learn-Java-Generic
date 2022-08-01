package generic;

/**
 * @author Novin on 23/06/2022
 * @project Learn-Java-Generic
 */
public class MyData<T> {
    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
