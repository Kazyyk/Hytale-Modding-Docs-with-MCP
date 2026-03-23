# IWorldPacketHandler

Type: interface | Package: com.hypixel.hytale.server.core.io.handlers | Extends: Packet>

public interface IWorldPacketHandler<T extends Packet>

## Methods

- void handle(@Nonnull T var1, @Nonnull PlayerRef var2, @Nonnull Ref<EntityStore> var3, @Nonnull World var4, @Nonnull Store<EntityStore> var5)

Also in this package: GenericConnectionPacketHandler, GenericPacketHandler, IPacketHandler, InitialPacketHandler, SetupPacketHandler, SubPacketHandler

Complete API:
  void handle(T var1, PlayerRef var2, Ref<EntityStore> var3, World var4, Store<EntityStore> var5)
  static void registerHandler(IPacketHandler packetHandler, int packetId, IWorldPacketHandler<T> handler)
  static void registerHandler(IPacketHandler packetHandler, int packetId, IWorldPacketHandler<T> handler, Predicate<PlayerRef> precondition)
