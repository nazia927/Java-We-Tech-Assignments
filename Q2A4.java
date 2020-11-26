public class Q2A4 {

	public static void main(String[] args) {
		int int_value = -1;
		byte byte_value = (byte)int_value;
		char char_value = (char)byte_value;
		int final_int_value = (int)char_value;
		if(int_value == final_int_value)
		{
			System.out.println("Same Values");
		}
		else
		{
			System.out.println("Different Values");
		}
		
		
		System.out.println(int_value);
		System.out.println(byte_value);
		System.out.println(char_value);
		System.out.println(final_int_value);