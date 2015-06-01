/**
 * Solving P2PAssess1
 * 
 * @author RaviTeja <ravi-teja@live.in>
 * @version 1.0
 */

class P2PAssess1{

    /* You should submit the following */
    /****************** From Here ****************************/
    /**
    * Returns a array of 2 doubles, containing the population of prey in its position0, and the population of predator in its position1
    *
    * @param  preyPred the array with 2 doubles containing the initial population of Snowshoe hares(preyPred[0]) and Lynx(preyPred[1])
    * @param  a the array with 2 doubles containing the constants a1(a[0]) and a2(a[1])
    * @param  b the array with 2 doubles containing the constants b1(b[0]) and b2(b[0])
    * @param  n the number of periods at which we want to predict the future population of Snowshoe hares and Lynx
    * @return the array with 2 doubles containing the population of Snowshoe hares(position0) and Lynx(position1)
    */
    static double[] preyPredLV(double [] preyPred, double[] a,
                               double[] b, int n){
     double[][] x = new double[n+1][2];
     x[0][0] = preyPred[0];
     x[0][1] = preyPred[1];
     for (int i=0; i<n;i++)
     {
     	
     //store the previous values, in order to calculate next values
     double prevH = x[i][0];
     double prevL = x[i][1];

     //caluculate next values
     x[i+1][0] = prevH*(1+a[0]-(a[1]*prevL));
     x[i+1][1] = prevL*(1-b[0]+(b[1]*prevH));
     }

    //New array to store the result and then return 	
    double result[] = {x[n][0], x[n][1]};
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

	n = 100;
	preyPred[0] = 300;
	preyPred[1] = 20;

	preyPred = preyPredLV(preyPred, a, b, n);
	System.out.println("After "+n+" generations: "
			   +"Snowhares: "+preyPred[0]
			   +" Lynx: "+preyPred[1]);
	
	n = 200;
	preyPred[0] = 300;
	preyPred[1] = 20;

	preyPred = preyPredLV(preyPred, a, b, n);
	System.out.println("After "+n+" generations: "
			   +"Snowhares: "+preyPred[0]
			   +" Lynx: "+preyPred[1]);

    }
}
