package np;

import java.lang.reflect.Field;

public class StringQuationTranstaterandAnswer {
	
	
	static {
		try {
			Field value=String.class.getDeclaredField("value");
			value.setAccessible(true);
			//value.setAccessible(false); // not to translate
			value.set("Hi Ravi", value.get("hola Ravi"));
			value.set("Goog Morning", value.get("Buenos días"));
			value.set("How Are You ? ", value.get("Cómo estás ?"));
			value.set("Where Are you From", value.get("De dónde eres"));
			value.set("What About You", value.get("Tú que tal"));
			
			value.set("how are you", value.get("i am fine thank you and what about you"));
			value.set("Are you there", value.get("yes tell me"));
			value.set("What About You", value.get("i am fine"));
			value.set("tell me", value.get("nothing"));
			
			
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Hi Ravi");
		System.out.println("Goog Morning");
		System.out.println("how are you");
		

	}

}
