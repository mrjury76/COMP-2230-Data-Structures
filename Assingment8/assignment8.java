public class assignment8 {
        private int[] array = new int[17];
        private int collisionCounter = 0;

        public void insert(int element) {
             
            int index = element % array.length;

            while(array[index] != 0) {
                index = ((index + 1) % array.length);
                collisionCounter++;
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