package sample;

/** First Sample2 */
public class FirstSample2 {
	public static void main(String[] args) {

		FirstSample2 ai = new FirstSample2();
		ai.run();

	}

	private String m_Name = "";

	FirstSample2(String a_name) {
		this.m_Name = a_name;
	}
	FirstSample2() {
		this.m_Name = "sm2";
	}

	public void run() {
		System.out.println("Start My Git History.2");
		System.out.println("My name is "+m_Name);
	}

	public String getName() {
		return m_Name;
	}
}
