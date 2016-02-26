package nanomsg;

import nanomsg.Nanomsg.MethodOption;
import nanomsg.Nanomsg.SocketType;
import org.junit.Test;

import static nanomsg.Nanomsg.symbols;
import static org.junit.Assert.assertEquals;

public class NanomsgTest {

  @Test
  public void canGetSymbolsFromEnum() {

    assertEquals(98, symbols.size());
    assertEquals(SocketType.PUB.value(), symbols.get("NN_PUB"));
    assertEquals(MethodOption.NN_MSG.value(), new Integer(-1));
  }
}