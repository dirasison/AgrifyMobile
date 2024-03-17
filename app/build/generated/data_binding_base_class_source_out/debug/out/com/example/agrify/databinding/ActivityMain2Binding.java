// Generated by view binder compiler. Do not edit!
package com.example.agrify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.agrify.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final BottomAppBar bottomAPPBAR;

  @NonNull
  public final BottomNavigationView bottomNavigation;

  @NonNull
  public final FrameLayout containerFrag;

  @NonNull
  public final ImageView containerMaskGroup;

  @NonNull
  public final ImageView containerRatingRectangle;

  @NonNull
  public final ImageView containerRatingStar;

  @NonNull
  public final RelativeLayout homeCont;

  @NonNull
  public final ImageButton imagebutton;

  @NonNull
  public final TextView textRatingValue;

  private ActivityMain2Binding(@NonNull CoordinatorLayout rootView,
      @NonNull BottomAppBar bottomAPPBAR, @NonNull BottomNavigationView bottomNavigation,
      @NonNull FrameLayout containerFrag, @NonNull ImageView containerMaskGroup,
      @NonNull ImageView containerRatingRectangle, @NonNull ImageView containerRatingStar,
      @NonNull RelativeLayout homeCont, @NonNull ImageButton imagebutton,
      @NonNull TextView textRatingValue) {
    this.rootView = rootView;
    this.bottomAPPBAR = bottomAPPBAR;
    this.bottomNavigation = bottomNavigation;
    this.containerFrag = containerFrag;
    this.containerMaskGroup = containerMaskGroup;
    this.containerRatingRectangle = containerRatingRectangle;
    this.containerRatingStar = containerRatingStar;
    this.homeCont = homeCont;
    this.imagebutton = imagebutton;
    this.textRatingValue = textRatingValue;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomAPPBAR;
      BottomAppBar bottomAPPBAR = ViewBindings.findChildViewById(rootView, id);
      if (bottomAPPBAR == null) {
        break missingId;
      }

      id = R.id.bottomNavigation;
      BottomNavigationView bottomNavigation = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigation == null) {
        break missingId;
      }

      id = R.id.containerFrag;
      FrameLayout containerFrag = ViewBindings.findChildViewById(rootView, id);
      if (containerFrag == null) {
        break missingId;
      }

      id = R.id.container_mask_group;
      ImageView containerMaskGroup = ViewBindings.findChildViewById(rootView, id);
      if (containerMaskGroup == null) {
        break missingId;
      }

      id = R.id.container_rating_rectangle;
      ImageView containerRatingRectangle = ViewBindings.findChildViewById(rootView, id);
      if (containerRatingRectangle == null) {
        break missingId;
      }

      id = R.id.container_rating_star;
      ImageView containerRatingStar = ViewBindings.findChildViewById(rootView, id);
      if (containerRatingStar == null) {
        break missingId;
      }

      id = R.id.homeCont;
      RelativeLayout homeCont = ViewBindings.findChildViewById(rootView, id);
      if (homeCont == null) {
        break missingId;
      }

      id = R.id.imagebutton;
      ImageButton imagebutton = ViewBindings.findChildViewById(rootView, id);
      if (imagebutton == null) {
        break missingId;
      }

      id = R.id.text_rating_value;
      TextView textRatingValue = ViewBindings.findChildViewById(rootView, id);
      if (textRatingValue == null) {
        break missingId;
      }

      return new ActivityMain2Binding((CoordinatorLayout) rootView, bottomAPPBAR, bottomNavigation,
          containerFrag, containerMaskGroup, containerRatingRectangle, containerRatingStar,
          homeCont, imagebutton, textRatingValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}