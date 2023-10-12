package OOPs;

public class Polynomial {
private int degcoeff[];
public Polynomial() {
	degcoeff=new int[10];
}
public void setCoefficient(int degree, int coeff){
	/*
	 * 
This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value
	 */
	if(degree>=degcoeff.length) {
		int[] temp = degcoeff;
		degcoeff= new int[degree+1];
		for(int i=0;i<temp.length;i++) {
			degcoeff[i]=temp[i];
		}
	}
	degcoeff[degree]=coeff;
	
	
}
public int getCoeff(int degree) {
	  if (degree < this.degcoeff.length) {
          return degcoeff[degree];
      } else {
          return 0;
      }
}
public void print() {
    for (int i = 0; i < degcoeff.length; i++) {
        if (degcoeff[i] != 0) {
            System.out.print(degcoeff[i] + "x" + i + " ");
        }
    }
}
public Polynomial add(Polynomial p) {
	Polynomial ans = new Polynomial();
	int pl1=this.degcoeff.length;
	int pl2=p.degcoeff.length;
	if(pl1>pl2) {
		for(int i=0;i<pl2;i++) {
			if(i<pl2) {
		ans.degcoeff[i]=this.degcoeff[i]+p.degcoeff[i];}
			else {
				ans.degcoeff[i]=this.degcoeff[i];
			}
	}
		}else {
//			int[] temp=this.degcoeff;
//			this.degcoeff=new int[pl2];
			for(int i=0;i<pl2;i++) {
				if(i<pl1) {
					ans.degcoeff[i]=this.degcoeff[i]+p.degcoeff[i];
				}else {
					ans.degcoeff[i]=p.degcoeff[i];
				}
			}
		
			
		}
	return ans;
}
public Polynomial multiply(Polynomial p) {
	Polynomial ans = new Polynomial();
    for (int i = 0; i < this.degcoeff.length; i++) {
        for (int j = 0; j < p.degcoeff.length; j += 1) {
            int termdeg = i + j;
            int termCoeff = this.degcoeff[i] * p.degcoeff[j];
            int oldCoeff = ans.getCoeff(termdeg);
            ans.setCoefficient(termdeg, termCoeff + oldCoeff);
        }
    }
    return ans;
	
}



}
