package Hello.Google.Maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Toast;

import com.google.android.maps.MapView;

public class HelloMapView extends MapView {

	Context mContext;
	public HelloMapView(Context context, String apiKey) {
		super(context, apiKey);
		mContext = context;
	}

	public HelloMapView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
	}

	public HelloMapView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		mContext = context;
	}
	
	public void onLayout(boolean changed,int left, int top, int right, int bottom)
	{
		String sChanged = "false";
		if (changed) sChanged = "true";
		String text = getMapCenter().toString();
		text += " " + sChanged;
		//Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();			
	}
	
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event)
	{
		String text = getMapCenter().toString();			
		Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();	
		if (event.getAction() == 1) {      				
			return true;
		}
		else return false;
	}
	
	public void onFocusChanged(boolean hasFocus, int direction, android.graphics.Rect unused)
	{
		String sChanged = "false";
		if (hasFocus) sChanged = "true";
		String text = "";
		text = sChanged;
		//Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();	
	}
	
}
