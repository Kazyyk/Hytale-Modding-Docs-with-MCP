# IPacketHandler

Type: interface | Package: com.hypixel.hytale.server.core.io.handlers

public interface IPacketHandler

## Methods

- void registerHandler(int var1, @Nonnull Consumer<ToServerPacket> var2)
- void registerNoOpHandlers(int... var1)
- @Nonnull PlayerRef getPlayerRef()
- @Nonnull String getIdentifier()

Known implementors: GamePacketHandler

Also in this package: GenericConnectionPacketHandler, GenericPacketHandler, IWorldPacketHandler, InitialPacketHandler, SetupPacketHandler, SubPacketHandler

Complete API:
  void registerHandler(int var1, Consumer<ToServerPacket> var2)
  void registerNoOpHandlers(int var1)
  PlayerRef getPlayerRef()
  String getIdentifier()
