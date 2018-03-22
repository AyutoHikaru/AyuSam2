package sample;

/** First Sample3 */
public class FirstSample3 extends FirstSample2{
	public static void main(String[] args) {

		FirstSample3 ai = new FirstSample3("sm3", "F3");
		ai.run();

	}

	private String m_SubName = "";

	FirstSample3(String a_name) {
		super(a_name);
		this.m_SubName = "F3";
	}
	FirstSample3(String a_name, String a_sub) {
		super(a_name);
		this.m_SubName = a_sub;
	}

	@Override
	public void run() {
		System.out.println("Start My Git History.3");
		System.out.println("My name is "+ getName() + ", " + getSubName());
	}

	public String getSubName() {
		return m_SubName;
	}

}
