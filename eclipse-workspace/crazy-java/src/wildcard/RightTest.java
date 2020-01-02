package wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RightTest {
	// ����һ�����ͷ������÷��ͷ����д�һ��T�����β�
	static <T> void test(Collection<? extends T> from, Collection<T> to) {
		for (T ele : from) {
			to.add(ele);
		}
	}

	public static void main(String[] args) {
		List<Object> ao = new ArrayList<>();
		List<String> as = new ArrayList<>();
		// ������뽫��ȫ����
		test(as, ao);
	}

}