package RDPCrystalEDILibrary;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.Drawing.*;
import jio.System.*;
import jio.System.Drawing.Printing.*;
import jio.System.Collections.ObjectModel.*;

public class FormPrinter extends Component implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setImage(Image value) {
    try {
      javonetHandle.set("Image", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Image getImage() {
    try {
      Object res = javonetHandle.<NObject>get("Image");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setImageX(java.lang.Float value) {
    try {
      javonetHandle.set("ImageX", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Float getImageX() {
    try {
      java.lang.Float res = javonetHandle.get("ImageX");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setImageY(java.lang.Float value) {
    try {
      javonetHandle.set("ImageY", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Float getImageY() {
    try {
      java.lang.Float res = javonetHandle.get("ImageY");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Bitmap getFormBitmap() {
    try {
      Object res = javonetHandle.<NObject>get("FormBitmap");
      if (res == null) return null;
      return new Bitmap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFontColor(Color value) {
    try {
      javonetHandle.set("FontColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getFontColor() {
    try {
      Object res = javonetHandle.<NObject>get("FontColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPageSettings(PageSettings value) {
    try {
      javonetHandle.set("PageSettings", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PageSettings getPageSettings() {
    try {
      Object res = javonetHandle.<NObject>get("PageSettings");
      if (res == null) return null;
      return new PageSettings((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFont(Font value) {
    try {
      javonetHandle.set("Font", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Font getFont() {
    try {
      Object res = javonetHandle.<NObject>get("Font");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrintCellRectangle(java.lang.Boolean value) {
    try {
      javonetHandle.set("PrintCellRectangle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPrintCellRectangle() {
    try {
      java.lang.Boolean res = javonetHandle.get("PrintCellRectangle");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrintUppercase(java.lang.Boolean value) {
    try {
      javonetHandle.set("PrintUppercase", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPrintUppercase() {
    try {
      java.lang.Boolean res = javonetHandle.get("PrintUppercase");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Collection<FormCell> getCells() {
    try {
      Object res = javonetHandle.<NObject>get("Cells");
      if (res == null) return null;
      return new Collection<FormCell>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FormPrinter(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormPrinter", container);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormPrinter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormPrinter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormPrinter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height) {
    try {
      Object res = javonetHandle.invoke("CreateCell", data, x, y, width, height);
      if (res == null) return null;
      return new FormCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height,
      StringAlignment sa) {
    try {
      Object res =
          javonetHandle.invoke("CreateCell", data, x, y, width, height, NEnum.fromJavaEnum(sa));
      if (res == null) return null;
      return new FormCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height,
      StringAlignment sa,
      StringAlignment lineAlignment) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateCell",
              data,
              x,
              y,
              width,
              height,
              NEnum.fromJavaEnum(sa),
              NEnum.fromJavaEnum(lineAlignment));
      if (res == null) return null;
      return new FormCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FormCell CreateCell(java.lang.String data) {
    try {
      Object res = javonetHandle.invoke("CreateCell", data);
      if (res == null) return null;
      return new FormCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FormCell CreateCell(
      java.lang.String data, java.lang.Double x, java.lang.Double y, SizeF size) {
    try {
      Object res = javonetHandle.invoke("CreateCell", data, x, y, size);
      if (res == null) return null;
      return new FormCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      SizeF size,
      StringAlignment sa) {
    try {
      Object res = javonetHandle.invoke("CreateCell", data, x, y, size, NEnum.fromJavaEnum(sa));
      if (res == null) return null;
      return new FormCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      SizeF size,
      StringAlignment sa,
      StringAlignment lineAlignment) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateCell",
              data,
              x,
              y,
              size,
              NEnum.fromJavaEnum(sa),
              NEnum.fromJavaEnum(lineAlignment));
      if (res == null) return null;
      return new FormCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print() {
    try {
      javonetHandle.invoke("Print");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PrintPreview() {
    try {
      javonetHandle.invoke("PrintPreview");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PrintToImage() {
    try {
      javonetHandle.invoke("PrintToImage");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
