public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    public Radio(){
    }

    public Radio(int size) {
        maxStation = minStation + size;
        maxVolume = minVolume +size;
    }

    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void upVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void downVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }
}