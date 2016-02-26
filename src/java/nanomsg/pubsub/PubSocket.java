package nanomsg.pubsub;

import nanomsg.Nanomsg.Domain;
import nanomsg.Nanomsg.SocketType;
import nanomsg.Socket;

public class PubSocket extends Socket {
  public PubSocket(Domain domain) {
    super(domain, SocketType.PUB);
  }

  public PubSocket() {
    this(Domain.SP);
  }
}
