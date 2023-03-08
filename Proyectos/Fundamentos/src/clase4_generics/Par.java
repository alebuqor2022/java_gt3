package clase4_generics;

public class Par<K, V> {
K key;
V value;

public Par(K key, V value) {
	super();
	this.key=key;
	this.value=value;
}

public static <K> void display(K[] array) {
	for (K k:array) {
		System.out.println(k + " ");
	}
	System.out.println();
}
public static <T> T mostrar(T[] a) {
	return a[a.length / 2];
}

public K getKey() {
	return key;
}

public void setKey(K key) {
	this.key = key;
}

public V getValue() {
	return value;
}

public void setValue(V value) {
	this.value = value;
}

}
