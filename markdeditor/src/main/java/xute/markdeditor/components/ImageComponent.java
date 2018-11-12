package xute.markdeditor.components;

import android.content.Context;

public class ImageComponent {
  private Context context;

  public ImageComponent(Context context) {
    this.context = context;
  }

  public ImageComponentItem getNewImageComponentItem(String filePath, String serverToken, ImageComponentItem.ImageComponentListener imageRemoveListener) {
    ImageComponentItem imageComponentItem = new ImageComponentItem(context);
    imageComponentItem.setImageComponentListener(imageRemoveListener);
    imageComponentItem.setImageInformation(filePath, serverToken, false,"");
    return imageComponentItem;
  }

  public ImageComponentItem getNewImageComponentItem(ImageComponentItem.ImageComponentListener imageRemoveListener) {
    ImageComponentItem imageComponentItem = new ImageComponentItem(context);
    imageComponentItem.setImageComponentListener(imageRemoveListener);
    return imageComponentItem;
  }
}
