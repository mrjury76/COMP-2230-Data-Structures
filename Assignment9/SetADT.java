package Assignment9;

public class SetADT {
    private int[] elements;
    private int size;

    public SetADT() {
        elements = new int[10];
        size = 0;
    }

    public void add(int element) {
        if (!contains(element)) {
            if (size == elements.length) {
                resize();
            }
            elements[size] = element;
            size++;
        }
    }

    public void remove(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    private void resize() {
        int[] newElements = new int[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public String toString() {
        String result = "{";
        for (int i = 0; i < size; i++) {
            result += elements[i];
            if (i < size - 1) {
                result += ", ";
            }
        }
        result += "}";
        return result;
    }
}
