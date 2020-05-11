class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
          int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }
        return colorImage(image, sr, sc, oldColor, newColor);
    }
    private int[][] colorImage(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            if (sr != 0) {
                image = colorImage(image, sr-1, sc, oldColor, newColor);
            }
            if (sr != image.length-1) {
                image = colorImage(image, sr+1, sc, oldColor, newColor);
            }
            if (sc != 0) {
                image = colorImage(image, sr, sc-1, oldColor, newColor);
            }
            if (sc != image[0].length-1) {
                image = colorImage(image, sr, sc+1, oldColor, newColor);
            }
        }
        return image;
    }
}