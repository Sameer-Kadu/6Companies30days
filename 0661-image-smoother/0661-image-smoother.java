class Solution {
    public int[][] imageSmoother(int[][] img) {
        int a[][] = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                a[i][j] = average(i, j, img);
            }
        }
        return a;
    }

    public int average(int i, int j, int[][] img) {
        int total = 0;
        int sum = 0;
        for (int x = (i - 1); x <= (i + 1); x++) {
            for (int y = (j - 1); y <= (j + 1); y++) {
                if (x < 0 || y < 0 || x >= img.length || y >= img[0].length) {
                    continue;
                } else {
                    sum = img[x][y] + sum;
                    total = total +1;
                }
            }
        }
        return (sum / total);

    }

}