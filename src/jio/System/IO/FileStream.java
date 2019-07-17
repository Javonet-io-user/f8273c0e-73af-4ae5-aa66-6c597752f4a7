package jio.System.IO;

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
import jio.System.IO.*;
import jio.System.Security.AccessControl.*;
import jio.System.*;
import Microsoft.Win32.SafeHandles.*;

public class FileStream extends Stream implements IDisposable {
  protected NObject javonetHandle;

  public FileStream(java.lang.String path, FileMode mode) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.FileStream", path, NEnum.fromJavaEnum(mode));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(java.lang.String path, FileMode mode, FileAccess access) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream", path, NEnum.fromJavaEnum(mode), NEnum.fromJavaEnum(access));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(java.lang.String path, FileMode mode, FileAccess access, FileShare share) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream",
              path,
              NEnum.fromJavaEnum(mode),
              NEnum.fromJavaEnum(access),
              NEnum.fromJavaEnum(share));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(
      java.lang.String path,
      FileMode mode,
      FileAccess access,
      FileShare share,
      java.lang.Integer bufferSize) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream",
              path,
              NEnum.fromJavaEnum(mode),
              NEnum.fromJavaEnum(access),
              NEnum.fromJavaEnum(share),
              bufferSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(
      java.lang.String path,
      FileMode mode,
      FileAccess access,
      FileShare share,
      java.lang.Integer bufferSize,
      FileOptions options) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream",
              path,
              NEnum.fromJavaEnum(mode),
              NEnum.fromJavaEnum(access),
              NEnum.fromJavaEnum(share),
              bufferSize,
              NEnum.fromJavaEnum(options));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(
      java.lang.String path,
      FileMode mode,
      FileAccess access,
      FileShare share,
      java.lang.Integer bufferSize,
      java.lang.Boolean useAsync) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream",
              path,
              NEnum.fromJavaEnum(mode),
              NEnum.fromJavaEnum(access),
              NEnum.fromJavaEnum(share),
              bufferSize,
              useAsync);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(
      java.lang.String path,
      FileMode mode,
      FileSystemRights rights,
      FileShare share,
      java.lang.Integer bufferSize,
      FileOptions options,
      FileSecurity fileSecurity) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream",
              path,
              NEnum.fromJavaEnum(mode),
              NEnum.fromJavaEnum(rights),
              NEnum.fromJavaEnum(share),
              bufferSize,
              NEnum.fromJavaEnum(options),
              fileSecurity);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(
      java.lang.String path,
      FileMode mode,
      FileSystemRights rights,
      FileShare share,
      java.lang.Integer bufferSize,
      FileOptions options) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream",
              path,
              NEnum.fromJavaEnum(mode),
              NEnum.fromJavaEnum(rights),
              NEnum.fromJavaEnum(share),
              bufferSize,
              NEnum.fromJavaEnum(options));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(IntPtr handle, FileAccess access) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.FileStream", handle, NEnum.fromJavaEnum(access));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(IntPtr handle, FileAccess access, java.lang.Boolean ownsHandle) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.IO.FileStream", handle, NEnum.fromJavaEnum(access), ownsHandle);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(
      IntPtr handle,
      FileAccess access,
      java.lang.Boolean ownsHandle,
      java.lang.Integer bufferSize) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream", handle, NEnum.fromJavaEnum(access), ownsHandle, bufferSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(
      IntPtr handle,
      FileAccess access,
      java.lang.Boolean ownsHandle,
      java.lang.Integer bufferSize,
      java.lang.Boolean isAsync) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream",
              handle,
              NEnum.fromJavaEnum(access),
              ownsHandle,
              bufferSize,
              isAsync);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(SafeFileHandle handle, FileAccess access) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.FileStream", handle, NEnum.fromJavaEnum(access));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(SafeFileHandle handle, FileAccess access, java.lang.Integer bufferSize) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.IO.FileStream", handle, NEnum.fromJavaEnum(access), bufferSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(
      SafeFileHandle handle,
      FileAccess access,
      java.lang.Integer bufferSize,
      java.lang.Boolean isAsync) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.FileStream", handle, NEnum.fromJavaEnum(access), bufferSize, isAsync);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileStream(NObject handle) {
    super(handle);
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
