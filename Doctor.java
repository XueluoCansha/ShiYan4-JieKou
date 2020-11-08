package wodepackage;
import java.util.Scanner;
public class Doctor implements Jiekou,Jiekou02 {
	
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	
	void jianru()
	{
		try {
		    System.out.println("信息依次为：名字 性别 年龄 学费 薪水");
		    name = sc.nextLine();
		    sex = sc.nextLine();
		    age = sc.nextInt();
		    cost6 = sc.nextInt();
		    earn1 = sc.nextInt();
		    cost = 2*cost6;
		    earn = 12*earn1;
		}catch(Exception e) {
			System.out.print("请输入正确的信息！！！");
		}
	}
	
	public void pay() {
		if(sex.equals("男")) {
			System.out.println("欢迎"+name+"先生进入学校缴费系统");
			if(shifoujiaofei.equals("否")) {
				System.out.println("当前您尚未进行缴费，请在学期开始前完成缴费！");
			}else {
				System.out.println("你已成功缴费，祝您生活愉快！");
			}
		}else {
			System.out.println("欢迎"+name+"女士进入学校缴费系统");
			if(shifoujiaofei.equals("否")) {
				System.out.println("当前您尚未进行缴费，请在学期开始前完成缴费！");
			}else {
				System.out.println("你已成功缴费，祝您生活愉快！");
			}
		}
		System.out.println("缴费请输入1，退出请输入9");
		int jianru = sc.nextInt();
		if(jianru == 1) {
			if(money < cost6) {
				System.out.println("缴费失败，您的余额不足！");
			}else {
				shifoujiaofei = "是";
				money -= cost6;
				System.out.println("缴费成功，当前余额为："+money+"，祝您生活愉快！");
			}
		}
	}
	public void check() {
		System.out.println("您需要缴纳的学费金额为："+cost6);
		System.out.println("您的余额为："+money);
	}
	public void pay02() {
		money += earn;
		System.out.println("薪水领取成功，您领取了12个月的薪水，当前余额为："+money+"，祝您生活愉快！");
	}
	public void check02() {
		System.out.println("您可以领取的薪水金额为："+12*earn1);
	}
	String name;//名字
	String sex;//性别
	double age;//年龄
	double cost6;//一学期学费
	double earn1;//一月薪水
	double cost;//年学费
	double earn;//年薪水
	double tax;//纳税额
	double money;//余额
	String shifoujiaofei;//是否缴费
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