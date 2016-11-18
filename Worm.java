import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor
{
    private long lastTime = System.currentTimeMillis();
    private long elapsedTime = 0;
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
    public void act() 
    {
        // Add your action code here.    
        long currentTime = System.currentTimeMillis();
        elapsedTime += currentTime - lastTime;
        if(currentTime - lastTime >= 3000){
            getWorld().removeObject(this);
            lastTime = currentTime;
            elapsedTime = 0;
        }
    }
}
