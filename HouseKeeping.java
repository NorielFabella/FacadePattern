public class HouseKeeping implements HotelService
{

    @Override
    public void Serving(String number) {
        System.out.println("Cleaning room number " + number + "!");
    }

}