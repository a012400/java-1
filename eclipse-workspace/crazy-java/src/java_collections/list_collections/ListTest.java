package java_collections.list_collections;

import java.util.List;
import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		List<String> books = new ArrayList<String>();
		// ��books��������������Ԫ��
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���Android����"));
		System.out.println(books);
		// �����ַ�����������ڵڶ���λ��
		books.add(1, new String("���Ajax����"));
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		// ɾ��������Ԫ��
		books.remove(3);
		System.out.println(books);
		// �ж�ָ��Ԫ����List�����е�λ�ã����1������λ�ڵڶ�λ
		System.out.println(books.indexOf(new String("���Ajax����")));
		// ���ڶ���Ԫ���滻���µ��ַ�������
		books.set(1, new String("���Java����"));
		System.out.println(books);
		// ��books���ϵĵڶ���Ԫ�ص�������Ԫ�ؽ�ȡ���Ӽ���
		System.out.println(books.subList(1, 2));
	}

}