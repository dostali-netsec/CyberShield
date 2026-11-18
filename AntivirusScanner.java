public class AntivirusScanner extends SecurityNode {

    private String[] sampleFiles = {
        "report.pdf",
        "photo.jpg",
        "assignment.docx",
        "unknown_attachment.exe",
        "notes.txt"
    };

    private String[] sampleResults = {
        "SAFE",
        "SAFE",
        "SAFE",
        "SUSPICIOUS",
        "SAFE"
    };

    private int totalScanned;
    private int threatsFound;

    public AntivirusScanner(int id, String name) {
        super(id, name);
        totalScanned = 0;
        threatsFound = 0;
    }

    public void scanSamples() {

        totalScanned = 0;
        threatsFound = 0;

        System.out.println("\n===== ANTIVIRUS SCAN =====");

        for (int i = 0; i < sampleFiles.length; i++) {

            totalScanned++;

            System.out.print(sampleFiles[i] + " : ");

            if (sampleResults[i].equals("SUSPICIOUS")) {
                threatsFound++;
                System.out.println("WARNING - SUSPICIOUS");
            }
            else {
                System.out.println("SAFE");
            }
        }

        System.out.println("\nTotal Scanned: " + totalScanned);
        System.out.println("Threats Found: " + threatsFound);
    }

    public int getTotalScanned() {
        return totalScanned;
    }

    public int getThreatsFound() {
        return threatsFound;
    }

    @Override
    public void displayStatus() {
        System.out.println("Antivirus Status: "
                + (isActive() ? "ACTIVE" : "INACTIVE"));
    }
}