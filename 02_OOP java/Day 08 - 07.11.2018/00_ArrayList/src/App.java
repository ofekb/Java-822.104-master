
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		//����� ���� ����� - ����� ������ �� ���� ��� �����
		//�� �� ���� ����� ������
		ArrayList<String> names = new ArrayList<>();
		
	
		//------------����� �� �� ��� ����� ������-------------------
		names.add("aa");
		names.add("aa");
		names.add("cc");
		names.add("dd");
		//names.add(123); // Error - we can add only string as a new element
		names.add(123+"");  // 123+"" is "123"
		names.add(123+"");   
		
		
		//------------ ���� ��� ������ ����� ������-------------------
		System.out.println("item in index 3: " + names.get(3));  //--> dd
		
		
		//------------ ���� ����� ����� ������-------------------------
		System.out.println("Total Items: " + names.size());  //--> 5

		
		//------------ ���� ����� �� ����� ����� ������-------------------
		System.out.print("All Items: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
		
		
		
		
		//----------���� �� �� ������ ����� ������ ������� ������� �� ��� ����� ����� -------------------
		names.remove(3); // Removes item with index number 3
		
		
		
		System.out.println("item in index 3: " + names.get(3));  //-->123

		System.out.print("All Items: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
		
		
		
		System.out.println("Total Items: " + names.size());  //--> 4
		
		
		//----------���� �� �� ������ ����� ������ ������� ����� �� ��� ����� ����� -------------------
		//����� ��� ��� ���� �� ���� ��� ����� ������, ���� ��� ������
		// remove - returns true if this list contained the specified element	
		names.remove("123");
		
		
		//���� �� �� ����� ������� �� ���� ������ - ������� �����
		while(names.remove("aa"));
		
		
		System.out.print("All Items: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
	}
}
