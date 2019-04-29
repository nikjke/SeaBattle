public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();

        field.init();
        field.setShip();

        System.out.println("Game start!");

        do {
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        } while (field.isNotGameOver());
    }
}
