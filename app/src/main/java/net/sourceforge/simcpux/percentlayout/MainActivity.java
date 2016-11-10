package net.sourceforge.simcpux.percentlayout;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 百分比布局，只支持相对布局和FrameLayout和RelativeLayout,LinearLayout可以用layout_weight实现；
 * <p>
 * 1.PercentRelativeLayout
 * 1》是RelativeLayout的子类；
 * 2》支持基于dimension(尺寸)和margin(边界)的的百分比(以百分号为后缀)；
 * 3》xml中常用的属性：
 * layout_widthPercent:child的宽度百分比
 * layout_heightPercent:child的高度百分比
 *
 * 使用以上2种不需要在使用layout_width/height
 *
 * layout_marginPercent:child的外边距的百分比
 * layout_marginLeftPercent:child的左边的外边距的百分比
 * layout_marginTopPercent:child的顶部的外边距的百分比
 * layout_marginRightPercent:child的右边的外边距的百分比
 * layout_marginBottomPercent:child的底部的外边距的百分比
 * layout_marginStartPercent:child的开始的外边距的百分比
 * layout_marginEndPercent:child的结束的外边距的百分比
 * layout_aspectRatio:设置宽和高的比例，假设宽度300dp,layout_aspectRatio=3:4,那么高度为400dp
 */
public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(
                R.id.layout01,new TopFragment()
        ).commit();
        fragmentManager.beginTransaction().add(
                R.id.layout02,new BottomFragment()
        ).commit();
    }
}
