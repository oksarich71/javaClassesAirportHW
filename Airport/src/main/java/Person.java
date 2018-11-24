public class Person {
    private int wallet;

    public Person(int wallet){
        this.wallet = wallet;
    }

    public int countMoney(){
        return this.wallet;
    }

    public int payForTicket(Flight flight){
        int ticket = flight.getFlightPrice();
        return this.wallet -= ticket;
    }
}
