/*
 * Copyright (C) 2019 The Android Open Source Project
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
package com.android.customization.module.logging

import com.android.customization.model.grid.GridOption
import com.android.customization.module.logging.ThemesUserEventLogger.ColorSource
import com.android.wallpaper.module.logging.TestUserEventLogger
import javax.inject.Inject
import javax.inject.Singleton

/** Test implementation of [ThemesUserEventLogger]. */
@Singleton
class TestThemesUserEventLogger @Inject constructor() :
    TestUserEventLogger(), ThemesUserEventLogger {

    override fun logThemeColorApplied(@ColorSource source: Int, variant: Int, seedColor: Int) {}

    override fun logGridApplied(grid: GridOption) {}

    override fun logClockApplied(clockId: String) {}

    override fun logClockColorApplied(seedColor: Int) {}

    override fun logClockSizeApplied(clockSize: Int) {}

    override fun logThemedIconApplied(useThemeIcon: Boolean) {}

    override fun logLockScreenNotificationApplied(showLockScreenNotifications: Boolean) {}

    override fun logShortcutApplied(shortcut: String, shortcutSlotId: String) {}

    override fun logDarkThemeApplied(useDarkTheme: Boolean) {}
}