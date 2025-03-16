public class inlandCity extends CityInAustralia{
    private int distanceToPark;
    private String[] parks;
    public CoastalCity(int d, String[] d){
        distanceToPark = d;
        parks = d;
    }
    public String ToString(){
        System.out.println(name + population + distanceToPark);
        for(int i = 0; i < 3; i++){
            System.out.println(parks[i] + hospitals[i]);
        }
        return "";
    }
} 
