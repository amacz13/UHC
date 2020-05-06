package fr.amacz13.uhc.state;

public class GameStateManager {

    private static final GameStateManager gsm = new GameStateManager();
    private GameState currentState = GameState.WAITING;

    private GameStateManager() {

    }

    public static GameStateManager getInstance() {
        return gsm;
    }

    public GameState getGameState() {
        return this.currentState;
    }

    public GameState setGameState(GameState gs) {
        this.currentState = gs;
        return this.currentState;
    }



}
