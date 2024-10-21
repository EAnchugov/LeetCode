package seventyFive;

public class _9 {
    public static void main(String[] args) {
        int[][] array = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        array = floodFill(array,1,1,2);

        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentColor = image[sr][sc];

        // Условие выхода: если цвет уже совпадает с целевым цветом
        if (currentColor == color) return image;

        fill(image, sr, sc, currentColor, color);
        return image;
    }

    private static void fill(int[][] image, int sr, int sc, int currentColor, int color) {
        // Проверка границ
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
        if (image[sr][sc] != currentColor) return;

        // Заливка цвета
        image[sr][sc] = color;

        // Рекурсивные вызовы для всех четырех направлений
        fill(image, sr - 1, sc, currentColor, color); // вверх
        fill(image, sr + 1, sc, currentColor, color); // вниз
        fill(image, sr, sc - 1, currentColor, color); // влево
        fill(image, sr, sc + 1, currentColor, color); // вправо
    }
}

