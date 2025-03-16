// Hospital Locator Starter       A+CR
class Main {
  public static void main(String[] args) {
    // 1. Brisbane, Queensland
    String[] brisbaneHospitals = {"Royal Brisbane and Women's Hospital", "Princess Alexandra Hospital", "The Prince Charles Hospital"};
    String[] brisbaneBeaches = {"Shorncliffe Beach", "Nudgee Beach", "Suttons Beach"};
    CoastalCity brisbane = new CoastalCity("Brisbane", 2280000, brisbaneHospitals, 15, brisbaneBeaches);


    // 2. Darwin, Northern Territory
    String[] darwinHospitals = {"Royal Darwin Hospital", "Darwin Private Hospital", "Palmerston Regional Hospital"};
    String[] darwinBeaches = {"Mindil Beach", "Casuarina Beach", "Vesteys Beach"};
    CoastalCity darwin = new CoastalCity("Darwin", 147000, darwinHospitals, 0, darwinBeaches);


    // 3. Melbourne, Victoria
    String[] melbourneHospitals = {"The Royal Melbourne Hospital", "St Vincent's Hospital Melbourne", "The Alfred Hospital"};
    String[] melbourneBeaches = {"St Kilda Beach", "Brighton Beach", "Williamstown Beach"};
    CoastalCity melbourne = new CoastalCity("Melbourne", 5150000, melbourneHospitals, 0, melbourneBeaches);


    // 4. Perth, Western Australia
    String[] perthHospitals = {"Sir Charles Gairdner Hospital", "Royal Perth Hospital", "Fiona Stanley Hospital"};
    String[] perthBeaches = {"Cottesloe Beach", "Scarborough Beach", "City Beach"};
    CoastalCity perth = new CoastalCity("Perth", 2140000, perthHospitals, 10, perthBeaches);


    // 5. Rockhampton, Queensland
    String[] rockhamptonHospitals = {"Rockhampton Hospital", "Hillcrest Rockhampton Private Hospital", "Mater Misericordiae Hospital Rockhampton"};
    String[] rockhamptonBeaches = {"Yeppoon Main Beach", "Lammermoor Beach", "Kemp Beach"};
    CoastalCity rockhampton = new CoastalCity("Rockhampton", 78000, rockhamptonHospitals, 40, rockhamptonBeaches);


    // 6. Sydney, New South Wales
    String[] sydneyHospitals = {"Royal Prince Alfred Hospital", "St Vincent's Hospital Sydney", "Prince of Wales Hospital"};
    String[] sydneyBeaches = {"Bondi Beach", "Manly Beach", "Coogee Beach"};
    CoastalCity sydney = new CoastalCity("Sydney", 5370000, sydneyHospitals, 0, sydneyBeaches);
    // 1. Alice Springs, Northern Territory
    String[] aliceSpringsHospitals = {"Alice Springs Hospital", "Central Australian Aboriginal Congress Clinic", "Headspace Alice Springs"};
    String[] aliceSpringsParks = {"Alice Springs Desert Park", "West MacDonnell National Park", "Olive Pink Botanic Garden"};
    inlandCity aliceSprings = new inlandCity("Alice Springs", 26000, aliceSpringsHospitals, 20, aliceSpringsParks);


    // 2. Bendigo, Victoria
    String[] bendigoHospitals = {"Bendigo Health", "St John of God Hospital Bendigo", "Bendigo Day Surgery"};
    String[] bendigoParks = {"Rosalind Park", "Bendigo Botanic Gardens", "Greater Bendigo National Park"};
    inlandCity bendigo = new inlandCity("Bendigo", 100000, bendigoHospitals, 10, bendigoParks);


    // 3. Toowoomba, Queensland
    String[] toowoombaHospitals = {"Toowoomba Hospital", "St Vincent's Private Hospital Toowoomba", "Baillie Henderson Hospital"};
    String[] toowoombaParks = {"Queens Park", "Japanese Garden (Ju Raku En)", "Picnic Point Parklands"};
    inlandCity toowoomba = new inlandCity("Toowoomba", 173200, toowoombaHospitals, 10, toowoombaParks);


    // 4. Wagga Wagga, New South Wales
    String[] waggaWaggaHospitals = {"Wagga Wagga Base Hospital", "Calvary Riverina Hospital", "Calvary Day Procedure Centre"};
    String[] waggaWaggaParks = {"Wagga Wagga Botanic Gardens", "Victory Memorial Gardens", "Lake Albert"};
    inlandCity waggaWagga = new inlandCity("Wagga Wagga", 69000, waggaWaggaHospitals, 8, waggaWaggaParks);


    // Coastal Cities
System.out.println(brisbane);
System.out.println(darwin);
System.out.println(melbourne);
System.out.println(perth);
System.out.println(rockhampton);
System.out.println(sydney);


// Inland Cities
System.out.println(aliceSprings);
System.out.println(bendigo);
System.out.println(toowoomba);
System.out.println(waggaWagga);

		
  }
}
