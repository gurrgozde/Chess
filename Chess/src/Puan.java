
public class Puan {//Puanlar tutuluyor.
private double p,a,f,k,v,s,tut=0;
String type;


public Puan() {
	super();
	this.p = 1;
	this.a = 3;
	this.f = 3;
	this.k = 5;
	this.v = 9;
	this.s = 100;
}

public double Hesap(String type) {
	if(type.contains("p")) {
		
		return getP()/2;
	}
	if(type.contains("k")) {
		return getK()/2;
	}
	if(type.contains("a")) {
		return getA()/2;
	}
	if(type.contains("f")) {
		return getF()/2;
	}
	if(type.contains("v")) {
		return getV()/2;
	}
	if(type.contains("s")) {
		return getS()/2;
	}
	return 0;
}
public double getP() {
	return p;
}

public void setP(int p) {
	this.p = p;
}

public double getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public double getF() {
	return f;
}

public void setF(int f) {
	this.f = f;
}

public double getK() {
	return k;
}

public void setK(int k) {
	this.k = k;
}

public double getV() {
	return v;
}

public void setV(int v) {
	this.v = v;
}

public double getS() {
	return s;
}

public void setS(int s) {
	this.s = s;
}


}
