public class FirewallSystem extends SecurityNode {

    private boolean firewallEnabled;

    public FirewallSystem(int id, String name) {
        super(id, name);
        firewallEnabled = true;
    }

    public void enableFirewall() {
        firewallEnabled = true;
        turnOn();
        System.out.println("Firewall enabled successfully!");
    }

    public void disableFirewall() {
        firewallEnabled = false;
        turnOff();
        System.out.println("Firewall disabled!");
    }

    public boolean isFirewallEnabled() {
        return firewallEnabled;
    }

    public void checkConnection(String source) {

        if (!firewallEnabled) {
            System.out.println(
                    "Firewall is OFF. Connection not checked.");
        }
        else if (source.toLowerCase().contains("unknown")
                || source.toLowerCase().contains("suspicious")) {
            System.out.println("WARNING: Connection BLOCKED!");
        }
        else {
            System.out.println("Connection ALLOWED!");
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Firewall Status: "
                + (firewallEnabled ? "PROTECTED" : "DISABLED"));
    }
}