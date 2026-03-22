---
title: "IPacketReceiver"
kind: "interface"
package: "com.hypixel.hytale.server.core.receiver"
fqcn: "com.hypixel.hytale.server.core.receiver.IPacketReceiver"
api_surface: true
extends: ~
implements: []
generator_version: "1.0.0"
generated_at: "2026-03-20T20:00:00Z"
tags:
  - "networking"
  - "packet"
  - "receiver"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.receiver`

```java
public interface IPacketReceiver
```

Defines a receiver that can accept outbound client packets. This is the low-level abstraction for sending network packets to a connected client. [Player](Player.md) implements this interface. The two methods differ in caching behavior: `write` may use packet caching for efficiency, while `writeNoCache` bypasses the cache and always sends a fresh packet.

## Methods

```java
void write(@Nonnull ToClientPacket var1)
```

Sends a `ToClientPacket` to this receiver. The packet may be cached for performance when the same packet is sent to multiple receivers.

```java
void writeNoCache(@Nonnull ToClientPacket var1)
```

Sends a `ToClientPacket` to this receiver, bypassing any packet cache. Use this when the packet must not be shared or reused across receivers.

## Related Types

- [Player](Player.md) -- the primary implementation of this interface
- [IMessageReceiver](IMessageReceiver.md) -- related receiver interface for formatted messages
- `ToClientPacket` -- the base type for all server-to-client protocol packets
