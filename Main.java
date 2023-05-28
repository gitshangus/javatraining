import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Foodlist foodlist = new Foodlist();
		Map<String, String[]> listOfFoods = foodlist.main();
		String[] category = listOfFoods.keySet().toArray(new String[0]);
		
		String selectedMenu = (String) JOptionPane.showInputDialog(
	    null,                       // 팝업 창의 부모 컴포넌트 (null로 설정하면 기본 프레임에 표시)
	    "음식 메뉴를 선택하세요",      // 팝업 창의 메시지
	    "음식 메뉴",                // 팝업 창의 제목
	    JOptionPane.PLAIN_MESSAGE,  // 팝업 창의 아이콘 (PLAIN_MESSAGE는 일반 메시지 아이콘)
	    null,                       // 선택 가능한 값의 배열 (null로 설정하면 사용자가 직접 입력할 수 있음)
	    category,                       // 음식 메뉴 배열
	    category[0]                     // 기본 선택값 (여기서는 첫 번째 음식 메뉴)
	    );
		if(selectedMenu != null) {
			String[] foodType = listOfFoods.get(selectedMenu);
			Random rdm = new Random();
			int rdmIndex = rdm.nextInt(foodType.length);
			String rdmItem = foodType[rdmIndex];
			
			JOptionPane.showMessageDialog(null,String.valueOf(rdmItem),"Food of the Day", JOptionPane.INFORMATION_MESSAGE);		
		}
	}
}

class Foodlist {
	public Map<String, String[]> main() {
		Map<String, String[]> listOfFoods = new HashMap<>();
	
		String[] rice = {"제육덮밥", "비빔밥", "오므라이스", "오징어덮밥"};
		String[] stew = {"김치찌개", "부대찌개", "돼지국밥", "순대국밥", "뼈해장국"};
		String[] snack = {"떡볶이", "김밥", "순대", "튀김"};
		String[] noodle = {"라면", "냉면", "파스타", "쫄면"};
		String[] Msnack = {"치킨", "족발", "보쌈", "피자", "닭갈비", "곱창"};
		String[] china = {"짜장면", "짬뽕", "볶음밥", "탕수육", "깐풍기"};
	
		listOfFoods.put("밥", rice);
		listOfFoods.put("찌개", stew);
		listOfFoods.put("분식", snack);
		listOfFoods.put("면", noodle);
		listOfFoods.put("야식", Msnack);
		listOfFoods.put("중식", china);
		
		//String[] category = listOfFoods.keySet().toArray(new String[0]);
		return listOfFoods;
	}
/**
	@Override
	public String toString() {
		return main().toString();
	}
**/
}


