package it.stacja.app.web.wykop.app.image;

import org.springframework.stereotype.Component;

public class InternalImageResolver implements PageImageResolver {


  public String resolveImageURL(String pageURL) {
    return "/images/cross.png";
  }
}
