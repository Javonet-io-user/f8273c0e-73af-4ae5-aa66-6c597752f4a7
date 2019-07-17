package jio.System.Security.Cryptography.X509Certificates;

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
import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.*;
import jio.System.Security.*;
import jio.System.Runtime.Serialization.*;

public class X509Certificate implements IDisposable, IDeserializationCallback, ISerializable {
  protected NObject javonetHandle;

  public X509Certificate(IntPtr handle) {
    try {
      javonetHandle =
          Javonet.New("System.Security.Cryptography.X509Certificates.X509Certificate", handle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate() {
    try {
      javonetHandle = Javonet.New("System.Security.Cryptography.X509Certificates.X509Certificate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(java.lang.Byte[] data) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate", new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(java.lang.Byte[] rawData, java.lang.String password) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate",
              new Object[] {rawData},
              password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(java.lang.Byte[] rawData, SecureString password) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate",
              new Object[] {rawData},
              password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(
      java.lang.Byte[] rawData, java.lang.String password, X509KeyStorageFlags keyStorageFlags) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate",
              new Object[] {rawData},
              password,
              NEnum.fromJavaEnum(keyStorageFlags));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(
      java.lang.Byte[] rawData, SecureString password, X509KeyStorageFlags keyStorageFlags) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate",
              new Object[] {rawData},
              password,
              NEnum.fromJavaEnum(keyStorageFlags));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(java.lang.String fileName) {
    try {
      javonetHandle =
          Javonet.New("System.Security.Cryptography.X509Certificates.X509Certificate", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(java.lang.String fileName, java.lang.String password) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate", fileName, password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(java.lang.String fileName, SecureString password) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate", fileName, password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(
      java.lang.String fileName, java.lang.String password, X509KeyStorageFlags keyStorageFlags) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate",
              fileName,
              password,
              NEnum.fromJavaEnum(keyStorageFlags));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(
      java.lang.String fileName, SecureString password, X509KeyStorageFlags keyStorageFlags) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate",
              fileName,
              password,
              NEnum.fromJavaEnum(keyStorageFlags));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(X509Certificate cert) {
    try {
      javonetHandle =
          Javonet.New("System.Security.Cryptography.X509Certificates.X509Certificate", cert);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDeserialization(Object sender) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.IDeserializationCallback")
          .invoke("OnDeserialization", sender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
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
