package Label;

public class Labels {

        public static void main(String[] args) {
            int[][] arr = {{2,3,4},{6,5,6}};
            int search = 6;
            int pozX = -1;
            int pozY = -1;

            PARENT_LOOP: for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    if (arr[i][j] == search){
                        pozX = i;
                        pozY = j;
                        break PARENT_LOOP;
                    }
                }
            }

            if (pozX == -1 || pozY == -1){
                System.out.println("position not found " + search);
            } else
                System.out.println("Value " + search + " found: " + "(" + pozX + "," + pozY + ")");


        }
    }
