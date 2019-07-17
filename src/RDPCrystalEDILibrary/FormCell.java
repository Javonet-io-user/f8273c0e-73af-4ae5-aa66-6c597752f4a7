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
import RDPCrystalEDILibrary.*;
import jio.System.Drawing.*;

public class FormCell {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setStringFormatFlags(StringFormatFlags value) {
    try {
      javonetHandle.set("StringFormatFlags", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public StringFormatFlags getStringFormatFlags() {
    try {
      Object res = javonetHandle.<NEnum>get("StringFormatFlags");
      if (res == null) return null;
      return StringFormatFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStringAlignment(StringAlignment value) {
    try {
      javonetHandle.set("StringAlignment", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public StringAlignment getStringAlignment() {
    try {
      Object res = javonetHandle.<NEnum>get("StringAlignment");
      if (res == null) return null;
      return StringAlignment.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLineAlignment(StringAlignment value) {
    try {
      javonetHandle.set("LineAlignment", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public StringAlignment getLineAlignment() {
    try {
      Object res = javonetHandle.<NEnum>get("LineAlignment");
      if (res == null) return null;
      return StringAlignment.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDescription(java.lang.String value) {
    try {
      javonetHandle.set("Description", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDescription() {
    try {
      java.lang.String res = javonetHandle.get("Description");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setData(java.lang.String value) {
    try {
      javonetHandle.set("Data", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getData() {
    try {
      java.lang.String res = javonetHandle.get("Data");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setX(java.lang.Double value) {
    try {
      javonetHandle.set("X", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getX() {
    try {
      java.lang.Double res = javonetHandle.get("X");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setY(java.lang.Double value) {
    try {
      javonetHandle.set("Y", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getY() {
    try {
      java.lang.Double res = javonetHandle.get("Y");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWidth(java.lang.Double value) {
    try {
      javonetHandle.set("Width", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getWidth() {
    try {
      java.lang.Double res = javonetHandle.get("Width");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHeight(java.lang.Double value) {
    try {
      javonetHandle.set("Height", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getHeight() {
    try {
      java.lang.Double res = javonetHandle.get("Height");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RectangleF getRectangleF() {
    try {
      Object res = javonetHandle.<NObject>get("RectangleF");
      if (res == null) return null;
      return new RectangleF((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FormCell() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormCell");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(java.lang.String data) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormCell", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormCell", data, x, y, width, height);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height,
      StringAlignment sa) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.FormCell", data, x, y, width, height, NEnum.fromJavaEnum(sa));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height,
      StringAlignment sa,
      StringAlignment lineAlignment) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.FormCell",
              data,
              x,
              y,
              width,
              height,
              NEnum.fromJavaEnum(sa),
              NEnum.fromJavaEnum(lineAlignment));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(java.lang.String data, java.lang.Double x, java.lang.Double y, SizeF size) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormCell", data, x, y, size);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      SizeF size,
      StringAlignment sa) {
    try {
      javonetHandle =
          Javonet.New("RDPCrystalEDILibrary.FormCell", data, x, y, size, NEnum.fromJavaEnum(sa));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      SizeF size,
      StringAlignment sa,
      StringAlignment lineAlignment) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.FormCell",
              data,
              x,
              y,
              size,
              NEnum.fromJavaEnum(sa),
              NEnum.fromJavaEnum(lineAlignment));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
