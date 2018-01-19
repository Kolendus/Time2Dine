import spock.lang.Specification

class CanteenTest extends Specification {
    def "GetAlgorithmSetting"() {
        given:
            Map<String,Double> list = new HashMap<>();
        when:
            list.put("Test", 10)
        then:
            10 == list.get("Test")
    }

    def "SetWalls"() {
        given:
        Canteen canteen = new Canteen(10);
        when:
        canteen.setWalls(10,12,15,13);
        then:
        canteen.getbWall() == 10;
        canteen.gettWall() == 12;
        canteen.getrWall() == 15;
        canteen.getlWall() == 13;
    }

    def "ValidateWallsPerimeters"() {
        given:
        Canteen canteen = new Canteen(10);

        when:
        canteen.setWalls(10,10,10,10);
        then:
        canteen.validateWallsPerimeters() == false
    }
    def "GetCost"(){
        given:
        Map<FurnitureEnum,Double> list = new HashMap<>();
        when:
        list.put(FurnitureEnum.CHAIR, 10)
        then:
        10 == list.get(FurnitureEnum.CHAIR)
    }
}
