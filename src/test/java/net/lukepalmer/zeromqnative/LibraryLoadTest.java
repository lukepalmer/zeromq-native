package net.lukepalmer.zeromqnative;

import org.junit.Test;
import org.zeromq.ZMQ;

/**
 * Created by luke on 2/17/16.
 */
public class LibraryLoadTest {
    @Test
    public void LibVersion() {
        System.out.println(ZMQ.getVersionString());
    }
}
