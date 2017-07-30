package com.bupt.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by HanWei on 2017/6/18.
 */

public class MyIntentService extends IntentService {
    public MyIntentService() {
        super("MyIntentService");
    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String action = intent.getStringExtra("task_action");
        Log.v("test", "收到任务:" + action);
        SystemClock.sleep(3000);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("test", "服务销毁");
    }
}