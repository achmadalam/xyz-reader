// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleDetailFragment$$ViewBinder<T extends com.example.xyzreader.ui.ArticleDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558522, "field 'mPhoto'");
    target.mPhoto = finder.castView(view, 2131558522, "field 'mPhoto'");
    view = finder.findRequiredView(source, 2131558508, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131558508, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131558527, "field 'mFab'");
    target.mFab = finder.castView(view, 2131558527, "field 'mFab'");
    view = finder.findRequiredView(source, 2131558526, "field 'mBodyText'");
    target.mBodyText = finder.castView(view, 2131558526, "field 'mBodyText'");
    view = finder.findRequiredView(source, 2131558524, "field 'mTitleText'");
    target.mTitleText = finder.castView(view, 2131558524, "field 'mTitleText'");
    view = finder.findRequiredView(source, 2131558525, "field 'mByLine'");
    target.mByLine = finder.castView(view, 2131558525, "field 'mByLine'");
    view = finder.findRequiredView(source, 2131558521, "field 'mToolbarLayout'");
    target.mToolbarLayout = finder.castView(view, 2131558521, "field 'mToolbarLayout'");
  }

  @Override public void unbind(T target) {
    target.mPhoto = null;
    target.mToolbar = null;
    target.mFab = null;
    target.mBodyText = null;
    target.mTitleText = null;
    target.mByLine = null;
    target.mToolbarLayout = null;
  }
}
