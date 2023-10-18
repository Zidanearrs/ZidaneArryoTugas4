import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myworld extends World
{

    /**
     * Constructor for objects of class myworld.
     * 
     */
    public myworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 460, 1); 
        prepare();
    }
    
    private void prepare() {
        fishy fishy = new fishy();
        addObject(fishy,930,241);
        fishy.act();
        fishy.setLocation(890,180);
        enemy enemy = new enemy();
        addObject(enemy,950,241);
        enemy.act();
        enemy.setLocation(916,160);
        enemy.setLocation(912,85);
        fishy.setLocation(903,267);
        cat cat = new cat();
        addObject(cat,92,223);
    }

    public void act() {
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new fishy(),853,Greenfoot.getRandomNumber(479));
        }
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new enemy(),853,Greenfoot.getRandomNumber(479));
        }
    }
}
