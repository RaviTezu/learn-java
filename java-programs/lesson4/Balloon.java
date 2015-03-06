//Implement a class Balloon that models a spherical balloon that is being filled with air.  
//The constructor constructs an empty balloon (That is, the volume is 0).

//Supply these methods: 
//	void addAir(double amount) adds the given amount of air
//	double getVolume() gets the current volume
//	double getSurfaceArea() gets the current surface area
//	double getRadius() gets the current radius

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 3" for some tips on 
// how to begin. 

//See this link for formulas for volume and surface area: 
//    http://math.about.com/od/formulas/ss/surfaceareavol.htm 

//Hints
//	You can find the nth root of a number by using the pow method from the Math class 
//  where the exponent is 1/n.
//	You will need to solve the volume formula for radius.


/**
 * models a spherical balloon that is being filled with air
 */
public class Balloon
{
    private double volume;
    public Balloon() {
       volume = 0;
    }
    void addAir(double amount) {
        volume += amount;
    }
    double getVolume() {
     return volume;
    }
    double getSurfaceArea() {
    double surFace = (4 * Math.PI) * (Math.pow(getRadius() ,2));
    return surFace;
    }
    double getRadius() {
        return Math.pow(((3 * volume) /( 4 * Math.PI)) , 1.0/3.0);
    }  
}

