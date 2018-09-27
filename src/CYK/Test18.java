package CYK;

public class Test18 {

	public static void main(String[] args) {
		JudgeMax("4 4 4 4-3 3");
	}
	public static void JudgeMax(String input){
		String[] strs = input.split("-");
		String[] brand1 = strs[0].split(" ");
		String[] brand2 = strs[1].split(" ");
		System.out.println(brand1.length);
		if(brand1[0] == "joker" && brand1[1] == "JOKER"){
			return;
		}
		else if(brand2[0] == "joker" && brand2[1] == "JOKER"){
			return;
		}
		
		else if(brand1[0].length() == 4 && brand2.length != 4)
		{
			return;
		}
		else if(brand2[0].length() == 4 && brand1.length != 4)
		{
			return;
		}
		
		
	}
}
