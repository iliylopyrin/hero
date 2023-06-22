package com.example.hero;

public class Hero {

    private String name; // name hero
    private String heroDescription; // описание героя
    private int heroResource; //через это будет распалагаться фото героев
    private String hart; //популярность

    //конструктор
    public Hero(String name, String heroDescription, int heroResource, String hart){
        this.name = name;
        this.heroDescription = heroDescription;
        this.heroResource = heroResource;
        this.hart = hart;
    }


    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getHeroDescription(){
        return heroDescription;
    }

    public void setHeroDescription(){
        this.heroDescription = heroDescription;
    }

    public int getHeroResource(){
        return heroResource;
    }

    public void setHeroResource(){
        this.heroResource = heroResource;
    }

    public String getHart(){
        return hart;
    }

    public void setHart(){
        this.hart = hart;
    }

}
