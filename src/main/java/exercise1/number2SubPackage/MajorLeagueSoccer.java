package sba_core_java.exercise.number2SubPackage;

class MajorLeagueSoccer {

    private int[] playerNumberArray;

    public MajorLeagueSoccer() {
        playerNumberArray = new int[11];
        for (int i = 0; i < playerNumberArray.length; i++) {
            playerNumberArray[i] = i + 1;
        }
    }

    public void displayPlayerNumbers() {
        for (int num : playerNumberArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void sendPlayerToMinorLeague(int playerID) {
        if (playerID >= 1 && playerID <= 11) {
            playerNumberArray[playerID - 1] = -1;
            System.out.println("Player " + playerID +
                    " is sent to minor league");
        } else {
            System.out.println("Player " + playerID + "" +
                    " is no longer available");
        }
    }

    public void transferPlayerToDifferentTeam
            (int playerID, String destinationTeam) {
        if (playerID >= 1 && playerID <= 11) {
            playerNumberArray[playerID - 1] = -1;
            System.out.println("Player " + playerID + "" +
                    " is transferred to " + destinationTeam);
        } else {
            System.out.println("Player " + playerID + "" +
                    " is no longer available");
        }
    }
}