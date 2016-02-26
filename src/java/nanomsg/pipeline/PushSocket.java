package nanomsg.pipeline;

import nanomsg.Nanomsg.Domain;
import nanomsg.Nanomsg.SocketType;
import nanomsg.Socket;


public class PushSocket extends Socket {
  public PushSocket(Domain domain) {
    super(domain, SocketType.PUSH);
  }

  public PushSocket() {
    this(Domain.SP);
  }
}
