// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleDetailActivity$$ViewBinder<T extends com.example.xyzreader.ui.ArticleDetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558505, "field 'mPager'");
    target.mPager = finder.castView(view, 2131558505, "field 'mPager'");
  }

  @Override public void unbind(T target) {
    target.mPager = null;
  }
}