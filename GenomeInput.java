package HumanGenomeProject;
import java.util.Scanner;
public class GenomeInput {
	public static HumanGenome input() {
		Scanner in = new Scanner(System.in);
		String genomeName;
		int nmbrOfGenes;
		int nmbrChromosomes;
		int nmbrCells;
		System.out.printf("Enter GenomeName:");
		genomeName = in.nextLine();
		System.out.printf("Enter NumberofGenes:");
		nmbrOfGenes = in.nextInt();
		System.out.printf("Enter NumberofChromosomes:");
		nmbrChromosomes = in.nextInt();
		System.out.printf("Enter NumberofCells (Trillions):");
		nmbrCells = in.nextInt();
		return new HumanGenome(genomeName, nmbrOfGenes, nmbrChromosomes, nmbrCells);
	}
	public static void main(String [] args) {
		HumanGenome MickeyMouse = input();
		HumanGenome Aladdin = input();
		HumanGenome Achilles = input();
		System.out.printf("GenomeName\t\tNumberofGenes\t\tNumberofChromosomes\t\tNumberofCells (Trillions)\n");
		MickeyMouse.print();
		Aladdin.print();
		Achilles.print();
	}
}



/*
Design
variables
	genomeName ( String) we need this variable to store the genomeName of the HumanGenome
	nmbrOfGenes ( int) variable used to store number of cells
	nmbrChromosomes ( int) variable used to store number of chromosomes
	nmbrCells ( int) variable used to store the number of genes
Input
	Use scanner to read the genomeName, nmbrOfGenes, nmbrChromosomes, and nmbrCells



Processing
	makes 3 different objects: MickeyMouse, Aladdin, Achilles
	Objects call input() to return the user entered values for each nucleic acid
	Object uses the print method from HumanGenome object to print out the output


Printing

Prints the header -GenomeName		NumberofGenes		NumberofChromosomes		NumberofCells (Trillions)
MickeyMouse         		20000		46   		                76
Aladdin             		20000		46   		               120
Achilles            		20000		46   		                75
    


*/