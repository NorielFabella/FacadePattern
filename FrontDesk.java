public class FrontDesk
{
    private HotelService service;

    public FrontDesk(HotelService service)
    {
        this.service = service;
    }

    public void Serving(String number)
    {
        service.Serving(number);
    }


}