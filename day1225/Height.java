package day1123;

public class Height {
	public static void main(String[] args) {
		double height=100;
		double s=100,height02;
		for (int i = 1; i < 5; i++) {
			height*=0.5;
			s+=height*2;
		}
		System.out.println("��������ʱ������"+s+"��"+",�ٵ���ʱ�߶�Ϊ"+height*0.5+"��");
	}
}
