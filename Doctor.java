package wodepackage;
import java.util.Scanner;
public class Doctor implements Jiekou,Jiekou02 {
	
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	
	void jianru()
	{
		try {
		    System.out.println("��Ϣ����Ϊ������ �Ա� ���� ѧ�� нˮ");
		    name = sc.nextLine();
		    sex = sc.nextLine();
		    age = sc.nextInt();
		    cost6 = sc.nextInt();
		    earn1 = sc.nextInt();
		    cost = 2*cost6;
		    earn = 12*earn1;
		}catch(Exception e) {
			System.out.print("��������ȷ����Ϣ������");
		}
	}
	
	public void pay() {
		if(sex.equals("��")) {
			System.out.println("��ӭ"+name+"��������ѧУ�ɷ�ϵͳ");
			if(shifoujiaofei.equals("��")) {
				System.out.println("��ǰ����δ���нɷѣ�����ѧ�ڿ�ʼǰ��ɽɷѣ�");
			}else {
				System.out.println("���ѳɹ��ɷѣ�ף��������죡");
			}
		}else {
			System.out.println("��ӭ"+name+"Ůʿ����ѧУ�ɷ�ϵͳ");
			if(shifoujiaofei.equals("��")) {
				System.out.println("��ǰ����δ���нɷѣ�����ѧ�ڿ�ʼǰ��ɽɷѣ�");
			}else {
				System.out.println("���ѳɹ��ɷѣ�ף��������죡");
			}
		}
		System.out.println("�ɷ�������1���˳�������9");
		int jianru = sc.nextInt();
		if(jianru == 1) {
			if(money < cost6) {
				System.out.println("�ɷ�ʧ�ܣ��������㣡");
			}else {
				shifoujiaofei = "��";
				money -= cost6;
				System.out.println("�ɷѳɹ�����ǰ���Ϊ��"+money+"��ף��������죡");
			}
		}
	}
	public void check() {
		System.out.println("����Ҫ���ɵ�ѧ�ѽ��Ϊ��"+cost6);
		System.out.println("�������Ϊ��"+money);
	}
	public void pay02() {
		money += earn;
		System.out.println("нˮ��ȡ�ɹ�������ȡ��12���µ�нˮ����ǰ���Ϊ��"+money+"��ף��������죡");
	}
	public void check02() {
		System.out.println("��������ȡ��нˮ���Ϊ��"+12*earn1);
	}
	String name;//����
	String sex;//�Ա�
	double age;//����
	double cost6;//һѧ��ѧ��
	double earn1;//һ��нˮ
	double cost;//��ѧ��
	double earn;//��нˮ
	double tax;//��˰��
	double money;//���
	String shifoujiaofei;//�Ƿ�ɷ�
	Doctor(String a, String b, double c, double d, double e, double f, double g, double h, double i, String j) {
		name = a;
		sex = b;
		age = c;
		cost6 = d;
		earn1 =e;
		cost = f;
		earn =g;
		tax = h;
		money = i;
		shifoujiaofei = j;
	}
	public String toString() {
		return name;
	}
}