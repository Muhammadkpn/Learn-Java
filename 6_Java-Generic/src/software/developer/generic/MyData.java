package software.developer.generic;

public class MyData <T>{
    private T data;

    public MyData(T data) {
        this.data = data;
    }

    // Method yg me-return parameter type
    public T getData() {
        return data;
    }

    // Method dengan parameter generic parameter type
    public void setData(T data) {
        this.data = data;
    }
}
