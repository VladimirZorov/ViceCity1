package viceCity.models.players;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.Repository;

import java.util.ArrayList;

public class BasePlayer implements Player{

    private String name;
    private int lifePoints;
    private Repository<Gun> gunRepository;

    public BasePlayer(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.gunRepository =
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getLifePoints() {
        return 0;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public Repository<Gun> getGunRepository() {
        return null;
    }

    @Override
    public void takeLifePoints(int points) {

    }
}
