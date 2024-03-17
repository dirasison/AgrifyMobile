// Generated by view binder compiler. Do not edit!
package com.example.agrify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.agrify.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileFragmentBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView contactInfoTextView;

  @NonNull
  public final Button logout;

  @NonNull
  public final TextView name;

  @NonNull
  public final LinearLayout profileInfoContainer;

  @NonNull
  public final LinearLayout profileInfoLayout;

  @NonNull
  public final TextView sellerTextView;

  private FragmentProfileFragmentBinding(@NonNull FrameLayout rootView,
      @NonNull TextView contactInfoTextView, @NonNull Button logout, @NonNull TextView name,
      @NonNull LinearLayout profileInfoContainer, @NonNull LinearLayout profileInfoLayout,
      @NonNull TextView sellerTextView) {
    this.rootView = rootView;
    this.contactInfoTextView = contactInfoTextView;
    this.logout = logout;
    this.name = name;
    this.profileInfoContainer = profileInfoContainer;
    this.profileInfoLayout = profileInfoLayout;
    this.sellerTextView = sellerTextView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contactInfoTextView;
      TextView contactInfoTextView = ViewBindings.findChildViewById(rootView, id);
      if (contactInfoTextView == null) {
        break missingId;
      }

      id = R.id.logout;
      Button logout = ViewBindings.findChildViewById(rootView, id);
      if (logout == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.profileInfoContainer;
      LinearLayout profileInfoContainer = ViewBindings.findChildViewById(rootView, id);
      if (profileInfoContainer == null) {
        break missingId;
      }

      id = R.id.profileInfoLayout;
      LinearLayout profileInfoLayout = ViewBindings.findChildViewById(rootView, id);
      if (profileInfoLayout == null) {
        break missingId;
      }

      id = R.id.sellerTextView;
      TextView sellerTextView = ViewBindings.findChildViewById(rootView, id);
      if (sellerTextView == null) {
        break missingId;
      }

      return new FragmentProfileFragmentBinding((FrameLayout) rootView, contactInfoTextView, logout,
          name, profileInfoContainer, profileInfoLayout, sellerTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}