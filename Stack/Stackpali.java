public class Stackpali
{
static char []stack;
static int top = -1;
static void push(char ele)
{
	stack[++top] = ele;
}
static char pop()
{
	return stack[top--];
}
static void isPalindrome(char str[])
{
    int c=0;
	int length = str.length;
	stack = new char[length * 4];
	int i, mid = length / 2;

	for (i = 0; i < mid; i++)
	{
		push(str[i]);
	}
	if (length % 2 != 0)
	{
		i++;
	}
	while (i < length)
	{
		char ele = pop();
		if (ele != str[i])
			c++;
		i++;
	}
    if(c==0)
    System.out.print("YES");
    else
    System.out.print("NO");
}
public static void main(String[] args)
{
	char str[] = "doctor".toCharArray();
    isPalindrome(str);
}
}
