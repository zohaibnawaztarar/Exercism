class Darts {
    private int score = 0;

    Darts(double x, double y) {
        double magniture = Math.sqrt(x * x + y * y);
        if (magniture <= 1) {
            score = 10;
        } else if (magniture <= 5) {
            score = 5;
        } else if (magniture <= 10) {
            score = 1;
        }

    }

    int score() {
        return score;
    }
}
