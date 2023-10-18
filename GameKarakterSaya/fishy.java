import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fishy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fishy extends Actor
{
    /**
     * Act - do whatever the fishy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public fishy() {
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
        checkForCollision();
        setLocation(getX(), getY()+1);
        if(isAtEdge())
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
    }
    public void checkForCollision() {
        Actor cat = getOneIntersectingObject(cat.class);
        if (cat != null) {
            ((cat) cat).increaseScore();
            getWorld().removeObject(this);
        }
    }
}
