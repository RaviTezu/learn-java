class P2PAssess1{

    /* You should submit the following */
    /****************** From Here ****************************/
    //Here goes your javadoc comments
    static double[] preyPredLV(double [] preyPred, double[] a, double[] b, int n)
     {
     double[][] x = new double[n+1][2];
     x[0][0] = preyPred[0];
     x[0][1] = preyPred[1];
     for (int i=0; i<n;i++)
     {
     double currentH = x[i][0];
     double currentL = x[i][1];
     x[i+1][0] = x[i][0]+(x[i][0]*a[0])-(x[i][0]*a[1]*currentL);
     x[i+1][1] = x[i][1]+(x[i][1]*b[0])-(x[i][1]*b[1]*currentH);
     } 	
    double result[] = {x[n][0],x[n][1]};
    return result;
    }
    /***************** Until Here ****************************/
    
    public static void main(String[] args){
	
	double preyPred[] = new double[2];
	double a[] = new double[2];
	double b[] = new double[2];
	int n;

	a[0] = 0.1;
	a[1] = 0.01;
	b[0] = 0.01;
	b[1] = 0.00002;

	n = 1;
	preyPred[0] = 300;
	preyPred[1] = 20;

	preyPred = preyPredLV(preyPred, a, b, n);
	System.out.println("After "+n+" generations: "
			   +"Snowhares: "+preyPred[0]
			   +" Lynx: "+preyPred[1]);

	n = 2;
	preyPred[0] = 300;
	preyPred[1] = 20;

	preyPred = preyPredLV(preyPred, a, b, n);
	System.out.println("After "+n+" generations: "
			   +"Snowhares: "+preyPred[0]
			   +" Lynx: "+preyPred[1]);
	
	n = 20;
	preyPred[0] = 300;
	preyPred[1] = 20;

	preyPred = preyPredLV(preyPred, a, b, n);
	System.out.println("After "+n+" generations: "
			   +"Snowhares: "+preyPred[0]
			   +" Lynx: "+preyPred[1]);

    }
}
