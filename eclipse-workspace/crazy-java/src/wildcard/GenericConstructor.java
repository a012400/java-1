package wildcard;

class Foo {
	public <T> Foo(T t) {
		System.out.println(t);
	}
}

public class GenericConstructor {
	public static void main(String[] args) {
		// ���͹������е�T����ΪString
		new Foo("���Java����");
		
		// ���͹������е�T����ΪInteger
		new Foo(200);
		
		// ��ʽָ�����͹�������T����ΪString
		// ����Foo��������ʵ��Ҳ��String���� ��ȫ��ȷ
		new <String> Foo("���Java����");
		
		// ��ʽָ�����͹�������T����ΪString
		// ����Foo��������ʵ����Double���� ����������
		// new <String> Foo(12.3);
	}
}