package listaGenerica;

public class GenericStack<T> {
	NodeS<T> root;

	public void add(T val) {
		NodeS<T> tmp = new NodeS<>();
		tmp.value = val;
		tmp.next = null;
		if (root == null)
			root = tmp;
		else {
			tmp.next = root;
			root = tmp;
		}
	}

	public void show() {
		while (root != null) {
			System.out.println(root.value);
			root = root.next;
		}
	}
}

class NodeS<T> {
	T value;
	NodeS<T> next;
}