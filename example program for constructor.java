package array;

public class mainclass9 {
	int stu_id;
	String stu_name;
	char stu_section;
    mainclass9(int a,String b,char c)
    {
    	stu_id=a;
    	stu_name=b;
    	stu_section=c;
    	
    }
public static void main(String[] args)
{
	mainclass9 s1=new mainclass9(12,"anu",'A');
	System.out.print(s1.stu_id+" ");
	System.out.print(s1.stu_name+" ");
	System.out.println(s1.stu_section);
	mainclass9 s2=new mainclass9(17,"kavya",'B');
	System.out.print(s2.stu_id+" ");
	System.out.print(s2.stu_name+" ");
	System.out.print(s2.stu_section);
}
}