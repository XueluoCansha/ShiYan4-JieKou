package wodepackage;
import java.util.Scanner;
public class Test {
	public static void main(String args[]) {
		Doctor doctor01 = new Doctor("XXX","男",0,0,0,0,0,0,0,"否");
//		doctor01.jiaoqian(new Student());
//		doctor01.naqian(new Assistant());
//		doctor01.chajiaoqian(new Student());
//		doctor01.chanaqian(new Assistant());
		
		Doctor doctor02 = new Doctor("XXX","女",0,0,0,0,0,0,0,"否");
//		doctor02.jiaoqian(new Student());
//		doctor02.naqian(new Assistant());
//		doctor02.chajiaoqian(new Student());
//		doctor02.chanaqian(new Assistant());

		
		final double a = 0.03;
		final double b = 0.1;
		final double c = 0.2;
		final double d = 0.25;
		final double e = 0.3;
		final double f = 0.35;
		final double g = 0.45;
		
		
		int xunhuan = -1;
		String mingzi = "XXX";
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Jiekou xuesheng01,xuesheng02;
		Jiekou02 zhujiao01,zhujiao02;
		xuesheng01 = doctor01;
		xuesheng02 = doctor01;
		zhujiao01 = doctor02;
		zhujiao02 = doctor02;
		
		System.out.println("请输入第一位博士的信息");
		doctor01.jianru();
		System.out.println("请输入第二位博士的信息");
		doctor02.jianru();
		
		while(xunhuan != 9){
			System.out.println("欢迎使用本缴费查询程序！");
			System.out.println("缴纳学费请输入1，查询学费请输入2，领取薪水请输入3，查询薪水请输入4，退出并打印纳税额请输入9");
			xunhuan = sc.nextInt();
			
			if(xunhuan == 1) {
				while(true) {
					System.out.println("请输入您的名字");
					mingzi = sc1.nextLine();
					
					if (mingzi.equals(doctor01.name)) {
						doctor01.pay();
						break;
					}
					if (mingzi.equals(doctor02.name)) {
						doctor02.pay();
						break;
					}
				}
			}
			
			if(xunhuan == 2) {
				while(true) {
					System.out.println("请输入您的名字");
					mingzi = sc1.nextLine();
					
					if (mingzi.equals(doctor01.name)) {
						doctor01.check();
						break;
					}
					if (mingzi.equals(doctor02.name)) {
						doctor02.check();
						break;
					}
				}
			}
			
			if(xunhuan == 3) {
				while(true) {
					System.out.println("请输入您的名字");
					mingzi = sc1.nextLine();
					
					if (mingzi.equals(doctor01.name)) {
						doctor01.pay02();
						break;
					}
					if (mingzi.equals(doctor02.name)) {
						doctor02.pay02();
						break;
					}
				}
			}
			
			if(xunhuan == 4) {
				while(true) {
					System.out.println("请输入您的名字");
					mingzi = sc1.nextLine();
					
					if (mingzi.equals(doctor01.name)) {
						doctor01.check02();
						break;
					}
					if (mingzi.equals(doctor02.name)) {
						doctor02.check02();
						break;
					}
				}
			}
			
			System.out.println("请输入您的名字");
			mingzi = sc1.nextLine();
			if (mingzi.equals(doctor01.name)) {
				if(doctor01.earn - doctor01.cost > 0 && doctor01.earn - doctor01.cost <= 5000) {
					doctor01.tax = 0;
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 5000 && doctor01.earn - doctor01.cost <= 8000) {
					doctor01.tax = a*(doctor01.earn - doctor01.cost - 5000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 8000 && doctor01.earn - doctor01.cost <= 17000) {
					doctor01.tax = 90 + b*(doctor01.earn - doctor01.cost - 8000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 17000 && doctor01.earn - doctor01.cost <= 30000) {
					doctor01.tax = 90 + 900 + c*(doctor01.earn - doctor01.cost - 17000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 30000 && doctor01.earn - doctor01.cost <= 40000) {
					doctor01.tax = 90 + 900 + 2600 + d*(doctor01.earn - doctor01.cost - 30000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 40000 && doctor01.earn - doctor01.cost <= 60000) {
					doctor01.tax = 90 + 900 + 2600 + 2500 + e*(doctor01.earn - doctor01.cost - 40000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 60000 && doctor01.earn - doctor01.cost <= 85000) {
					doctor01.tax = 90 + 900 + 2600 + 2500 + 6000 + f*(doctor01.earn - doctor01.cost - 60000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 85000) {
					doctor01.tax = 90 + 900 + 2600 + 2500 + 6000 + 8750 + g*(doctor01.earn - doctor01.cost - 60000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else {
					System.out.println("当薪水低于学费时，您不用缴纳税款！");
				}
				break;
			}
			if (mingzi.equals(doctor02.name)) {
				if(doctor02.earn - doctor02.cost > 0 && doctor02.earn - doctor02.cost <= 5000) {
					doctor02.tax = 0;
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor02.earn - doctor02.cost > 5000 && doctor02.earn - doctor02.cost <= 8000) {
					doctor02.tax = a*(doctor02.earn - doctor02.cost - 5000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor02.earn - doctor02.cost > 8000 && doctor02.earn - doctor02.cost <= 17000) {
					doctor02.tax = 90 + b*(doctor02.earn - doctor02.cost - 8000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor02.earn - doctor02.cost > 17000 && doctor02.earn - doctor02.cost <= 30000) {
					doctor02.tax = 90 + 900 + c*(doctor02.earn - doctor02.cost - 17000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor02.earn - doctor01.cost > 30000 && doctor01.earn - doctor01.cost <= 40000) {
					doctor01.tax = 90 + 900 + 2600 + d*(doctor01.earn - doctor01.cost - 30000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 40000 && doctor01.earn - doctor01.cost <= 60000) {
					doctor01.tax = 90 + 900 + 2600 + 2500 + e*(doctor01.earn - doctor01.cost - 40000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 60000 && doctor01.earn - doctor01.cost <= 85000) {
					doctor01.tax = 90 + 900 + 2600 + 2500 + 6000 + f*(doctor01.earn - doctor01.cost - 60000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else if(doctor01.earn - doctor01.cost > 85000) {
					doctor01.tax = 90 + 900 + 2600 + 2500 + 6000 + 8750 + g*(doctor01.earn - doctor01.cost - 60000);
					System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
				}else {
					System.out.println("当薪水低于学费时，您不用缴纳税款！");
				}
				break;
			}
		}
	}
		
}