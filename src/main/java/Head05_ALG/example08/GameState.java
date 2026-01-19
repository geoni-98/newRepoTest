package Head05_ALG.example08;

import java.io.*;
import java.time.LocalDateTime;

public class GameState implements Serializable {
    private static final long serialVersionUID = 1L;

    private String playerName;
    private int level;
    private int experience;
    private int gold;
    private LocalDateTime savetime;

    private transient boolean isPaued;
    private transient int fps;

    public GameState(String platerName) {
        this.playerName = platerName;
        this.level = 1;
        this.experience = 0;
        this.gold = 100;
        this.savetime = LocalDateTime.now();
    }

    public static void save(GameState state, String filename) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(state);
            System.out.println("게임이 저장되었습니다: " + filename);
        } catch (Exception e) {
            System.err.println("저장 실패: " + e.getMessage());
        }
    }

    public static GameState load(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (GameState) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("로드 실패: " + e.getMessage());
            return null;
        }
    }
}
