# GenericPacketHandler

Type: abstract class | Package: com.hypixel.hytale.server.core.io.handlers | Extends: PacketHandler

public abstract class GenericPacketHandler extends PacketHandler

## Fields

- private static final Consumer<ToServerPacket> EMPTY_CONSUMER
- protected final List<SubPacketHandler> packetHandlers
- private Consumer<ToServerPacket>[] handlers

## Methods

- @Nonnull public static Consumer<ToServerPacket>[] newHandlerArray(int size)
- public void registerSubPacketHandler(SubPacketHandler subPacketHandler)
- public void registerHandler(int packetId, @Nonnull Consumer<ToServerPacket> handler)
- public void registerNoOpHandlers(@Nonnull int... packetIds)
- @Override public final void accept(@Nonnull ToServerPacket packet)

Known subclasses: AssetEditorPacketHandler, GamePacketHandler

Also in this package: GenericConnectionPacketHandler, IPacketHandler, IWorldPacketHandler, InitialPacketHandler, SetupPacketHandler, SubPacketHandler

Complete API:
  public static Consumer<ToServerPacket>[] newHandlerArray(int size)
  public void registerSubPacketHandler(SubPacketHandler subPacketHandler)
  public void registerHandler(int packetId, Consumer<ToServerPacket> handler)
  public void registerNoOpHandlers(int packetIds)
  public final void accept(ToServerPacket packet)

Fields:
private static final Consumer<ToServerPacket> EMPTY_CONSUMER
protected final List<SubPacketHandler> packetHandlers
private Consumer<ToServerPacket>[] handlers
