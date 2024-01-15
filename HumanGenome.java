package HumanGenomeProject;
public class HumanGenome {
	//properties of the human genome
	private String genomeName;
	private int nmbrOfGenes;
	private int nmbrChromosomes;
	private int nmbrCells;
	public HumanGenome() {
		//default constructor
	}
	//public constructor
	public HumanGenome(String genomeName, int nmbrOfGenes, int nmbrChromosomes, int nmbrCells) {
		this.genomeName = genomeName;
		this.nmbrCells = nmbrCells;
		this.nmbrChromosomes = nmbrChromosomes;
		this.nmbrOfGenes = nmbrOfGenes;
	
	}
	//setter and getter methods
	public void setGenomeName(String genomeName) {
		this.genomeName = genomeName;
	}
	public String getGenomeName() {
		return this.genomeName;
	}
	public void setNmbrOfGenes(int nmbrOfGenes) {
		this.nmbrOfGenes = nmbrOfGenes;
	}
	public int getNmbrOfGenes() {
		return nmbrOfGenes;
	}
	public void setNmbrChromosomes(int nmbrChromosomes) {
		this.nmbrChromosomes = nmbrChromosomes;
	}
	public int getNmbrChromosomes() {
		return nmbrChromosomes;
	}
	public void setNmbrCells(int nmbrCells) {
		this.nmbrCells = nmbrCells;
	}
	public int getNmbrCells() {
		return this.nmbrCells;
	}
	//print method
	public void print() {
		System.out.printf("%-20s\t\t%-5d\t\t%-5d\t\t%18d\n", getGenomeName(), getNmbrOfGenes(), getNmbrChromosomes(), getNmbrCells());
	}
}

/*
Design
variables
	genomeName ( Private String) we need this variable to store the genomeName of the HumanGenome
	nmbrOfGenes (Private int) variable used to store number of cells
	nmbrChromosomes (Private int) variable used to store number of chromosomes
	nmbrCells (Private int) variable used to store the number of genes
Input
	Uses formal parameters to get the variables: genomeName, nmbrOfGenes, nmbrChromosomes, and nmbrCells


Processing
	constructors create instance variables which are used in the getter and setter methods
	and getter and setter methods will assign and read values
	
	print method: prints the formatted getter output
	
Printing
GenomeName		NumberofGenes		NumberofChromosomes		NumberofCells (Trillions)
MickeyMouse         		20000		46   		                76
Aladdin             		20000		46   		               120
Achilles            		20000		46   		                75
#the print statement for the numbers and names for the user entered values are in the NucleicAcid.java file
*/