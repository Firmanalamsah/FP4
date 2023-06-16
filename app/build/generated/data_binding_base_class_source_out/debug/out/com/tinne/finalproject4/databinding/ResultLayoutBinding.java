// Generated by view binder compiler. Do not edit!
package com.tinne.finalproject4.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tinne.finalproject4.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ResultLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout LLsatu;

  @NonNull
  public final Button btnBook;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView img;

  @NonNull
  public final LinearLayout lldua;

  @NonNull
  public final LinearLayout lltiga;

  @NonNull
  public final TextView tvDarimana;

  @NonNull
  public final TextView tvHarga;

  @NonNull
  public final TextView tvJamDarimana;

  @NonNull
  public final TextView tvJamKemana;

  @NonNull
  public final TextView tvKemana;

  @NonNull
  public final TextView tvKodeBus;

  @NonNull
  public final TextView tvNamaBus;

  private ResultLayoutBinding(@NonNull CardView rootView, @NonNull LinearLayout LLsatu,
      @NonNull Button btnBook, @NonNull ImageView imageView, @NonNull ImageView imageView3,
      @NonNull ImageView img, @NonNull LinearLayout lldua, @NonNull LinearLayout lltiga,
      @NonNull TextView tvDarimana, @NonNull TextView tvHarga, @NonNull TextView tvJamDarimana,
      @NonNull TextView tvJamKemana, @NonNull TextView tvKemana, @NonNull TextView tvKodeBus,
      @NonNull TextView tvNamaBus) {
    this.rootView = rootView;
    this.LLsatu = LLsatu;
    this.btnBook = btnBook;
    this.imageView = imageView;
    this.imageView3 = imageView3;
    this.img = img;
    this.lldua = lldua;
    this.lltiga = lltiga;
    this.tvDarimana = tvDarimana;
    this.tvHarga = tvHarga;
    this.tvJamDarimana = tvJamDarimana;
    this.tvJamKemana = tvJamKemana;
    this.tvKemana = tvKemana;
    this.tvKodeBus = tvKodeBus;
    this.tvNamaBus = tvNamaBus;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ResultLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ResultLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.result_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ResultLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.LLsatu;
      LinearLayout LLsatu = ViewBindings.findChildViewById(rootView, id);
      if (LLsatu == null) {
        break missingId;
      }

      id = R.id.btnBook;
      Button btnBook = ViewBindings.findChildViewById(rootView, id);
      if (btnBook == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.img;
      ImageView img = ViewBindings.findChildViewById(rootView, id);
      if (img == null) {
        break missingId;
      }

      id = R.id.lldua;
      LinearLayout lldua = ViewBindings.findChildViewById(rootView, id);
      if (lldua == null) {
        break missingId;
      }

      id = R.id.lltiga;
      LinearLayout lltiga = ViewBindings.findChildViewById(rootView, id);
      if (lltiga == null) {
        break missingId;
      }

      id = R.id.tvDarimana;
      TextView tvDarimana = ViewBindings.findChildViewById(rootView, id);
      if (tvDarimana == null) {
        break missingId;
      }

      id = R.id.tvHarga;
      TextView tvHarga = ViewBindings.findChildViewById(rootView, id);
      if (tvHarga == null) {
        break missingId;
      }

      id = R.id.tvJamDarimana;
      TextView tvJamDarimana = ViewBindings.findChildViewById(rootView, id);
      if (tvJamDarimana == null) {
        break missingId;
      }

      id = R.id.tvJamKemana;
      TextView tvJamKemana = ViewBindings.findChildViewById(rootView, id);
      if (tvJamKemana == null) {
        break missingId;
      }

      id = R.id.tvKemana;
      TextView tvKemana = ViewBindings.findChildViewById(rootView, id);
      if (tvKemana == null) {
        break missingId;
      }

      id = R.id.tvKodeBus;
      TextView tvKodeBus = ViewBindings.findChildViewById(rootView, id);
      if (tvKodeBus == null) {
        break missingId;
      }

      id = R.id.tvNamaBus;
      TextView tvNamaBus = ViewBindings.findChildViewById(rootView, id);
      if (tvNamaBus == null) {
        break missingId;
      }

      return new ResultLayoutBinding((CardView) rootView, LLsatu, btnBook, imageView, imageView3,
          img, lldua, lltiga, tvDarimana, tvHarga, tvJamDarimana, tvJamKemana, tvKemana, tvKodeBus,
          tvNamaBus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}