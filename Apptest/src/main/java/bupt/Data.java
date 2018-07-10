package bupt;

/**
 * Created by MaHaoLi on 2018/5/31.
 */
public class Data {
    private String level;
    private String name;
    private String node;
    private String board;
    private String location;

    public Data(){}

    public Data(String level, String name, String node, String board, String location) {
        this.level = level;
        this.name = name;
        this.node = node;
        this.board = board;
        this.location = location;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Data)) return false;

        Data data = (Data) o;

        if (level != null ? !level.equals(data.level) : data.level != null) return false;
        if (name != null ? !name.equals(data.name) : data.name != null) return false;
        if (node != null ? !node.equals(data.node) : data.node != null) return false;
        if (board != null ? !board.equals(data.board) : data.board != null) return false;
        return !(location != null ? !location.equals(data.location) : data.location != null);

    }

    @Override
    public int hashCode() {
        int result = level != null ? level.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (node != null ? node.hashCode() : 0);
        result = 31 * result + (board != null ? board.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "bupt.Data{" +
                "level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", node='" + node + '\'' +
                ", board='" + board + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
