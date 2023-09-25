class Remain {
    public static void main(String[] args) {
        // Do not touch this code
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();

        monopoly.play();
        chess.play();
        battleships.play();
    }
}

abstract class Game {
    abstract String getName();
    abstract void play();
}

class Monopoly extends Game {

    // Give "Monopoly" name to game
    @Override
    String getName() {
        return "Monopoly";
    }

    // Play method should print "Buy all property."
    @Override
    void play() {
        System.out.println("Buy all property.");
    }
}

class Chess extends Game {

    // Give "Chess" name to game
    @Override
    String getName() {
        return "Chess";
    }

    // Play method should print "Kill the enemy king."
    @Override
    void play() {
        System.out.println("Kill the enemy king.");
    }
}

class Battleships extends Game {

    // Give "Battleships" name to game
    @Override
    String getName() {
        return "Battleships";
    }

    // Play method should print "Sink all ships."
    @Override
    void play() {
        System.out.println("Sink all ships.");
    }
}
