public class Piloto {
    Nave miNave;
    String superior;
    Piloto (Nave nave) {
        this.miNave = nave;
    }

    void setName(String name) {
        this.superior = name;
    }

    String getName() {
        return this.superior;
    }

}
