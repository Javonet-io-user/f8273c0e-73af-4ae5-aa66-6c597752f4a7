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

public class EDIError {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public SnipTestLevel getSnipLevel() {
    try {
      Object res = javonetHandle.<NEnum>get("SnipLevel");
      if (res == null) return null;
      return SnipTestLevel.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DataSegment getSegmentSchema() {
    try {
      Object res = javonetHandle.<NObject>get("SegmentSchema");
      if (res == null) return null;
      return new DataSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LightWeightSegment getValidatingSegment() {
    try {
      Object res = javonetHandle.<NObject>get("ValidatingSegment");
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getSegmentPositionInTransaction() {
    try {
      java.lang.Long res = javonetHandle.get("SegmentPositionInTransaction");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LightWeightSegment getSTSegment() {
    try {
      Object res = javonetHandle.<NObject>get("STSegment");
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LightWeightSegment getGSSegment() {
    try {
      Object res = javonetHandle.<NObject>get("GSSegment");
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public EDIValidationMessage getMessage() {
    try {
      Object res = javonetHandle.<NEnum>get("Message");
      if (res == null) return null;
      return EDIValidationMessage.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSegment() {
    try {
      java.lang.String res = javonetHandle.get("Segment");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSegmentOrdinal() {
    try {
      java.lang.Integer res = javonetHandle.get("SegmentOrdinal");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSegmentDescription() {
    try {
      java.lang.String res = javonetHandle.get("SegmentDescription");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getElementOrdinal() {
    try {
      java.lang.Integer res = javonetHandle.get("ElementOrdinal");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getElementDescription() {
    try {
      java.lang.String res = javonetHandle.get("ElementDescription");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCompositeElementOrdinal() {
    try {
      java.lang.Integer res = javonetHandle.get("CompositeElementOrdinal");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCompositeElementDescription() {
    try {
      java.lang.String res = javonetHandle.get("CompositeElementDescription");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLoopDescription() {
    try {
      java.lang.String res = javonetHandle.get("LoopDescription");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLoop() {
    try {
      java.lang.String res = javonetHandle.get("Loop");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getLineNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("LineNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getStackTrace() {
    try {
      java.lang.String res = javonetHandle.get("StackTrace");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public EDIError() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIError");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIError(
      java.lang.Integer lineNumber,
      java.lang.String loop,
      java.lang.String segment,
      java.lang.Integer elementOrdinal,
      java.lang.Integer compositeElementOrd,
      EDIValidationMessage message,
      java.lang.String description,
      LightWeightSegment currentSTSegment,
      LightWeightSegment currentGSSegment,
      java.lang.String position,
      java.lang.Long segmentPosition,
      DataSegment schemaSeg) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.EDIError",
              lineNumber,
              loop,
              segment,
              elementOrdinal,
              compositeElementOrd,
              NEnum.fromJavaEnum(message),
              description,
              currentSTSegment,
              currentGSSegment,
              position,
              segmentPosition,
              schemaSeg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIError(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
