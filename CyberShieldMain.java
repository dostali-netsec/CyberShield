import java.util.Scanner;

public class CyberShieldMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        FirewallSystem firewall =
                new FirewallSystem(101, "Firewall");

        AntivirusScanner antivirus =
                new AntivirusScanner(102, "Antivirus");

        SecurityNode[] nodes = {firewall, antivirus};

        int choice;

        System.out.println("\n================================");
        System.out.println("       CYBERSHIELD SYSTEM");
        System.out.println("   CYBER SECURITY MANAGEMENT");
        System.out.println("================================");

        do {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Security Dashboard");
            System.out.println("2. Firewall Management");
            System.out.println("3. Antivirus Scanner");
            System.out.println("4. Security Node Status");
            System.out.println("5. Security Report");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println(
                            "\n===== SECURITY DASHBOARD =====");

                    firewall.displayStatus();
                    antivirus.displayStatus();

                    break;

                case 2:

                    System.out.println("\n1. Enable Firewall");
                    System.out.println("2. Disable Firewall");
                    System.out.println("3. Check Connection");

                    System.out.print("Enter choice: ");

                    int firewallChoice = input.nextInt();

                    if (firewallChoice == 1) {
                        firewall.enableFirewall();
                    }
                    else if (firewallChoice == 2) {
                        firewall.disableFirewall();
                    }
                    else if (firewallChoice == 3) {

                        System.out.print(
                                "Enter source name (trusted/unknown): ");

                        String source = input.next();

                        firewall.checkConnection(source);
                    }
                    else {
                        System.out.println("Invalid choice!");
                    }

                    break;

                case 3:

                    if (antivirus.isActive()) {
                        antivirus.scanSamples();
                    }
                    else {
                        System.out.println(
                                "Antivirus is inactive!");
                    }

                    break;

                case 4:

                    System.out.println("\n===== NODE STATUS =====");

                    for (int i = 0; i < nodes.length; i++) {
                        nodes[i].displayStatus();
                    }

                    break;

                case 5:

                    System.out.println("\n===== SECURITY REPORT =====");

                    System.out.println("Firewall: "
                            + (firewall.isFirewallEnabled()
                            ? "ON" : "OFF"));

                    System.out.println("Files Scanned: "
                            + antivirus.getTotalScanned());

                    System.out.println("Threats Found: "
                            + antivirus.getThreatsFound());

                    break;

                case 0:

                    System.out.println(
                            "\nThank you for using CyberShield!");

                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        input.close();
    }
} 