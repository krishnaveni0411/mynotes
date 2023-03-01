package week2.day4;

public class ChangeTheLowerCasesStringInToOddValueUpperCases {
public static void main(String[] args) {
	// change the lower cases string into odd value upper cases
			String txt="changeme";
			char[] x= txt.toCharArray();
			int y =x.length-1;
			char z;
			for(int i=0; i<y; i++)
			{
				if (i%2==0)
				{
					z =Character.toUpperCase(x[i]);
					System.out.println(z);
					
				}else 
				{
					System.out.println(x[i]);
				}
			}
}
}

