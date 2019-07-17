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
import jio.System.Collections.ObjectModel.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class FoundSegmentCollection extends Collection<LightWeightSegment>
    implements jio.System.Collections.Generic.IList<LightWeightSegment>,
        jio.System.Collections.Generic.ICollection<LightWeightSegment>,
        jio.System.Collections.Generic.IEnumerable<LightWeightSegment>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<LightWeightSegment>,
        IReadOnlyCollection<LightWeightSegment> {
  protected NObject javonetHandle;

  public FoundSegmentCollection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FoundSegmentCollection");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FoundSegmentCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LightWeightSegment GetLastOccurrence(java.lang.Integer segmentOrdinalNumber) {
    try {
      Object res = javonetHandle.invoke("GetLastOccurrence", segmentOrdinalNumber);
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LightWeightSegment GetLastDataSegment() {
    try {
      Object res = javonetHandle.invoke("GetLastDataSegment");
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveSegment(java.lang.Integer segmentOrdinalNumber) {
    try {
      javonetHandle.invoke("RemoveSegment", segmentOrdinalNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveHLSegment(java.lang.Integer segmentOrdinalNumber) {
    try {
      javonetHandle.invoke("RemoveHLSegment", segmentOrdinalNumber);
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
