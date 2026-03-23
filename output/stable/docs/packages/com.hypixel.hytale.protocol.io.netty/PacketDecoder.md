---
title: "PacketDecoder"
kind: "class"
package: "com.hypixel.hytale.protocol.io.netty"
fqcn: "com.hypixel.hytale.protocol.io.netty.PacketDecoder"
api_surface: false
extends: "ByteToMessageDecoder"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "protocol"
---

**Package:** `com.hypixel.hytale.protocol.io.netty`

```java
public class PacketDecoder extends ByteToMessageDecoder
```

Concrete implementation extending `ByteToMessageDecoder`.

## Fields

| Field | Type | Description |
|---|---|---|
| `LENGTH_PREFIX_SIZE` | `int` | Static final int field. |
| `PACKET_ID_SIZE` | `int` | Static final int field. |
| `MIN_FRAME_SIZE` | `int` | Static final int field. |
| `CHECK_INTERVAL_MS` | `long` | Static final long field. |
| `lastPacketTimeNanos` | `long` | long field. |
| `timeoutCheckFuture` | `ScheduledFuture<?>` | ScheduledFuture<?> field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `handlerAdded(@Nonnull ChannelHandlerContext ctx)` | `void` | public method. |
| `channelActive(@Nonnull ChannelHandlerContext ctx)` | `void` | public method. |
| `channelInactive(@Nonnull ChannelHandlerContext ctx)` | `void` | public method. |
| `initialize(@Nonnull ChannelHandlerContext ctx)` | `void` | private method. |
| `cancelTimeoutCheck()` | `void` | private method. |
| `checkTimeout(@Nonnull ChannelHandlerContext ctx)` | `void` | private method. |
| `decode(@Nonnull ChannelHandlerContext ctx, @Nonnull ByteBuf in, @Nonnull List<Object> out)` | `void` | protected method. |
