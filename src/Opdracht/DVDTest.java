package Opdracht;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class DVDTest {

    @Test
    void basicTicket() {
        DVD d = new DVD("Kaan", "Avengers", 18.5, "8/10/2020", false, "SF");
        String videotheekTicket = d.getInformationDVD();
        assertEquals(" -> Kaan - Avengers - science fiction - discount false - 18.5 - 8/10/2020", videotheekTicket);
    }

    @Test
    void nameClientEmpty() {
        DVD d = new DVD("", "Avengers", 18.0, "8/10/2020", false, "A");
        String videotheekTicket = d.getInformationDVD();
        assertEquals("Cancellation ticket", videotheekTicket);
    }

    @Test
    void nameDVDEmpty() {
        DVD d = new DVD("Kaan", "", 18.0, "8/10/2020", false, "AD");
        String videotheekTicketKlant1 = d.getInformationDVD();
        assertEquals("Cancellation ticket", videotheekTicketKlant1);
    }

    @Test
    void priceEmpty() {
        DVD d = new DVD("Kaan", "", null, "8/10/2020", false, "H");
        String videotheekTicketKlant1 = d.getInformationDVD();
        assertEquals("Cancellation ticket", videotheekTicketKlant1);
    }

    @Test
    void dateEmpty() {
        DVD d = new DVD("Kaan", "Avengers", 18.0, "", false, "C");
        String videotheekTicketKlant1 = d.getInformationDVD();
        assertEquals("Cancellation ticket", videotheekTicketKlant1);

    }

    @Test
    void basicTwoTickets() {
        DVD d = new DVD("Kaan", "Captain America 1", 18.0, "8/10/2020", false, "A");
        DVD t = new DVD("Gabriel", "Tarzan", 16.0, "9/10/2020", false, "F");
        String videotheekTicketKlant1 = d.getInformationDVD();
        String videotheekTicketKlant2 = t.getInformationDVD();
        assertEquals(" -> Kaan - Captain America 1 - action - discount false - 18.0 - 8/10/2020", videotheekTicketKlant1);
        assertEquals(" -> Gabriel - Tarzan - fantasy - discount false - 16.0 - 9/10/2020", videotheekTicketKlant2);
        System.out.println(d.getInformationDVD());
        System.out.println(t.getInformationDVD());
    }

    @Test
    void oneFieldEmptyTwoTickets() {
        DVD d = new DVD("Kaan", "", 18.0, "8/10/2020", false, "SF");
        DVD t = new DVD("Gabriel", "Captain America", 16.01, "8/10/2020", false, "AD");
        String videotheekTicketKlant1 = d.getInformationDVD();
        String videotheekTicketKlant2 = t.getInformationDVD();
        assertEquals("Cancellation ticket", videotheekTicketKlant1);
        assertEquals(" -> Gabriel - Captain America - adventure - discount false - 16.01 - 8/10/2020", videotheekTicketKlant2);
        System.out.println(d.getInformationDVD());
        System.out.println(t.getInformationDVD());
    }

    @Test
    void basicTicketWithDiscount() {
        DVD d = new DVD("Kaan", "Avengers", 15.0, "8/10/2020", true, "C");
        String videotheekTicket = d.getInformationDVD();
        assertEquals(" -> Kaan - Avengers - comedy - discount true - 12.0 - 8/10/2020", videotheekTicket);
    }

    @Test
    void basicTicketWithoutDiscount() {
        DVD d = new DVD("Kaan", "Avengers", 15.0, "8/10/2020", false, "SF");
        String videotheekTicket = d.getInformationDVD();
        assertEquals(" -> Kaan - Avengers - science fiction - discount false - 15.0 - 8/10/2020", videotheekTicket);
    }
    

    @Test
    void TwoTicketWithOneDiscountAndOneWithout() {
        DVD d = new DVD("Kaan", "Avengers", 15.00, "8/10/2020", true, "H");
        DVD t = new DVD("Gabriel", "Captain America", 16.01, "8/10/2020", false, "A");
        String videotheekTicketKlant1 = d.getInformationDVD();
        String videotheekTicketKlant2 = t.getInformationDVD();
        assertEquals(" -> Kaan - Avengers - horror - discount true - 12.0 - 8/10/2020", videotheekTicketKlant1);
        assertEquals(" -> Gabriel - Captain America - action - discount false - 16.01 - 8/10/2020", videotheekTicketKlant2);
        System.out.println(d.getInformationDVD());
        System.out.println(t.getInformationDVD());
    }

    @Test
    void TicketWithGenre() {
        DVD d = new DVD("Kaan", "Avengers", 15.0, "8/10/2020", false, "SF");
        String videotheekTicket = d.getInformationDVD();
        assertEquals(" -> Kaan - Avengers - science fiction - discount false - 15.0 - 8/10/2020", videotheekTicket);
    }



}
