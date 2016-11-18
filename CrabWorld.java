import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    ScoreCounter scorecounter = new ScoreCounter();
    Worm worm = new Worm();
    private long lastTime = System.currentTimeMillis();
    private long elapsedTime = 0;
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(scorecounter, 42, 17);
        addObject(new Crab(), 150, 150);
    }
   
    public ScoreCounter getScoreCounter(){
        return scorecounter;
    }
   
    public void generateWorm(){
        int xpos = Greenfoot.getRandomNumber(600);  
        int ypos = Greenfoot.getRandomNumber(400);    
        
        addObject(new Worm(), xpos, ypos);
    }
    
    public void act(){
       long currentTime = System.currentTimeMillis();
       elapsedTime += currentTime - lastTime;
       if(elapsedTime >= 15000){
           generateWorm();
           lastTime = currentTime;
           elapsedTime = 0;
        }
    }
}
