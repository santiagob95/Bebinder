/**
 * AndTinder v0.4 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 *
 * TAndTinder is a native library for Android that provide a
 * Tinder card like effect. A card can be constructed using an
 * image and displayed with animation effects, dismiss-to-like
 * and dismiss-to-unlike, and use different sorting mechanisms.
 *
 * AndTinder is compatible with API Level 19 and upwards
 *
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.andtinder.demo.model;

import android.graphics.drawable.Drawable;

public class CardModel {
	private String   nombre;
	private Drawable cardImageDrawable;

    private OnCardDismissedListener onCardDismissedListener = null;

    private OnClickListener onClickListener = null;

    public interface OnCardDismissedListener {
        void onLike();
        void onDislike();
    }

    public interface OnClickListener {
        void OnClickListener();
    }

	public CardModel() {
		this( null, null);
	}

	public CardModel( String nombre, Drawable cardImage) {

		this.nombre = nombre;
		this.cardImageDrawable = cardImage;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Drawable getCardImageDrawable() {
		return cardImageDrawable;
	}

	public void setCardImageDrawable(Drawable cardImageDrawable) {
		this.cardImageDrawable = cardImageDrawable;
	}

    public void setOnCardDismissedListener( OnCardDismissedListener listener ) {
        this.onCardDismissedListener = listener;
    }

    public OnCardDismissedListener getOnCardDismissedListener() {
       return this.onCardDismissedListener;
    }


    public void setOnClickListener( OnClickListener listener ) {
        this.onClickListener = listener;
    }

    public OnClickListener getOnClickListener() {
        return this.onClickListener;
    }
}
