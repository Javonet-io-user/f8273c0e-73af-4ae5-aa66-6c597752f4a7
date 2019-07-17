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

public class EDIFileParser {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumberOfSegments() {
    try {
      java.lang.Integer res = javonetHandle.get("NumberOfSegments");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getFirstChunkLoaded() {
    try {
      java.lang.Boolean res = javonetHandle.get("FirstChunkLoaded");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getWAIT_TIME() {
    try {
      java.lang.Integer res =
          Javonet.getType("RDPCrystalEDILibrary.EDIFileParser").get("WAIT_TIME");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWAIT_TIME(java.lang.Integer param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.EDIFileParser").set("WAIT_TIME", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFileParser(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Delimiters GetDelimiters(java.lang.String trimString) {
    try {
      Object res = javonetHandle.invoke("GetDelimiters", trimString);
      if (res == null) return null;
      return new Delimiters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String Take() {
    try {
      java.lang.String res = javonetHandle.invoke("Take");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsCompleted() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsCompleted");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public EDIFileParser.FileProgress StartLoadingFile(java.lang.Character delimiter) {
    try {
      Object res = javonetHandle.invoke("StartLoadingFile", delimiter);
      if (res == null) return null;
      return new EDIFileParser.FileProgress((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public static class FileProgress {
    protected NObject javonetHandle;

    public FileProgress(java.lang.Long initialSize) {
      try {
        javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFileParser+FileProgress", initialSize);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public FileProgress(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void Update(java.lang.Long currentPosition) {
      try {
        javonetHandle.invoke("Update", currentPosition);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
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
