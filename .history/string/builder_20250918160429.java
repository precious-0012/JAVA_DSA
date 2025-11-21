public class builder
{
	public static void main(String[] args) {
		//StringBuilder str = new StringBuilder("hello");
		//System.out.println(str); 
		//System.out.println(str.charAt(2));
		//System.out.println(str.indexOf("h"));
        		//System.out.println(str.length());
		//str.setCharAt(0,'m');
		//System.out.println(str);
		//str.append(10);
		//System.out.println(str);
		//str.insert(2,'y');
		//System.out.println(str);
		//str.deleteCharAt(2);
		//System.out.println(str);
		StringBuilder sb = new StringBuilder("physics");
		System.out.println(sb.reverse());
		sb.reverse();
		System.out.println(sb.delete(2,4));
	}
}