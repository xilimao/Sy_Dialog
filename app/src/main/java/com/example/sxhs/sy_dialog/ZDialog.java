package com.example.sxhs.sy_dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sxhs on 2017/8/31.
 */

public class ZDialog extends Dialog implements View.OnClickListener {
    private OnClickOk onClickOk;//声明接口
    private OnClickNo onClickNo;
    private TextView txtTitle;
    private TextView txtContent;
    private Button btnOk;
    private Button btnNo;

    /**
     * 构造方法
     *
     * @param context
     */
    public ZDialog(@NonNull Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //设置布局
        setContentView(R.layout.dialog);
        findView();

    }

    public void findView() {
        txtTitle = (TextView) findViewById(R.id.title);
        txtContent = (TextView) findViewById(R.id.neirong);
        btnOk = (Button) findViewById(R.id.btn1);
        btnNo = (Button) findViewById(R.id.btn2);

        btnOk.setOnClickListener(this);
        btnNo.setOnClickListener(this);
    }

    /**
     * 给TextView赋值
     *
     * @param title
     * @return
     */
    public ZDialog setTitle(String title) {
        txtTitle.setText(title);
        return this;
    }

    public ZDialog setContent(String content) {
        txtContent.setText(content);
        return this;
    }

    /**
     * 写方法 声明接口
     * @param onClickOk
     * @return
     */
    public ZDialog ClickOk(OnClickOk onClickOk) {
        this.onClickOk = onClickOk;
        return this;
    }

    public ZDialog ClickNo(OnClickNo onClickNo) {
        this.onClickNo = onClickNo;
        return this;
    }

    /**
     * 响应事件
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        if (v == btnOk) {
            boolean flag = onClickOk.clickOk();
            if (flag) {
                Log.i("取消sssssssssssssssssss","dsfffffffffffffffd");
                cancel();
            }
        } else if (v == btnNo) {
            boolean flag = onClickNo.clickNo();
            if (flag) {
                Log.i("取消sssssssssssssssssss","dsfffffffffffffffd");
                cancel();
            }
        }

    }

    public interface OnClickOk {
        boolean clickOk();
    }

    public interface OnClickNo {
        boolean clickNo();
    }


}
