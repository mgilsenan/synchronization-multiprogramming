class BlockStack
{
	//added static integer stackAccessCounter to count everytime the stack is accessed. 
	public static int stackAccessCounter;
	/**
	 * # of letters in the English alphabet + 2
	 */
	public static final int MAX_SIZE = 28;

	/**
	 * Default stack size
	 */
	public static final int DEFAULT_SIZE = 6;

	/**
	 * Current size of the stack
	 */
	private int iSize = DEFAULT_SIZE;

	/**
	 * Current top of the stack
	 */
	private int iTop  = 3;

	/**
	 * stack[0:5] with four defined values
	 */
	private char acStack[] = new char[] {'a', 'b', 'c', 'd', '$', '$'};

	/**
	 * Default constructor
	 */
	public BlockStack()
	{
	}

	/**
	 * Supplied size
	 */
	public BlockStack(final int piSize)
	{


        if(piSize != DEFAULT_SIZE)
		{
			this.acStack = new char[piSize];

			// Fill in with letters of the alphabet and keep
			// 2 free blocks
			for(int i = 0; i < piSize - 2; i++)
				this.acStack[i] = (char)('a' + i);

			this.acStack[piSize - 2] = this.acStack[piSize - 1] = '$';

			this.iTop = piSize - 3;
                        this.iSize = piSize;
		}
	}

	/**
	 * Picks a value from the top without modifying the stack
	 * @return top element of the stack, char
	 */
	public char pick()
	{
		stackAccessCounter++;
		return this.acStack[this.iTop];
	}

	/**
	 * Returns arbitrary value from the stack array
	 * @return the element, char
	 */
	public char getAt(final int piPosition)
	{
		stackAccessCounter++;
		return this.acStack[piPosition];
	}

	/**
	 * Standard push operation
	 */
	public void push(final char pcBlock) throws FullStackException
	{
		stackAccessCounter++;
		if(this.acStack[0]=='\0'){
			System.out.println("Push on empty stack");
			this.acStack[++this.iTop] = 'a';
		}
		this.acStack[++this.iTop] = pcBlock;
		System.out.println("successful push");
	}

	/**
	 * Standard pop operation
	 * @return ex-top element of the stack, char
	 */
	public char pop() throws EmptyStackException
	{
		stackAccessCounter++;
		char cBlock = this.acStack[this.iTop];
		this.acStack[this.iTop--] = '*'; // Leave prev. value undefined
		System.out.println("successful pop");
		return cBlock;
	
	}
	
	public int getITop() {
		return iTop;
	}

	public int getAccessCounter() {
		return stackAccessCounter;
	}

	public boolean isEmpty() {
		return (this.iTop == -1);
	}

	public int getISize() {
		return iSize;
	}
}
