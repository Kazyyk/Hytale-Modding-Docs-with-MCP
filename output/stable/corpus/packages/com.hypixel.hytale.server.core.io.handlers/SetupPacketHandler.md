# SetupPacketHandler

Type: class | Package: com.hypixel.hytale.server.core.io.handlers | Extends: GenericConnectionPacketHandler

public class SetupPacketHandler extends GenericConnectionPacketHandler

## Fields

- private final UUID uuid
- private final String username
- private final byte[] referralData
- private final HostAddress referralSource
- private PlayerCommonAssets assets
- private boolean receivedRequest
- private int clientViewRadiusChunks

## Methods

- @Override @Nonnull public String getIdentifier()
- @Override public void registered0(@Nonnull PacketHandler oldHandler)
- @Override public void accept(@Nonnull ToServerPacket packet)
- @Override public void closed(ChannelHandlerContext ctx)
- public void handle(@Nonnull Disconnect packet)
- public void handle(@Nonnull RequestAssets packet)
- public void handle(@Nonnull ViewRadius packet)
- public void handle(@Nonnull PlayerOptions packet)

Also in this package: GenericConnectionPacketHandler, GenericPacketHandler, IPacketHandler, IWorldPacketHandler, InitialPacketHandler, SubPacketHandler

Complete API:
  public String getIdentifier()
  public void registered0(PacketHandler oldHandler)
  public void accept(ToServerPacket packet)
  public void closed(ChannelHandlerContext ctx)
  public void handle(Disconnect packet)
  public void handle(RequestAssets packet)
  public void handle(ViewRadius packet)
  public void handle(PlayerOptions packet)

Fields:
private final UUID uuid
private final String username
private final byte[] referralData
private final HostAddress referralSource
private PlayerCommonAssets assets
private boolean receivedRequest
private int clientViewRadiusChunks
