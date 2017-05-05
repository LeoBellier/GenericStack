package listaGenerica;

public class Test {
	public static void main(String[] args){
		RandomGenerator ranGen = new RandomGenerator();
		GenericStack <Integer> pilas = new GenericStack<>();
		pilas.add(ranGen.getSmallRandomInt());
		pilas.add(ranGen.getSmallRandomInt());
		pilas.add(ranGen.getSmallRandomInt());
		pilas.add(ranGen.getSmallRandomInt());
		pilas.show();
	}
 
}
