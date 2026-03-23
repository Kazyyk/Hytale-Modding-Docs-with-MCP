# LANDiscoveryThread

Type: class | Package: com.hypixel.hytale.builtin.landiscovery | Extends: Thread

class LANDiscoveryThread extends Thread

Concrete implementation extending `Thread`.

## Fields

- LAN_DISCOVERY_PORT | int | Static final int field.
- LOGGER | HytaleLogger | final HytaleLogger field.
- socket | MulticastSocket | MulticastSocket field.

## Constructors

- LANDiscoveryThread() | Creates a new LANDiscoveryThread instance.

## Methods

- run() | void | public method.
- getSocket() | MulticastSocket | public method.

Also in this package: LANDiscoveryCommand, LANDiscoveryPlugin

Complete API:
  public void run()
  public MulticastSocket getSocket()

Fields:
private static final byte[] REPLY_HEADER
private static final byte[] REQUEST_HEADER
public static final int LAN_DISCOVERY_PORT
private final HytaleLogger LOGGER
private MulticastSocket socket
