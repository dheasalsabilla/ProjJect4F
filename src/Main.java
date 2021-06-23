import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Dosen mirza = new Dosen();
        Dosen yogy = new Dosen(2, 12, "yogy",
                new Date(), new Date(), "asisten ahli",
                "III/b", "2015");
        Dosen kurniawan = new Dosen(3, "13","Kurniawan");
    }
}
