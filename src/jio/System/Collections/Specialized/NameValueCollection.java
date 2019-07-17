package jio.System.Collections.Specialized;

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
import jio.System.Collections.Specialized.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;

public class NameValueCollection extends NameObjectCollectionBase
    implements ICollection, IEnumerable, ISerializable, IDeserializationCallback, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IEnumerable_GetEnumerator();
  }

  public NameValueCollection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Collections.Specialized.NameValueCollection");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(NameValueCollection col) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Collections.Specialized.NameValueCollection", col);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(IHashCodeProvider hashProvider, IComparer comparer) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Collections.Specialized.NameValueCollection", hashProvider, comparer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(java.lang.Integer capacity) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Collections.Specialized.NameValueCollection", capacity);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(IEqualityComparer equalityComparer) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Collections.Specialized.NameValueCollection", equalityComparer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(java.lang.Integer capacity, IEqualityComparer equalityComparer) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NameValueCollection", capacity, equalityComparer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(java.lang.Integer capacity, NameValueCollection col) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Collections.Specialized.NameValueCollection", capacity, col);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(
      java.lang.Integer capacity, IHashCodeProvider hashProvider, IComparer comparer) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NameValueCollection",
              capacity,
              hashProvider,
              comparer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
