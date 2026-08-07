class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;          // Start from 0
        int max = 0;

        while (j < fruits.length) {
            int x = fruits[j];
            map.put(x, map.getOrDefault(x, 0) + 1);

            while (map.size() > 2) {
                int y = fruits[i];
                map.put(y, map.get(y) - 1);

                if (map.get(y) == 0) {
                    map.remove(y);
                }

                i++;
            }

            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }
}