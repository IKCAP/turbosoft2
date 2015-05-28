package org.earthcube.geosoft.client.application;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

public class ApplicationPresenter extends
    Presenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy> {

  @ProxyCodeSplit
  public interface MyProxy extends Proxy<ApplicationPresenter> {
  }

  public interface MyView extends View {
  }

  @ContentSlot
  public static final Type<RevealContentHandler<?>> TYPE_SetMainContent = new Type<RevealContentHandler<?>>();

  @Inject
  public ApplicationPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
    super(eventBus, view, proxy, RevealType.Root);
  }
}