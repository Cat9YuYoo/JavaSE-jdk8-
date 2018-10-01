/*
	A program that uses the Vehicle class.
	
	Use a return value.

	Call this file VehicleDemo.java
*/
class Vehicle{
	int passengers;//number of passengers
	int fuelcap;	//fuel capacity in gallons
	int mpg;		//fuel consumption in miles per gallon

// This is aconstructor for Vehicle.
	Vehicle(int p,int f,int m){
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

// Return the tange.
	int range(){
		return mpg*fuelcap;
	}

	// Compute fuel needed for a given distance.
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
}