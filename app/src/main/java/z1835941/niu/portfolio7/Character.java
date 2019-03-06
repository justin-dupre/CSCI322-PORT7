package z1835941.niu.portfolio7;

public class Character {

    private String characterDescription;
    private int characterID;

    public Character(String characterDescription, int characterID) {
        this.characterDescription = characterDescription;
        this.characterID = characterID;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }
}
