package integers;

import java.io.OutputStream;

public class TEST {
	public static void main(String[] args) {
		Integer a = 127;
		Integer b = 127;
		Integer c = 128;
		Integer d = 128;
		//��Χ��-128-127�������Ӧ�����Ͷ���
		System.out.println(a==b);
		//������Χ����������ֵ
		System.out.println(c==d);
	}
}
