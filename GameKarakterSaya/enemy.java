import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemy() {
         {
        GreenfootImage img = this.getImage();
        img.scale(80,50);
        this.setImage(img);
        }
    }
    
    public void act()
    {
        move(-3);
        {
        GreenfootImage img = this.getImage();
        img.scale(80,50);
        this.setImage(img);
        }
        if (getX() <= 0) {
        getWorld().removeObject(this);
        } 
    }
}
