package com.base.dialog.lib;

import com.base.dialog.lib.effects.BaseEffects;
import com.base.dialog.lib.effects.FadeIn;
import com.base.dialog.lib.effects.Fall;
import com.base.dialog.lib.effects.FlipH;
import com.base.dialog.lib.effects.FlipV;
import com.base.dialog.lib.effects.NewsPaper;
import com.base.dialog.lib.effects.RotateBottom;
import com.base.dialog.lib.effects.RotateLeft;
import com.base.dialog.lib.effects.Shake;
import com.base.dialog.lib.effects.SideFall;
import com.base.dialog.lib.effects.SlideBottom;
import com.base.dialog.lib.effects.SlideLeft;
import com.base.dialog.lib.effects.SlideRight;
import com.base.dialog.lib.effects.SlideTop;
import com.base.dialog.lib.effects.Slit;

/*
 * Copyright 2014 litao
 * https://github.com/sd6352051/NiftyDialogEffects
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public enum Effectstype {

	Fadein(FadeIn.class), Slideleft(SlideLeft.class), Slidetop(SlideTop.class), SlideBottom(
			SlideBottom.class), Slideright(SlideRight.class), Fall(Fall.class), Newspager(
			NewsPaper.class), Fliph(FlipH.class), Flipv(FlipV.class), RotateBottom(
			RotateBottom.class), RotateLeft(RotateLeft.class), Slit(Slit.class), Shake(
			Shake.class), Sidefill(SideFall.class);
	private Class<? extends BaseEffects> effectsClazz;

	private Effectstype(Class<? extends BaseEffects> mclass) {
		effectsClazz = mclass;
	}

	public BaseEffects getAnimator() {
		BaseEffects bEffects = null;
		try {
			bEffects = effectsClazz.newInstance();
		} catch (ClassCastException e) {
			throw new Error("Can not init animatorClazz instance");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			throw new Error("Can not init animatorClazz instance");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new Error("Can not init animatorClazz instance");
		}
		return bEffects;
	}
}
