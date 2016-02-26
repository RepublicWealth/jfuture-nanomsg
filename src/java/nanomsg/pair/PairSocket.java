package nanomsg.pair;

import nanomsg.Nanomsg.Domain;
import nanomsg.Nanomsg.SocketType;
import nanomsg.Socket;


public class PairSocket extends Socket {
  public PairSocket(Domain domain) {
    super(domain, SocketType.PAIR);
  }

  public PairSocket() {
    this(Domain.SP);
  }
}
