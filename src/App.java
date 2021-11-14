import Game.Business.GameWorker;

public class App {
    public static void main(String[] args) throws Exception {
        GameWorker gameWorker=new GameWorker();
        gameWorker.Login();
        gameWorker.Start();
    }
}
