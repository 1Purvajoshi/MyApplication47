package com.example.purvajoshi.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPage =(ViewPager)findViewById(R.id.myPager);

        myPage.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
    }
    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","TwentyOne","TwentyTwo","TwentyThree","TwentyFour","TwentyFive","TwentySix","TwentySeven","TwentyEight","TwentyNine","Thirty","ThirtyOne","ThirtyTwo","ThirtyThree","ThirtyFour","ThirtyFive","ThirtySix","ThirtySeven","ThirtyEight","ThirtyNine","Fourty","FourtyOne","FourtyTwo","FourtyThree","FourtyFour","FourtyFive","FourtySix","FourtySeven","FourtyEight","FourtyNine","Fifty"};

        public MyOwnPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position==0){
                return new one();
            }
            if (position==1){
                return new Two();
            }
            if (position==2){
                return new Three();
            }
            if (position==3){
                return new four();
            }
            if (position==4)
            {
                return new Five();
            }
            if (position==5)
            {
                return new Six();

            }
            if (position==6)
            {
                return new Seven();
            }
            if (position==7)
            {
                return new Eight();
            }
            if (position==8)
            {
                return new Nine();
            }
            if (position==9)
            {
                return new Ten();
            }
            if (position==10)
            {
                return new Eleven();
            }
            if (position==11)
            {
                return new Twelve();
            }
            if (position==12)
            {
                return new Thirteen();
            }
            if (position==13)
            {
                return new Fourteen();
            }
            if (position==14) {
                return new Fifteen();
            }
            if (position==15)
            {
                return new Sixteen();
            }
            if (position==16)
            {
                return new Seventeen();
            }
            if (position==17)
            {
                return new Eighteen();
            }
            if (position==18)
            {
                return new Nineteen();
            }
            if (position==19)
            {
                return new Twenty();
            }
            if (position==20)
            {
                return new TwentyOne();
            }
            if (position==21)
            {
                return new TwentyTwo();
            }
            if (position==22)
            {
                return new TwentyThree();
            }
            if (position==23)
            {
                return new TwentyFour();
            }
            if (position==24)
            {
                return new TwentyFive();
            }
            if (position==25)
            {
                return new TwentySix();
            }
            if (position==26)
            {
                return new TwentySeven();
            }
            if (position==27)
            {
                return new TwentyEight();
            }
            if (position==28)
            {
                return new TwentyNine();
            }
            if (position==29)
            {
                return new Thirty();
            }
            if (position==30)
            {
                return new ThirtyOne();
            }
            if (position==31)
            {
                return new ThirtyTwo();
            }
            if (position==32)
            {
                return new ThirtyThree();
            }
            if (position==33)
            {
                return new ThirtyFour();
            }
            if (position==34)
            {
                return new ThirtyFive();
            }
            if (position==35)
            {
                return new ThirtySix();
            }
            if (position==36)
            {
                return new ThirtySeven();
            }
            if (position==37)
            {
                return new ThirtyEight();
            }
            if (position==38)
            {
                return new ThirtyNine();
            }
            if (position==39)
            {
                return new Fourty();
            }
            if (position==40)
            {
                return new FourtyOne();
            }
            if (position==41)
            {
                return new FourtyTwo();
            }
            if (position==42)
            {
                return new FourtyThree();
            }
            if (position==43)
            {
                return new FourtyFour();
            }
            if (position==44)
            {
                return new FourtyFive();
            }
            if (position==45)
            {
                return new FourtySix();
            }
            if (position==46)
            {
                return new FourtySeven();
            }
            if (position==47)
            {
                return new FourtyEight();
            }
            if (position==48)
            {
                return new FourtyNine();
            }
            if (position==49)
            {
                return new Fifty();
            }










            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }
}


