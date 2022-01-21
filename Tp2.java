package tp_algo_base_java;

public class Tp2 {

	public static int f(int x) {
		if (x<0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public static String g(int x) {
		if (x<=0) {
			return "toto";
		}
		else {
			return "tata";
		}
	}

	public static int h(char c) {
		if (c=='a') {
			return 0;
		}
		if (c=='b') {
			return 1;
		}
		if (c=='c') {
			return 2;
		}
		else {
			return 3;
		}
	}

	public static int i(int x) {
		if (x<=0) return 0;
		if (0<=x && x<=100) return 1;
		return 2;
	}

	public static int j(int x) {
		if (-10<x && x<10) return x*x;
		if (50<x && x<60) return x*x*x;
		return 1;
	}
	
	public static char k(int n) {
		if (n==1) return 'a';
		if (n==2) return 'b';
		if (n==3) return 'c';
		return '_';
	}
	
	public static int l(String w) {
		if (w=="toto") return 1;
		if (w=="toutou") return 2;
		return 0;
	}
	
	public static String m(char c) {
		if (c=='h') return "haut";
		if (c=='b') return "bas";
		if (c=='d') return "droite";
		if (c=='g') return "gauche";
		return "autre";
	}
	
	public static int n(int x, int y) {
		if (x==y) return 1;
		return 0;
	}
	
	public static boolean o(int x, int y) {
		return x==y;
	}
	
	public static boolean p(int x, int y, int z) {
		return x==y && y==z;
	}
	
	public static int q(int x, int y, int z) {
		if (x>y && x>z) return 1;
		if (y>x && y>z) return 2;
		if (z>x && z>y) return 3;
		return 0;
	}
	
	public static float r(int x, int y, int z) {
		if (x!=0) return (y+z)/x;
		if (y!=0) return (x+z)/y;
		if (z!=0) return (x+y)/z;
		return 0;
	}
	
	public static float s(int x, int y, int z) {
		if (x!=0) return (float) (Math.pow(x, 4) + (x*x*x+ Math.pow(z, 5))/x);
		if (x!=0) return (float) (Math.pow(y, 4) + (x*x*x+ Math.pow(z, 5))/y);
		if (x!=0) return (float) (Math.pow(z, 4) + (x*x*x+ Math.pow(z, 5))/z);
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("f(1)="+f(1));
		System.out.println("g(-1)="+g(-1));
		System.out.println("h('c')="+h('c'));
		System.out.println("i(100)="+i(100));
		System.out.println("j(55)="+j(55));
		System.out.println("k(3)="+k(3));
		System.out.println("l(\"toto\")="+l("toto"));
		System.out.println("m('d')="+m('d'));
		System.out.println("n(12,12)="+n(12,12));
		System.out.println("o(12,12)="+o(12,12));
		System.out.println("p(2,1,3)="+p(2,1,3));
		System.out.println("q(2,1,3)="+q(2,1,3));
		System.out.println("r(2,1,3)="+r(2,1,3));
		System.out.println("s(2,1,3)="+s(2,1,3));
		
	}

}
