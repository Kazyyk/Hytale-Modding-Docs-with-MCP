# PacketAdapters

Type: class | Package: com.hypixel.hytale.server.core.io.adapter

public class PacketAdapters

## Fields

- private static final List<PacketFilter> inboundHandlers
- private static final List<PacketFilter> outboundHandlers

## Methods

- @Nonnull public static PacketFilter registerInbound(PacketWatcher watcher)
- public static void registerInbound(PacketFilter predicate)
- @Nonnull public static PacketFilter registerOutbound(PacketWatcher watcher)
- public static void registerOutbound(PacketFilter predicate)
- @Nonnull public static PacketFilter registerInbound(PlayerPacketFilter filter)
- @Nonnull public static PacketFilter registerOutbound(PlayerPacketFilter filter)
- @Nonnull public static PacketFilter registerInbound(PlayerPacketWatcher watcher)
- @Nonnull public static PacketFilter registerOutbound(PlayerPacketWatcher watcher)
- public static void deregisterInbound(PacketFilter predicate)
- public static void deregisterOutbound(PacketFilter predicate)
- public static boolean __handleInbound(PacketHandler player, Packet packet)
- private static boolean handle(List<PacketFilter> list, PacketHandler player, T packet)
- public static boolean __handleOutbound(PacketHandler player, Packet packet)
