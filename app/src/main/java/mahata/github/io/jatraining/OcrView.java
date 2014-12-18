package mahata.github.io.jatraining;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class OcrView extends View {
    public OcrView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(0x800000ff);
        paint.setStrokeWidth(1); // Can be 0?
        canvas.drawLine(0, 0, 50, 50, paint); // Very short line
    }
}