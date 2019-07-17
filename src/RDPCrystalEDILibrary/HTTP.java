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
import jio.System.*;
import jio.System.Net.*;

public class HTTP extends Component implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setUsername(java.lang.String value) {
    try {
      javonetHandle.set("Username", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUsername() {
    try {
      java.lang.String res = javonetHandle.get("Username");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPassword(java.lang.String value) {
    try {
      javonetHandle.set("Password", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPassword() {
    try {
      java.lang.String res = javonetHandle.get("Password");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHostname(java.lang.String value) {
    try {
      javonetHandle.set("Hostname", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getHostname() {
    try {
      java.lang.String res = javonetHandle.get("Hostname");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCommand(java.lang.String value) {
    try {
      javonetHandle.set("Command", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCommand() {
    try {
      java.lang.String res = javonetHandle.get("Command");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public HTTP() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.HTTP");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "FileUploadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HTTP.UploadFileCompletedDelegate handler : _FileUploadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadFileCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadFileCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HTTP.DownloadFileCompletedDelegate handler : _DownloadFileCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadFileProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HTTP.DownloadFileProgressChangedDelegate handler :
                  _DownloadFileProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadProgressChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FileUploadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HTTP.UploadFileProgressChangedDelegate handler :
                  _FileUploadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadProgressChangedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HTTP(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.HTTP", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "FileUploadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HTTP.UploadFileCompletedDelegate handler : _FileUploadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadFileCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadFileCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HTTP.DownloadFileCompletedDelegate handler : _DownloadFileCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadFileProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HTTP.DownloadFileProgressChangedDelegate handler :
                  _DownloadFileProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadProgressChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FileUploadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HTTP.UploadFileProgressChangedDelegate handler :
                  _FileUploadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadProgressChangedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HTTP(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UploadFile(java.lang.String path) {
    try {
      javonetHandle.invoke("UploadFile", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UploadFileAsync(java.lang.String path) {
    try {
      javonetHandle.invoke("UploadFileAsync", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadFile(java.lang.String downloadedFilePath) {
    try {
      javonetHandle.invoke("DownloadFile", downloadedFilePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadFileAsync(java.lang.String downloadedFilePath) {
    try {
      javonetHandle.invoke("DownloadFileAsync", downloadedFilePath);
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
  /** Event */

  private java.util.ArrayList<HTTP.UploadFileCompletedDelegate> _FileUploadCompletedListeners =
      new java.util.ArrayList<HTTP.UploadFileCompletedDelegate>();

  public void addFileUploadCompleted(HTTP.UploadFileCompletedDelegate toAdd) {
    _FileUploadCompletedListeners.add(toAdd);
  }

  public void removeFileUploadCompleted(HTTP.UploadFileCompletedDelegate toRemove) {
    _FileUploadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<HTTP.DownloadFileCompletedDelegate> _DownloadFileCompletedListeners =
      new java.util.ArrayList<HTTP.DownloadFileCompletedDelegate>();

  public void addDownloadFileCompleted(HTTP.DownloadFileCompletedDelegate toAdd) {
    _DownloadFileCompletedListeners.add(toAdd);
  }

  public void removeDownloadFileCompleted(HTTP.DownloadFileCompletedDelegate toRemove) {
    _DownloadFileCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<HTTP.DownloadFileProgressChangedDelegate>
      _DownloadFileProgressChangedListeners =
          new java.util.ArrayList<HTTP.DownloadFileProgressChangedDelegate>();

  public void addDownloadFileProgressChanged(HTTP.DownloadFileProgressChangedDelegate toAdd) {
    _DownloadFileProgressChangedListeners.add(toAdd);
  }

  public void removeDownloadFileProgressChanged(HTTP.DownloadFileProgressChangedDelegate toRemove) {
    _DownloadFileProgressChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<HTTP.UploadFileProgressChangedDelegate>
      _FileUploadProgressChangedListeners =
          new java.util.ArrayList<HTTP.UploadFileProgressChangedDelegate>();

  public void addFileUploadProgressChanged(HTTP.UploadFileProgressChangedDelegate toAdd) {
    _FileUploadProgressChangedListeners.add(toAdd);
  }

  public void removeFileUploadProgressChanged(HTTP.UploadFileProgressChangedDelegate toRemove) {
    _FileUploadProgressChangedListeners.remove(toRemove);
  }

  public interface UploadFileCompletedDelegate {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, UploadFileCompletedEventArgs e);
  }

  public interface UploadFileProgressChangedDelegate {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, UploadProgressChangedEventArgs e);
  }

  public interface DownloadFileCompletedDelegate {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, AsyncCompletedEventArgs e);
  }

  public interface DownloadFileProgressChangedDelegate {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, DownloadProgressChangedEventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
