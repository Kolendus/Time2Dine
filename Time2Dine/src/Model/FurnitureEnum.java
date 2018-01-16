public enum FurnitureEnum {
    DOOR,SWINDOW,DWINDOW,FOURPTABLE,SIXPTABLE,EIGHTPTABLE,SMALLCHAIR,BIGCHAIR,
    SMALLBENCH,BIGBENCH,LOWILUM,MEDILUM,STRONGILUM;



    public int getWidth(FurnitureEnum furEnum){
            switch(furEnum){
                case FOURPTABLE: return 34;
                case SIXPTABLE: return 56;
                case EIGHTPTABLE: return 75;
                case SMALLCHAIR: return 18;
                case SMALLBENCH: return 99;
                case BIGBENCH: return 198;
                case LOWILUM: return 18;
                case MEDILUM: return 18;
                case STRONGILUM: return 18;
            }
            return -1;
        }

    public int getHeight(FurnitureEnum furEnum){
        switch(furEnum){
            case FOURPTABLE: return 34;
            case SIXPTABLE: return 34;
            case EIGHTPTABLE: return 41;
            case SMALLCHAIR: return 22;
            case SMALLBENCH: return 32;
            case BIGBENCH: return 32;
            case LOWILUM: return 18;
            case MEDILUM: return 18;
            case STRONGILUM: return 18;
        }
        return -1;
    }

    public int getNumberOfFurniture(FurnitureEnum furEnum){
        int counter = 0;
        for(FurnitureEnum f : FurnitureEnum.values()) {
            if ( f.name().equals(furEnum.name()) )
                return counter;
            counter++;
        }
        return -1;
    }

}



