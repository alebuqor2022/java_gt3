package clase4_generics;

public class TestGeneric {

	public static void main(String[] args) {
		ejemplo1();

	}

	public static void ejemplo1() {
		Par<Integer, String> p=new Par<>(5,"cinco");
		System.out.println("la key es " + p.getKey());
		System.out.println("el valor es " + p.getValue());
		
		Integer[] arr1= {20,30,40,50,60,70,80};
		Par.display(arr1);
		System.out.println(Par.mostrar(arr1));
	}
}
