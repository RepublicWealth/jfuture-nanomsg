package nanomsg;

import com.google.common.collect.ImmutableMap;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

import java.util.Map;


public final class Nanomsg {

  /* Low level native interface wrapper */

  public static final int getErrorNumber() {
    return NativeLibrary.nn_errno();
  }

  public static final String getError() {
    final int currentError = Nanomsg.getErrorNumber();
    return NativeLibrary.nn_strerror(currentError);
  }

  public static final void terminate() {
    NativeLibrary.nn_term();
  }

  private static final Map<String, Integer> getSymbols() {
    ImmutableMap.Builder<String, Integer> symbolsBuilder = new ImmutableMap.Builder<>();

    int index = 0;
    while (true) {
      IntByReference valueRef = new IntByReference();
      Pointer ptr = NativeLibrary.nn_symbol(index, valueRef);

      if (ptr == null) {
        break;
      }

      symbolsBuilder.put(ptr.getString(0), valueRef.getValue());
      index += 1;
    }

    return symbolsBuilder.build();
  }

  public static final Map<String, Integer> symbols = Nanomsg.getSymbols();

  public enum Domain {
    SP("AF_SP"),
    SP_RAW("AF_SP_RAW");

    private final Integer value;

    Domain(String name) {
      this.value = symbols.get(name);
    }

    public Integer value() {
      return value;
    }
  }

  public enum SocketType {

    /* PubSub */
    PUB("NN_PUB"),
    SUB("NN_SUB"),

    /* ReqRep */
    REQ("NN_REQ"),
    REP("REP"),

    /* Pipeline */
    PUSH("NN_PUSH"),
    PULL("NN_PULL"),

    /* Bus */
    BUS("NN_BUS"),

    /* Pair */
    PAIR("NN_PAIR");

    private final Integer value;

    SocketType(String name) {
      this.value = symbols.get(name);
    }

    public Integer value() {
      return value;
    }
  }

  public enum SocketOption {
    NN_SUB_UNSUBSCRIBE,
    NN_REQ_RESEND_IVL,
    NN_SUB_SUBSCRIBE,
    NN_SNDTIMEO,
    NN_SNDFD,
    NN_RCVFD,
    NN_RCVTIMEO;

//    NN_SUB_UNSUBSCRIBE,
//    NN_REQ_RESEND_IVL,
//    NN_SUB_SUBSCRIBE,
//    NN_SNDTIMEO,
//    NN_SNDFD,
//    NN_RCVFD,
//    NN_RCVTIMEO;

    public Integer value() {
      return symbols.get(name());
    }
  }

  public enum MethodOption {
    NN_SOL_SOCKET,
    NN_MSG,
    NN_DONTWAIT;

    public Integer value() {
      return name().equals("NN_MSG") ? -1 : symbols.get(name());
    }
  }

  public enum Error {
    EAFNOSUPPORT,
    ETERM,
    EFSM,
    EAGAIN,
    ECONNREFUSED;

    public Integer value() {
      return symbols.get(name());
    }
  }
}
