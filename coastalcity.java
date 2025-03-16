public class CoastalCity extends CityInAustralia{
    private int distanceToWater;
    private String[] beaches;
    public CoastalCity(int d, String[] d){
        distanceToWater = d;
        beaches = d;
    }
    public String ToString(){
        System.out.println(name + population + distanceToWater);
        for(int i = 0; i < 3; i++){
            System.out.println(beaches[i] + hospitals[i]);
        }
        return "";
    }
} 
