package TugasBS;

public class TugasBS {
    private String[] dataHero;

    public TugasBS() {
    }

    public String[] getData() { return dataHero; }

    public void setData(String[] data) {
        this.dataHero = data;
    }

    public void sortData() {
        int Hero = this.dataHero.length;
        for (int i = 0;i<Hero;i++) {
            for (int j=i+1;j<Hero;j++) {
                if (this.dataHero[j]. compareTo(this.dataHero[i]) > 0) {
                    String temp = this.dataHero[i];
                    this.dataHero[i] = this.dataHero[j];
                    this.dataHero[j] = temp;
                }
            }
        }
    }

    public void PrintData() {
        for (String datum : this.dataHero) {
            System.out.println(datum+" ");
        }
    }

    public static void main(String[] args) {
        String[] Hero= {"Spiderman","Superman","Batman","Wonderwoman","Gundala"};
        TugasBS _myBubble = new TugasBS();
        _myBubble.setData(Hero);
        _myBubble.sortData();
        _myBubble.PrintData();
    }
}
