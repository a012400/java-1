package java_collections.map;

import java.util.EnumMap;

enum Season {
	SPRING, SUMER, FALL, WINTER
}

public class EnumMapTest {

	public static void main(String[] args) {
		// 创建EnumMap对象，该EnumMap的所有key都是Season枚举类的枚举值
		EnumMap enumMap = new EnumMap(Season.class);
		enumMap.put(Season.SUMER, "夏日炎炎");
		enumMap.put(Season.SPRING, "春暖花开");
		System.out.println(enumMap);
	}

}
