---
title: "PacketHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io"
fqcn: "com.hypixel.hytale.server.core.io.PacketHandler"
api_surface: true
extends: null
implements:
  - "IPacketReceiver"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:19:37Z"
tags:
  - "networking"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.io`

```java
public abstract class PacketHandler implements IPacketReceiver
```

Abstract base class for all server-side network packet handlers. Manages Netty channel lifecycle, packet writing (queued and immediate), ping/pong measurement, connection stage timeouts, disconnect handling, auxiliary QUIC stream management, and protocol version tracking. Extended by `InitialPacketHandler`, `GamePacketHandler`, and authentication handlers.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `MAX_PACKET_ID` | `512` |
| `public static final` | `Map<NetworkChannel, QuicStreamPriority>` | `DEFAULT_STREAM_PRIORITIES` | |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Channel` | `getChannel()` |
| `public` | `Channel` | `getChannel(StreamType type)` |
| `public abstract` | `String` | `getIdentifier()` |
| `public` | `ProtocolVersion` | `getProtocolVersion()` |
| `public` | `void` | `write(ToClientPacket packet)` |
| `public` | `void` | `write(ToClientPacket... packets)` |
| `public` | `void` | `writeNoCache(ToClientPacket packet)` |
| `public` | `void` | `disconnect(Message message)` |
| `public` | `void` | `disconnect(FormattedMessage message)` |
| `public abstract` | `void` | `accept(ToServerPacket packet)` |
| `public` | `void` | `tickPing(float dt)` |
| `public` | `void` | `sendPing()` |
| `public` | `void` | `handlePong(Pong packet)` |
| `public` | `PingInfo` | `getPingInfo(PongType pongType)` |
| `public` | `long` | `getOperationTimeoutThreshold()` |
| `public` | `boolean` | `stillActive()` |
| `public` | `boolean` | `isLocalConnection()` |
| `public` | `boolean` | `isLANConnection()` |
| `public` | `String` | `getSniHostname()` |
| `public` | `void` | `setChannel(StreamType type, Channel channel)` |
| `public` | `boolean` | `checkStreamOpenRateLimit()` |
| `public` | `DisconnectReason` | `getDisconnectReason()` |
| `public` | `PlayerAuthentication` | `getAuth()` |
| `public` | `void` | `setQueuePackets(boolean queuePackets)` |
| `public` | `void` | `tryFlush()` |

## Inner Classes

| Class | Description |
|---|---|
| [PacketHandler.DisconnectReason](PacketHandler.DisconnectReason.md) | Tracks server or client disconnect reason |
| PacketHandler.PingInfo | Per-pong-type ping measurement with metric history |

## Relationships

- Implements `IPacketReceiver`
- Extended by `GamePacketHandler`, `InitialPacketHandler`, authentication handlers
