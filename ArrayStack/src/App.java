public class App {
    public static void main(String[] args) throws Exception {
       ArrayStack<Integer> myStack = new ArrayStack<>();
       myStack.push(2);
       myStack.push(3);
       myStack.push(4);
      System.out.println("-------antes de un pop-------");
       myStack.printStack();
       System.out.println("-------despues de un pop-------");
       myStack.pop();
       myStack.printStack();
       System.out.println("-------despues de borrar-------");
       myStack.clear();
    }
}
