---
title: "CachedPacket"
kind: "final class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CachedPacket"
api_surface: true
extends: ~
implements:
  - "ToClientPacket"
  - "AutoCloseable"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public final class CachedPacket<T extends ToClientPacket> implements ToClientPacket, AutoCloseable
```

Wraps a `ToClientPacket` by pre-serializing its bytes into a Netty `ByteBuf` for efficient repeated transmission. This avoids re-serializing the same packet data when sending to multiple clients. Uses Netty reference counting for memory management -- the cached buffer must be released via `close()` when no longer needed.

## Factory Method

```java
public static <T extends ToClientPacket> CachedPacket<T> cache(@Nonnull T packet)
```

Creates a new `CachedPacket` by serializing the given packet into a buffer. Throws `IllegalArgumentException` if the input is already a `CachedPacket` (nesting is not allowed).

## Methods

```java
@Override
public int getId()
```

Returns the packet ID of the wrapped packet.

```java
@Override
public NetworkChannel getChannel()
```

Returns the network channel of the wrapped packet.

```java
@Override
public void serialize(@Nonnull ByteBuf buf)
```

Writes the pre-serialized bytes into the given buffer. Throws `IllegalStateException` if the cached buffer has already been released.

```java
@Override
public int computeSize()
```

Returns the size of the cached serialized data in bytes.

```java
public Class<T> getPacketType()
```

Returns the `Class` object for the wrapped packet type.

```java
public int getCachedSize()
```

Returns the number of readable bytes in the cached buffer.

```java
@Override
public void close()
```

Releases the underlying Netty `ByteBuf`. After calling `close()`, the `CachedPacket` must not be used for serialization.

## Usage Pattern

```java
// Pre-serialize a packet once
CachedPacket<MyPacket> cached = CachedPacket.cache(myPacket);
try {
    // Send to multiple clients without re-serialization
    for (Connection conn : connections) {
        conn.send(cached);
    }
} finally {
    cached.close(); // Release the buffer
}
```
