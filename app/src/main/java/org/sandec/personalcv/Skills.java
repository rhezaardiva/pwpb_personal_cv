package org.sandec.personalcv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class Skills extends AppCompatActivity {
    ProgressBar pb1, pb2, pb3, pb4, pb5, pb6, pb7, pb8;
    int counter1 = 0;
    int counter2 = 0;
    int counter3 = 0;
    int counter4 = 0;
    int counter5 = 0;
    int counter6 = 0;
    int counter7 = 0;
    int counter8 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        //PROGRAMMING LANGUAGE
        //------------------------------------------------------------------------------------------
        //HTML
        prog1();
        //CSS
        prog2();
        //JAVASCRIPT
        prog3();
        //PHP
        prog4();

        //FRAMEWORK
        //------------------------------------------------------------------------------------------
        //LARAVEL
        prog5();
        //CODEIGNITER
        prog6();
        //PHOTOSHOP
        prog7();
        //ILLUSTRATOR
        prog8();
    }

    //HTML
    public void prog1(){
        pb1 = (ProgressBar) findViewById(R.id.pb1);
        final Timer html = new Timer();
        TimerTask htmltt = new TimerTask() {
            @Override
            public void run() {
                counter1++;
                pb1.setProgress(counter1);

                if (counter1 == 85)
                    html.cancel();
            }
        };
        html.schedule(htmltt, 0, 25);
    }

    //CSS
    public void prog2(){
        pb2 = (ProgressBar) findViewById(R.id.pb2);
        final Timer css = new Timer();
        TimerTask csstt = new TimerTask() {
            @Override
            public void run() {
                counter2++;
                pb2.setProgress(counter2);

                if (counter2 == 80)
                    css.cancel();
            }
        };
        css.schedule(csstt, 0, 25);
    }

    //JAVASCRIPT
    public void prog3(){
        pb3 = (ProgressBar) findViewById(R.id.pb3);
        final Timer js = new Timer();
        TimerTask jstt = new TimerTask() {
            @Override
            public void run() {
                counter3++;
                pb3.setProgress(counter3);

                if (counter3 == 78)
                    js.cancel();
            }
        };
        js.schedule(jstt, 0, 25);
    }

    //PHP
    public void prog4(){
        pb4 = (ProgressBar) findViewById(R.id.pb4);
        final Timer php = new Timer();
        TimerTask phptt = new TimerTask() {
            @Override
            public void run() {
                counter4++;
                pb4.setProgress(counter4);

                if (counter4 == 75)
                    php.cancel();
            }
        };
        php.schedule(phptt, 0, 25);
    }

    //LARAVEL
    public void prog5(){
        pb5 = (ProgressBar) findViewById(R.id.pb5);
        final Timer laravel = new Timer();
        TimerTask laraveltt = new TimerTask() {
            @Override
            public void run() {
                counter5++;
                pb5.setProgress(counter5);

                if (counter5 == 85)
                    laravel.cancel();
            }
        };
        laravel.schedule(laraveltt, 0, 25);
    }

    //CODEIGNITER
    public void prog6(){
        pb6 = (ProgressBar) findViewById(R.id.pb6);
        final Timer ci = new Timer();
        TimerTask citt = new TimerTask() {
            @Override
            public void run() {
                counter6++;
                pb6.setProgress(counter6);

                if (counter6 == 80)
                    ci.cancel();
            }
        };
        ci.schedule(citt, 0, 25);
    }

    //PHOTOSHOP
    public void prog7(){
        pb7 = (ProgressBar) findViewById(R.id.pb7);
        final Timer ps = new Timer();
        TimerTask pstt = new TimerTask() {
            @Override
            public void run() {
                counter7++;
                pb7.setProgress(counter7);

                if (counter7 == 75)
                    ps.cancel();
            }
        };
        ps.schedule(pstt, 0, 25);
    }

    //ILLUSTRATOR
    public void prog8(){
        pb8 = (ProgressBar) findViewById(R.id.pb8);
        final Timer ill = new Timer();
        TimerTask illtt = new TimerTask() {
            @Override
            public void run() {
                counter8++;
                pb8.setProgress(counter8);

                if (counter8 == 80)
                    ill.cancel();
            }
        };
        ill.schedule(illtt, 0, 25);
    }
}
