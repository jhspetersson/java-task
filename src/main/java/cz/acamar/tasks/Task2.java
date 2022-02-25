package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        // just in case the life on planet Earth will depend on time complexity of this task...
        // in any other circumstances will be using Arrays.stream(input).map(i -> i*i).sorted().toArray() ;-)

        var len = input.length;
        var result = new int[len];
        var mid = 0;

        for (mid = 0; mid < len; mid++) {
            if (input[mid] > 0) {
                break;
            }
        }

        var i = mid - 1;
        var j = mid;
        var idx = 0;

        while (i >= 0 && j < len) {
            var si = input[i]*input[i];
            var sj = input[j]*input[j];

            if (si < sj) {
                result[idx] = si;
                i--;
            } else {
                result[idx] = sj;
                j++;
            }

            idx++;
        }

        while (i >= 0) {
            result[idx++] = input[i]*input[i];
            i--;
        }

        while (j < len) {
            result[idx++] = input[j]*input[j];
            j++;
        }

        return result;
    }
}
