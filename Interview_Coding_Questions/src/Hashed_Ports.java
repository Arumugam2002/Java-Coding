import java.util.ArrayList;
import java.util.List;

public class Hashed_Ports {
    public static List<Integer> assignPorts(int numberOfPorts, int transmissionTime, int[] packetIds) {
        int[] portStatus = new int[numberOfPorts];
        List<Integer> assignedPorts = new ArrayList<>();

        for (int packetId : packetIds) {
            int desiredPort = packetId % numberOfPorts;

            // Find the next available port
            while (portStatus[desiredPort] > 0) {
                desiredPort = (desiredPort + 1) % numberOfPorts;
            }

            assignedPorts.add(desiredPort);
            portStatus[desiredPort] = transmissionTime;

            // Simulate time passing
            for (int i = 0; i < numberOfPorts; i++) {
                if (portStatus[i] > 0) {
                    portStatus[i]--;
                }
            }
        }

        return assignedPorts;
    }

    public static void main(String[] args) {
        int numberOfPorts = 3;
        int transmissionTime = 2;
        int[] packetIds = {4, 7, 10, 6};

        List<Integer> result = assignPorts(numberOfPorts, transmissionTime, packetIds);
        System.out.println(result); // Output: [1, 2, 1, 0]
    }
}
