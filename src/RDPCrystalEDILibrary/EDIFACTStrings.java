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

public class EDIFACTStrings {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUNA() {
    try {
      java.lang.String res = Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").get("UNA");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUNA(java.lang.String param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").set("UNA", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUNT() {
    try {
      java.lang.String res = Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").get("UNT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUNT(java.lang.String param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").set("UNT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUNH() {
    try {
      java.lang.String res = Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").get("UNH");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUNH(java.lang.String param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").set("UNH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUNB() {
    try {
      java.lang.String res = Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").get("UNB");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUNB(java.lang.String param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").set("UNB", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUNG() {
    try {
      java.lang.String res = Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").get("UNG");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUNG(java.lang.String param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").set("UNG", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUNE() {
    try {
      java.lang.String res = Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").get("UNE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUNE(java.lang.String param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").set("UNE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUNZ() {
    try {
      java.lang.String res = Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").get("UNZ");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUNZ(java.lang.String param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.EDIFACTStrings").set("UNZ", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFACTStrings() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFACTStrings");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFACTStrings(NObject handle) {
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
