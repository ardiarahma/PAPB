package com.example.windows10.superfam;

/**
 * Created by Windows 10 on 5/3/2018.
 */

public class ViewPager {
    
    viewPager.addOnPageChangeListener(new OnPageChangeListener() {
        @Override
        public void onPageSelected(int position) {

            switch (position) {
                case 0:
                    img_page1.setImageResource(R.drawable.dot_selected);
                    img_page2.setImageResource(R.drawable.dot);
                    img_page3.setImageResource(R.drawable.dot);
                    img_page4.setImageResource(R.drawable.dot);
                    break;

                case 1:
                    img_page1.setImageResource(R.drawable.dot);
                    img_page2.setImageResource(R.drawable.dot_selected);
                    img_page3.setImageResource(R.drawable.dot);
                    img_page4.setImageResource(R.drawable.dot);
                    break;

                case 2:
                    img_page1.setImageResource(R.drawable.dot);
                    img_page2.setImageResource(R.drawable.dot);
                    img_page3.setImageResource(R.drawable.dot_selected);
                    img_page4.setImageResource(R.drawable.dot);
                    break;

                case 3:
                    img_page1.setImageResource(R.drawable.dot);
                    img_page2.setImageResource(R.drawable.dot);
                    img_page3.setImageResource(R.drawable.dot);
                    img_page4.setImageResource(R.drawable.dot_selected);
                    break;

                default:
                    break;
            }


        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    });
}
