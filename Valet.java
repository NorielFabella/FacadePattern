public class Valet implements HotelService
{
    
    @Override
    public void Serving(String number) {
        System.out.println("Picking up car with a plate number of " + number);
        
    }
}