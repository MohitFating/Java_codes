package Java_Prac;

public class Stack {
	private int maxSize;
	private int top;
	private int[] stackArray;
	
	public Stack(int size)
	{
		maxSize = size;
		stackArray = new int[maxSize];
		top =-1;
	}
	public boolean isEmpty()
	{
		return(top==-1);
	}
	public boolean isFull()
	{
		return(top == maxSize - 1);
	}
	public void push(int value)
	{
		if (isFull()) {
			System.out.println("stack is Full. cannot push "+value);
			return;
		}
		stackArray[++top]=value;
	}
	public int pop()
	{
		if (isEmpty())
		{
			System.out.println("Stack is empty. Cannot pop.");
			return -1;
		}
		return stackArray[top--];
	}
	public int peek()
	{
		if (isEmpty())
		{
			System.out.println("Stack is empty. Cannot peek.");
			return -1;
		}
		return stackArray[top];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Peek : "+stack.peek()); //40
		
		System.out.println("Pop : "+stack.pop());  //40
		System.out.println("Pop : "+stack.pop());  //30
		System.out.println("Pop : "+stack.pop());  //20
		System.out.println("Pop : "+stack.pop());  //10
		
//		System.out.println("Push 50 ");  //40
//		stack.push(50);
		
		System.out.println("Is empty? "+stack.isEmpty());
		System.out.println("Is Full? "+stack.isFull());
		
		

	}

}
