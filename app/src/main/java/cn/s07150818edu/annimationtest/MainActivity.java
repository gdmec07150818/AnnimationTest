package cn.s07150818edu.annimationtest;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt= (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //动画
//                TranslateAnimation animation=new TranslateAnimation(0,200,0,0);
//                animation.setDuration(1000);
//                animation.setFillAfter(true);
                ImageView iv= (ImageView) findViewById(R.id.imageView);
//                iv.startAnimation(animation);

               //同时的动画   1
//               ObjectAnimator.ofFloat(iv, "rotation",0,360F).setDuration(1000).start();
//                ObjectAnimator.ofFloat(iv,"translationY",0,360F).setDuration(1000).start();
//                ObjectAnimator.ofFloat(iv,"translationX",0,360F).setDuration(1000).start();

                //同时的动画   2

//                PropertyValuesHolder an1=PropertyValuesHolder.ofFloat("rotation",0,360F);
//                PropertyValuesHolder an2=PropertyValuesHolder.ofFloat("rotation",0,360F);
//                PropertyValuesHolder an3=PropertyValuesHolder.ofFloat("rotation",0,360F);
//                ObjectAnimator.ofPropertyValuesHolder(iv,an1,an2,an3).setDuration(1000).start();

                ObjectAnimator animator1=ObjectAnimator.ofFloat(iv,"rotation",0,360F);
                ObjectAnimator animator2=ObjectAnimator.ofFloat(iv,"translationX",0,360F);
                ObjectAnimator animator3=ObjectAnimator.ofFloat(iv,"translationY",0,360F);
                AnimatorSet set=new AnimatorSet();
                set.play(animator2).with(animator3);
                set.play(animator1).after(animator2);
                set.setDuration(1000);
                set.start();
                //属性动画

            }
        });
    }
    public void ss(){
        Toast.makeText(this,"click",Toast.LENGTH_LONG);
    }


}
