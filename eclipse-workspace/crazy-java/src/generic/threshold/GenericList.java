package generic.threshold;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// ����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<String>();
		strList.add("���Java����");
		strList.add("���Android����");
		// ������������������
		// strList.add(5);
		strList.forEach(str -> System.out.println(str.length()));
	}

}