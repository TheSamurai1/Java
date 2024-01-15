package HumanGenomeProject;
import java.util.Scanner;

public class GenoNucleicAcid {
	public static NucleicAcid input() {
		//Getting input and declaring variables
		Scanner in = new Scanner(System.in); 
		 String name; 
		 String chemicalFormula;
		 float molarMass;
		 float density;
		 //prompting the user to enter values and reading the input to variables
		System.out.printf("Enter Nucleic Acid Name: \n");
		name = in.nextLine();
		System.out.printf("Enter the Chemical Formula: \n");
		chemicalFormula = in.next();
		System.out.printf("Enter the Molar Mass: \n");
		molarMass = in.nextFloat();
		System.out.printf("Enter the density: \n");
		density = in.nextFloat();
		//instatiates a new Nucleic Acid object with the user entered values and returns the object
		return new NucleicAcid(name, chemicalFormula, molarMass, density);
	
	}
	
	public static void main(String [] args) {
		//populate the NucleicAcid objects with data entered values by user
		NucleicAcid Cytosine = input();
		NucleicAcid Adenine = input();
		NucleicAcid Guanine = input();
		NucleicAcid Thymine = input();
		NucleicAcid Uracil = input();
		//prints the objects entered data values by calling the print method
		System.out.printf("Chemical Name\t\tChemicalFormula\t\tMolarMass\t\tDensity\n");
		Cytosine.print();
		Adenine.print();
		Guanine.print();
		Thymine.print();
		Uracil.print();
		

	}
}



/*
Design
variables
	name ( String) we need this variable to store the name of the Nucleic Acid
	chemicalFormula  (String) variable used to store  the chemicalFormula of the Nucleic Acid
	molarMass ( float) variable used to store the molarMass of the specific Nucleic Acid
	density ( float) variable used to store the density of the Nucleic Acid
Input
	Use scanner to read the name, chemicalFormula, molarMass, and density



Processing
	makes 5 different objects: Cytosine, Adenine, Guanine, Thymine, and Uracil
	Objects call input() method/function to return NucleicAcid obj the user entered values for each nucleic acid
	Object uses the print method from NucleicAcid object to print out the output


Printing
	Print the header - 
	Chemical Name		ChemicalFormula		MolarMass		Density
Cytosine            		C4H5N3O             	111.10000g/mol			1.550    g/cm3   
Adenine             		C5H5N5              	135.1300g/mol			1.600    g/cm3      
Guanine             		C5H5N5O             	151.13000g/mol			2.200    g/cm3      
Thymine             		C5H6N2O2            	126.11500g/mol			1.223    g/cm3      
Uracil              		C4H4N2O2            	112.08676g/mol			1.320    g/cm3      

#the print statement for the numbers and names for the user entered values are in the NucleicAcid.java file
*/