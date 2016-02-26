package nanomsg.reqrep;

import nanomsg.Nanomsg.Domain;
import nanomsg.Nanomsg.SocketType;
import nanomsg.Socket;


public class ReqSocket extends Socket {
  public ReqSocket(Domain domain) {
    super(domain, SocketType.REQ);
  }

  public ReqSocket() {
    this(Domain.SP);
  }
}
