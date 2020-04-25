package com.innovative.canvas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    Button btnColor1, btnColor2, btnColor3, btnColor4, btnColor5, btnColor6, btnColor7, btnColor8, btnColor9, btnColor10, btnColor11, btnColor12;
    DrawingView dv ;
    private Paint mPaint;
    LinearLayout ll;
    ImageView img,imgLeft,imgRight;
    int i=1;
    public Canvas mCanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imgimg);

        imgLeft = findViewById(R.id.imgLeft);
        imgRight = findViewById(R.id.imgRight);

        ll= findViewById(R.id.ll);
        img = findViewById(R.id.imgimg);

        dv = new DrawingView(this);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(12);
        ll.addView(dv);
        dv.setBackground(img.getDrawable());
        img.setVisibility(View.GONE);


        imgLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i>1) {
                    i--;
                    setImage();
                    dv.refreshDrawableState();
                    dv = new DrawingView(MainActivity.this);
                    ll.removeAllViews();
                    ll.addView(dv);
                    dv.setBackground(img.getDrawable());
                    img.setVisibility(View.GONE);
                }
            }
        });

        imgRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<20) {
                    i++;
                    setImage();
                    dv.refreshDrawableState();
                    dv = new DrawingView(MainActivity.this);
                    ll.removeAllViews();
                    ll.addView(dv);
                    dv.setBackground(img.getDrawable());
                    img.setVisibility(View.GONE);

                }

            }
        });

        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this,getString(R.string.admob_app_id));
        // Find Banner ad
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        // Display Banner ad
        mAdView.loadAd(adRequest);




        btnColor1 = findViewById(R.id.btnColor1);
        btnColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#F1081F"));
            }
        });

        btnColor2 = findViewById(R.id.btnColor2);
        btnColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#00C030"));
            }
        });

        btnColor3 = findViewById(R.id.btnColor3);
        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#FFE700"));
            }
        });

        btnColor4 = findViewById(R.id.btnColor4);
        btnColor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#FF9B08"));
            }
        });

        btnColor5 = findViewById(R.id.btnColor5);
        btnColor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#1262FF"));
            }
        });

        btnColor6 = findViewById(R.id.btnColor6);
        btnColor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#F12DFF"));
            }
        });

        btnColor7 = findViewById(R.id.btnColor7);
        btnColor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#A819FF"));
            }
        });


        btnColor8 = findViewById(R.id.btnColor8);
        btnColor8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#1CCBFF"));
            }
        });

        btnColor9 = findViewById(R.id.btnColor9);
        btnColor9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#8E5213"));
            }
        });

        btnColor10 = findViewById(R.id.btnColor10);
        btnColor10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#FFFFFF"));
            }
        });

        btnColor11 = findViewById(R.id.btnColor11);
        btnColor11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#909090"));
            }
        });

        btnColor12 = findViewById(R.id.btnColor12);
        btnColor12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaint.setColor(Color.parseColor("#000000"));
            }
        });

    }

    private void setImage() {
        switch (i)
        {
            case 1:
                img.setImageResource(R.drawable.img1);
            break;

            case 2:
                img.setImageResource(R.drawable.img2);
                break;

            case 3:
                img.setImageResource(R.drawable.img3);
                break;

            case 4:
                img.setImageResource(R.drawable.img4);
                break;

            case 5:
                img.setImageResource(R.drawable.img5);
                break;

            case 6:
                img.setImageResource(R.drawable.img6);
                break;

            case 7:
                img.setImageResource(R.drawable.img7);
                break;

            case 8:
                img.setImageResource(R.drawable.img8);
                break;

            case 9:
                img.setImageResource(R.drawable.img9);
                break;

            case 10:
                img.setImageResource(R.drawable.img10);
                break;

            case 11:
                img.setImageResource(R.drawable.img11);
                break;

            case 12:
                img.setImageResource(R.drawable.img12);
                break;

            case 13:
                img.setImageResource(R.drawable.img13);
                break;

            case 14:
                img.setImageResource(R.drawable.img14);
                break;

            case 15:
                img.setImageResource(R.drawable.img15);
                break;

            case 16:
                img.setImageResource(R.drawable.img16);
                break;

            case 17:
                img.setImageResource(R.drawable.img17);
                break;

            case 18:
                img.setImageResource(R.drawable.img18);
                break;

            case 19:
                img.setImageResource(R.drawable.img19);
                break;

            case 20:
                img.setImageResource(R.drawable.img20);
                break;
        }
    }

    public class DrawingView extends View {

        public int width;
        public  int height;
        private Bitmap mBitmap;
        private Path mPath;
        private Paint mBitmapPaint;
        Context context;
        private Paint circlePaint;
        private Path circlePath;

        public DrawingView(Context c) {
            super(c);
            context=c;
            mPath = new Path();
            mBitmapPaint = new Paint(Paint.DITHER_FLAG);
            circlePaint = new Paint();
            circlePath = new Path();
            circlePaint.setAntiAlias(true);
            circlePaint.setColor(Color.BLUE);
            circlePaint.setStyle(Paint.Style.STROKE);
            circlePaint.setStrokeJoin(Paint.Join.MITER);
            circlePaint.setStrokeWidth(4f);
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);

            mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
            mCanvas = new Canvas(mBitmap);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            canvas.drawBitmap( mBitmap, 0, 0, mBitmapPaint);
            canvas.drawPath( mPath,  mPaint);
            canvas.drawPath( circlePath,  circlePaint);
        }

        private float mX, mY;
        private static final float TOUCH_TOLERANCE = 4;

        private void touch_start(float x, float y) {
            mPath.reset();
            mPath.moveTo(x, y);
            mX = x;
            mY = y;
        }

        private void touch_move(float x, float y) {
            float dx = Math.abs(x - mX);
            float dy = Math.abs(y - mY);
            if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
                mPath.quadTo(mX, mY, (x + mX)/2, (y + mY)/2);
                mX = x;
                mY = y;

                circlePath.reset();
                circlePath.addCircle(mX, mY, 30, Path.Direction.CW);
            }
        }

        private void touch_up() {
            mPath.lineTo(mX, mY);
            circlePath.reset();
            // commit the path to our offscreen
            mCanvas.drawPath(mPath,  mPaint);
            // kill this so we don't double draw
            mPath.reset();
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {

            float x = event.getX();
            float y = event.getY();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    touch_start(x, y-100);
                    invalidate();
                    break;
                case MotionEvent.ACTION_MOVE:
                    touch_move(x, y-100);
                    invalidate();
                    break;
                case MotionEvent.ACTION_UP:
                    touch_up();
                    invalidate();
                    break;
            }
            return true;
        }
    }
}
