import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cat extends Actor
{
    private int score = 0;
    /**
     * Act - do whatever the cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] images; 
    private int currentImage;
    public cat () {
        images = new GreenfootImage[8]; 
        images[0] = new GreenfootImage("cat1.png");
        images[1] = new GreenfootImage("cat2.png");
        images[2] = new GreenfootImage("cat3.png");
        images[3] = new GreenfootImage("cat4.png");
        images[4] = new GreenfootImage("cat5.png");
        images[5] = new GreenfootImage("cat6.png");
        images[6] = new GreenfootImage("cat7.png");
        images[7] = new GreenfootImage("cat8.png");
        currentImage = 0; 
        setImage(images[currentImage]);
    }
    private long lastTime = 0; 
    private int delayInMillis = 100;
    public void act()
    {
        currentImage = (currentImage + 1) % images.length;
        setImage(images[currentImage]); 
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastTime >= delayInMillis) {
            Greenfoot.delay(5);    
            lastTime = currentTime;
        }            
        if(Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+5, getY());
        }
        checkForCollision();
    } 
    public void checkForCollision() {
        Actor object = getOneIntersectingObject(ObjectSpecial.class);
        if (object != null) {
            increaseScore();
            getWorld().removeObject(object);
        }
    }
    public void increaseScore() {
        score += 10;
        getWorld().showText("Score: " + score, 50, 25);
        } 
} 