package HumanGenomeProject;

public class NucleicAcid {
	//declares private variables
	private String name;
	private String chemicalFormula;
	private float molarMass;
	private float density;
	//default constructor
	public NucleicAcid() {
		
	}
	//this is an overloaded constructor with formal parameters
	public NucleicAcid(String name, String  chemicalFormula, float molarMass, float density) {
		this.name = name;
		this.chemicalFormula = chemicalFormula;
		this.molarMass = molarMass;
		this.density = density;
	}
	//these are setter and getter constructors for each variable by the user
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}
	public String getChemicalFormula() {
		return this.chemicalFormula;
	}
	public void setMolarMass(float molarMass) {
		this.molarMass = molarMass;
	}
	public float getMolarMass() {
		return this.molarMass;
	}
	public void setDensity(float density) {
		this.density = density;
	}
	public float getDensity() {
		return this.density;
	}
	//print method which prints the values inputted by the users by calling the getter method
	public void print() {
		System.out.printf("%-20s\t\t%-10s\t%-6.5fg/mol\t\t\t%-10.3fg/cm3\n", getName(), getChemicalFormula(), getMolarMass(), getDensity());
	}
}


/*
Design
variables
	name (private String) we need this variable to store the name of the Nucleic Acid
	chemicalFormula private String) variable used to store  the chemicalFormula of the Nucleic Acid
	molarMass (private float) variable used to store the molarMass of the specific Nucleic Acid
	density (private float) variable used to store the density of the Nucleic Acid
Input
	Uses formal parameters to get the variables: name, chemicalFormula, molarMass, and density


Processing
	constructors create instance variables which are used in the getter and setter methods
	and getter and setter methods will assign and read values
	
	print method: prints the formatted getter output


Printing
Cytosine            		C4H5N3O             	111.10000			1.550     
Adenine             		C5H5N5              	135.13000			1.600     
Guanine             		C5H5N5O             	151.13000			2.200     
Thymine             		C5H6N2O2            	126.11500			1.223     
Uracil              		C4H4N2O2            	112.08676			1.320     

#the print statement for the numbers and names for the user entered values are in the NucleicAcid.java file
*/