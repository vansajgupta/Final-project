import java.util.Scanner;

public class Project {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of name u want to arrange");
int num=sc.nextInt();
String names []=new String[num];


Scanner sc1 =new Scanner(System.in);
System.out.println("\n Enter name;");
for (int i = 0; i < num; i++) 
	names[i]= sc1.nextLine();

for (int i = 0; i < num; i++) 
	for(int j=i+1; j<num;j++);
{

	int i = 0;
	int j = 0;
	if (names[i].compareTo (names[j])>0)
	{
		String temp=names[i];
		names[i]=names[j];
		names[j]=temp;
	}
}
	
System.out.println("\n Sorted names are");
for(int i=0;i<num;i++)
	System.out.println(names[i]);
	

}
}
