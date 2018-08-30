/*
 * Copyright (C) 2017 Jeff Gilfelt.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.readystatesoftware.chuck;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.IntDef;

import com.readystatesoftware.chuck.internal.ui.MainActivity;

/**
 * Chuck utilities.
 */
public class Chuck {

    public static final int SCREEN_HTTP = 1;
    public static final int SCREEN_ERROR = 2;

    /**
     * Get an Intent to launch the Chuck UI directly.
     *
     * @param context A Context.
     * @param screen The screen to display: SCREEN_HTTP or SCREEN_ERROR.
     * @return An Intent for the main Chuck Activity that can be started with {@link Context#startActivity(Intent)}.
     */
    public static Intent getLaunchIntent(Context context, @Screen int screen) {
        return new Intent(context, MainActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                .putExtra(MainActivity.EXTRA_SCREEN, screen);
    }

    @IntDef(value = {SCREEN_HTTP, SCREEN_ERROR})
    public @interface Screen {}
}