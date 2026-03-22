---
title: "PacketHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io"
fqcn: "com.hypixel.hytale.server.core.io.PacketHandler"
api_surface: true
extends: ~
implements:
  - "IPacketReceiver"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "networking"
  - "packet"
  - "connection"
---

**Package:** `com.hypixel.hytale.server.core.io`

```java
public abstract class PacketHandler implements IPacketReceiver
```

Abstract base class for server-side network connection handlers. Manages the Netty channel lifecycle, packet write/flush queuing, ping/pong measurement, connection timeouts, login stage progression, and disconnect logic. Each connected client has a `PacketHandler` instance that tracks its authentication state, protocol version, and multiple network channels (default, chunks, world map).

## Constants

```java
public static final int MAX_PACKET_ID = 512
```

```java
public static final Map<NetworkChannel, QuicStreamPriority> DEFAULT_STREAM_PRIORITIES
```

Default QUIC stream priorities for the three network channels.

## Constructors

```java
public PacketHandler(@Nonnull Channel channel, @Nonnull ProtocolVersion protocolVersion)
```

## Abstract Methods

```java
public abstract String getIdentifier()
```

```java
public abstract void accept(@Nonnull ToServerPacket var1)
```

## Instance Methods

```java
public Channel getChannel()
```

```java
public ProtocolVersion getProtocolVersion()
```

```java
public final void registered(@Nullable PacketHandler oldHandler)
```

```java
public final void unregistered(@Nullable PacketHandler newHandler)
```

```java
public void handle(@Nonnull ToServerPacket packet)
```

Delegates to `accept(ToServerPacket)`.

```java
public void write(@Nonnull ToClientPacket... packets)
```

Writes one or more packets on the same network channel. All packets must share the same channel. Supports queued or immediate flush modes.

```java
public void write(@Nonnull ToClientPacket[] packets, @Nonnull ToClientPacket finalPacket)
```

```java
public void write(@Nonnull ToClientPacket packet)
```

```java
public void writeNoCache(@Nonnull ToClientPacket packet)
```

```java
public void writePacket(@Nonnull ToClientPacket packet, boolean cache)
```

```java
public void disconnect(@Nonnull String message)
```

Logs the disconnect reason and sends a `Disconnect` packet to the client.

```java
public PacketStatsRecorder getPacketStatsRecorder()
```

```java
public PingInfo getPingInfo(@Nonnull PongType pongType)
```

```java
public long getOperationTimeoutThreshold()
```

Returns timeout threshold in milliseconds based on 2x average tick ping plus 3000ms.

```java
public void tickPing(float dt)
```

```java
public void sendPing()
```

```java
public void handlePong(@Nonnull Pong packet)
```

```java
public void setQueuePackets(boolean queuePackets)
```

```java
public void tryFlush()
```

```java
public PlayerAuthentication getAuth()
```

```java
public boolean stillActive()
```

```java
public int getQueuedPacketsCount()
```

```java
public boolean isLocalConnection()
```

```java
public boolean isLANConnection()
```

```java
public String getSniHostname()
```

```java
public DisconnectReason getDisconnectReason()
```

```java
public void setClientReadyForChunksFuture(@Nonnull CompletableFuture<Void> clientReadyFuture)
```

```java
public CompletableFuture<Void> getClientReadyForChunksFuture()
```

```java
public Channel getChannel(@Nonnull NetworkChannel networkChannel)
```

```java
public void setChannel(@Nonnull NetworkChannel networkChannel, @Nonnull Channel channel)
```

## Static Methods

```java
public static void logConnectionTimings(@Nonnull Channel channel, @Nonnull String message, @Nonnull Level level)
```

## Inner Classes

### DisconnectReason

```java
public static class DisconnectReason
```

Tracks the reason for disconnection, either server-initiated (string message) or client-initiated (`DisconnectType`). Setting one clears the other.

### PingInfo

```java
public static class PingInfo
```

Tracks per-connection ping metrics for a given `PongType` (Raw, Direct, Tick). Maintains a thread-safe queue of sent ping IDs and timestamps, computing round-trip latency via `HistoricMetric` across 1-second, 1-minute, and 5-minute windows.
