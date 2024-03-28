public class assignment8 {
        private int[] array;
        private int collisionCounter = 0;

        public assignment8() {
            this(25);
        }

        public assignment8(int capacity) {
            this.array = new int[capacity];
        }

        public void insert(int element) {
             
            int index = element % array.length;

            while(array[index] != 0) {
                index = ((index + 1) % array.length);
                collisionCounter++;  //counter increments because that index of the array is not 0 (it has something in it)
            }
            array[index] = element;
        }

        public String toString() {
            String output = "";
            for(int i = 0; i < array.length; i++) {
                    output += array[i] + ", ";
            }
            return output;
        }

        public int getCollisionCounter() {
            return this.collisionCounter;
        }
       
    }