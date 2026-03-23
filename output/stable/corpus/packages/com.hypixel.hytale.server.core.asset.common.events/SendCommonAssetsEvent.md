# SendCommonAssetsEvent

Type: class | Package: com.hypixel.hytale.server.core.asset.common.events | Implements: IAsyncEvent

public class SendCommonAssetsEvent implements IAsyncEvent<Void>

Server lifecycle event.

## Accessors

- getPacketHandler() | PacketHandler | Accessor method.
- getRequestedAssets() | Asset[] | Accessor method.

Also in this package: CommonAssetMonitorEvent

Complete API:
  public PacketHandler getPacketHandler()
  public Asset[] getRequestedAssets()
  public String toString()

Fields:
private final PacketHandler packetHandler
private final Asset[] assets
