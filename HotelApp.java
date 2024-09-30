public class HotelApp
{
    public static void main(String[] args)
    {
        Valet Valet = new Valet();
        FrontDesk valetFacade = new FrontDesk(Valet);

        Cart cart = new Cart();
        FrontDesk cartFacade = new FrontDesk(cart);

        HouseKeeping houseKeeping = new HouseKeeping();
        FrontDesk houseFacade = new FrontDesk(houseKeeping);

        valetFacade.Serving("NGY123");
        cartFacade.Serving("12");
        houseFacade.Serving("506");

    }
}