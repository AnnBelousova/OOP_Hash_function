package transport;

import java.util.Objects;

public class Sponsor {
    private String sponsorName;
    private Integer supportSum;

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName == null || sponsorName == ""?"ABC":sponsorName;
    }

    public int getSupportSum() {
        return supportSum;
    }

    public void setSupportSum(Integer supportSum) {
        this.supportSum = supportSum == null || supportSum == 0?1000:supportSum;
    }
    public void sponsorRace(){
        System.out.println("The sponsor sum is " + getSupportSum());
    }

    public Sponsor(String sponsorName, int supportSum) {
        setSponsorName(sponsorName);
        setSupportSum(supportSum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(sponsorName, sponsor.sponsorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsorName);
    }

    @Override
    public String toString() {
        return "\n" + "Sponsor Name: " + sponsorName + ", support sum: " + supportSum;
    }
}
