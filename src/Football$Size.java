interface Football {
    void soccer();

    interface Basketball {
        void basket(double factor);
    }

    interface ScoreManipulator extends Football, Basketball {
        void manipulate();
    }

    class ScoreManipulatorImpl implements ScoreManipulator {
        @Override
        public void soccer() {
            System.out.println("Show the football manipulated score.");
        }

        @Override
        public void basket(double factor) {
            System.out.println("Show the basketball manipulated score.");
        }

        @Override
        public void manipulate() {
            System.out.println("Manipulating the scores.");
        }
    }

    public static void main(String[] args) {
        ScoreManipulator manipulator = new ScoreManipulatorImpl();
        manipulator.soccer();
        manipulator.basket(1.5);
        manipulator.manipulate();
    }
}
