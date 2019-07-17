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

public class DataElements extends Collection<DataElement>
    implements jio.System.Collections.Generic.IList<DataElement>,
        jio.System.Collections.Generic.ICollection<DataElement>,
        jio.System.Collections.Generic.IEnumerable<DataElement>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<DataElement>,
        IReadOnlyCollection<DataElement> {
  protected NObject javonetHandle;

  public DataElements() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.DataElements");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataElements(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.String elementValue) {
    try {
      javonetHandle.invoke("Add", elementValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.Integer elementValue) {
    try {
      javonetHandle.invoke("Add", elementValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.Double elementValue) {
    try {
      javonetHandle.invoke("Add", elementValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.math.BigDecimal elementValue) {
    try {
      javonetHandle.invoke("Add", elementValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.Float elementValue) {
    try {
      javonetHandle.invoke("Add", elementValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.Byte elementValue) {
    try {
      javonetHandle.invoke("Add", elementValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.Character elementValue) {
    try {
      javonetHandle.invoke("Add", elementValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.String[] elementValues) {
    try {
      javonetHandle.invoke("Add", new Object[] {elementValues});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.String elementValue, java.lang.String description) {
    try {
      javonetHandle.invoke("Add", elementValue, description);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.String elementValue, java.lang.Integer elementNumber) {
    try {
      javonetHandle.invoke("Add", elementValue, elementNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.String elementValue, java.lang.Integer min, java.lang.Integer max) {
    try {
      javonetHandle.invoke("Add", elementValue, min, max);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(
      java.lang.String elementValue,
      java.lang.Integer elementNumber,
      java.lang.String description) {
    try {
      javonetHandle.invoke("Add", elementValue, elementNumber, description);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(
      java.lang.String elementValue,
      java.lang.Integer elementNumber,
      java.lang.Integer minLength,
      java.lang.Integer maxLength,
      java.lang.String description) {
    try {
      javonetHandle.invoke("Add", elementValue, elementNumber, minLength, maxLength, description);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(
      java.lang.String elementName,
      java.lang.Integer elementNumber,
      Usage usage,
      java.lang.String[] acceptedValues) {
    try {
      javonetHandle.invoke(
          "Add",
          elementName,
          elementNumber,
          NEnum.fromJavaEnum(usage),
          new Object[] {acceptedValues});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(
      java.lang.String elementName,
      java.lang.Integer elementNumber,
      Usage usage,
      java.lang.Boolean uniqueValueOnRepetition,
      java.lang.String[] acceptedValues) {
    try {
      javonetHandle.invoke(
          "Add",
          elementName,
          elementNumber,
          NEnum.fromJavaEnum(usage),
          uniqueValueOnRepetition,
          new Object[] {acceptedValues});
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
