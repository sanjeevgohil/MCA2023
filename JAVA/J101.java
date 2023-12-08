//file handling

import java.io.File;

class J101
{
	public static void main(String args[])
	{
		try {
			File f1 = new File(args[0]);
			System.out.println("Get File Separator Name:"+f1.separatorChar);
			System.out.println("Get File Name:"+f1.getName());
			System.out.println("Get File Parent Name:"+f1.getParent());
			System.out.println("Get File AbsolutePath:"+f1.getAbsolutePath());
			System.out.println("Get File Path:"+f1.getPath());
			System.out.println("File Can Read:"+f1.canRead());
			System.out.println("File Can Write:"+f1.canWrite());
		} catch (Exception e) {
			System.out.println("Error Is:"+e);
		}
	}
}