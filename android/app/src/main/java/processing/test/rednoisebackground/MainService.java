package processing.test.rednoisebackground;
        
import processing.android.PWallpaper;
import processing.core.PApplet;
        
public class MainService extends PWallpaper {  
  @Override
  public PApplet createSketch() {
    PApplet sketch = new RedNoiseBackground();
    
    return sketch;
  }
}
