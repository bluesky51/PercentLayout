# PercentLayout
百分比布局的使用

百分比布局说明：
   只支持相对布局和FrameLayout和RelativeLayout,LinearLayout可以用layout_weight实现；  
1.配置：  
   在mudule下的build.gradle的dependencies中添加compile 'com.android.support:percent:25.0.0'(25.0.0为版本号)  
2.使用：  
   《1》PercentRelativeLayout  
       1》是RelativeLayout的子类；  
       2》支持基于dimension(尺寸)和margin(边界)的的百分比(以百分号为后缀)；  
   《2》PercentFrameLayout  
        1》是FrameLayout的子类；  
        2》支持基于dimension(尺寸)和margin(边界)的的百分比(以百分号为后缀)；  

  以上两布局共有xml中常用的属性：
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
