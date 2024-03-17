// Generated by view binder compiler. Do not edit!
package com.example.agrify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.agrify.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FetchingDataDialogBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final RelativeLayout fetchContainer;

  @NonNull
  public final TextView fetchText;

  @NonNull
  public final ProgressBar homeProgressBar;

  private FetchingDataDialogBinding(@NonNull CardView rootView,
      @NonNull RelativeLayout fetchContainer, @NonNull TextView fetchText,
      @NonNull ProgressBar homeProgressBar) {
    this.rootView = rootView;
    this.fetchContainer = fetchContainer;
    this.fetchText = fetchText;
    this.homeProgressBar = homeProgressBar;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static FetchingDataDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FetchingDataDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fetching_data_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FetchingDataDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fetch_container;
      RelativeLayout fetchContainer = ViewBindings.findChildViewById(rootView, id);
      if (fetchContainer == null) {
        break missingId;
      }

      id = R.id.fetch_text;
      TextView fetchText = ViewBindings.findChildViewById(rootView, id);
      if (fetchText == null) {
        break missingId;
      }

      id = R.id.home_progress_bar;
      ProgressBar homeProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (homeProgressBar == null) {
        break missingId;
      }

      return new FetchingDataDialogBinding((CardView) rootView, fetchContainer, fetchText,
          homeProgressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}