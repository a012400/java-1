package java_collections.map;

import java.util.HashMap;

public class NullInHashMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		// ��ͼ������keyΪnullֵ��key-value�Է���HashMap��
		hm.put(null, null);
		hm.put(null, null);
		// ��һ��valueΪnullֵ��key-value�Է���HashMap��
		hm.put("a", null);
		System.out.println(hm);
	}

}