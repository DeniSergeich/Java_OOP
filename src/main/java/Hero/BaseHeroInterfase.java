package Hero;

import java.util.ArrayList;

public interface BaseHeroInterfase {
    void step (ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> teamFriend);
    String getInfo();
}
