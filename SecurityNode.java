public class SecurityNode {

    private int nodeId;
    private String nodeName;
    private boolean active;

    public SecurityNode(int nodeId, String nodeName) {
        this.nodeId = nodeId;
        this.nodeName = nodeName;
        this.active = true;
    }

    public int getNodeId() {
        return nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public boolean isActive() {
        return active;
    }

    public void turnOn() {
        active = true;
    }

    public void turnOff() {
        active = false;
    }

    public void displayStatus() {
        System.out.println(nodeName + " : "
                + (active ? "ACTIVE" : "INACTIVE"));
    }
}