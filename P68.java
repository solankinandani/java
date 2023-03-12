import java.applet.*;
import java.awt.*;
/*<applet code ="P68" width="400" height="400">
</applet>
*/
public class P68 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);
		g.fillOval(310,192,229,198);		//face oval

		g.setColor(Color.blue);
		g.drawOval(271,246,37,71);	//left oval
		g.setColor(Color.blue);
		g.drawOval(537,246,37,71);	//right oval

		g.drawLine(422,271,422,332);	//verticall line
		g.drawLine(422,332,365,332);	//horizontal line

		g.setColor(Color.blue);
		g.fillArc(377,330,92,30,0,-180);	//smile
		
		g.setColor(Color.blue);
		g.fillOval(363,259,30,32);	//left eye
		g.setColor(Color.blue);
		g.fillOval(450,258,30,32);	//right eye
		
	}
	
}