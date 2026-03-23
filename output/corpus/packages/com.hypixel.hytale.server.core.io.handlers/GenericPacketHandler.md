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
