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
