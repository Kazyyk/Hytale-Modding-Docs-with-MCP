# InitialPacketHandler

Type: class | Package: com.hypixel.hytale.server.core.io.handlers | Extends: PacketHandler

public class InitialPacketHandler extends PacketHandler

## Fields

- private static final int MAX_REFERRAL_DATA_SIZE
- public static AuthenticationPacketHandler.AuthHandlerSupplier EDITOR_PACKET_HANDLER_SUPPLIER
- private boolean receivedConnect

## Methods

- @Override @Nonnull public String getIdentifier()
- @Override public void registered0(PacketHandler oldHandler)
- @Override public void accept(@Nonnull ToServerPacket packet)
- @Override public void disconnect(@Nonnull String message)
- public void handle(@Nonnull Connect packet)
- private byte[] generatePasswordChallengeIfNeeded(UUID playerUuid)
- public void handle(@Nonnull Disconnect packet)
