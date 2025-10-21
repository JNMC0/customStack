import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {
private Object[] data;
private int top;

public ArrayStack(){
this(10);
}

public ArrayStack(int initialCapacity){
this.data= new Object[initialCapacity];
}

    @Override
    public void push(T value) {
        this.data[top++]=value;
        //top vale top+1
    }

    @Override
    public T pop() {
        if(isEmpty()){
            System.out.print("no hay elementos en la Stack");
            return null;
        }
        T value=(T) data[--top];
        data[top]=null;
        return value;
    }

    @Override
    public T peek() {
      if(isEmpty()){
            System.out.print("La pila esta vacia no puedes obtner ningun elemento");
            return null;
        }
        T value=(T) data[--top];
        data[top]=null;
        return value;
    }

    @Override
    public boolean isEmpty() {
       return top==0;
    }

    @Override
    public int size() {
       return top;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }
    @Override
    public void printStack(){
         for (int i = 0; i < top; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public void addCapacity(){
        if(top==data.length){
            int newCap=data.length*2;
            data=Arrays.copyOf(data, newCap);
        }
    }

}
