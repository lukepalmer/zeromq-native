package net.lukepalmer.zeromqnative;

import org.junit.Test;
import org.zeromq.ZMQ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringStartsWith.startsWith;


/**
 * Make some basic calls that show native libraries are being loaded
 */
public class LibraryLoadTest {
    @Test
    public void LibVersion() {
        // this will throw if jzmq and zmq are not available
        assertThat(ZMQ.getVersionString(), startsWith("4"));
        System.out.println(ZMQ.getVersionString());
    }
}
