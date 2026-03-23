---
title: "VoiceStreamHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.voice"
fqcn: "com.hypixel.hytale.server.core.modules.voice.VoiceStreamHandler"
api_surface: false
extends: "SimpleChannelInboundHandler<Packet>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "voice"
  - "stream"
  - "netty"
---

**Package:** `com.hypixel.hytale.server.core.modules.voice`

```java
public class VoiceStreamHandler extends SimpleChannelInboundHandler<Packet>
```

Netty channel handler for the dedicated voice stream. Validates incoming voice data packets against rate limits, mute state, silence state, packet size, and routing status before dispatching to the voice executor for routing. Disables routing after 10 consecutive errors.

## Methods

| Method | Signature |
|---|---|
| `handlerAdded` | `void handlerAdded(@Nonnull ChannelHandlerContext ctx)` |
| `channelRead0` | `protected void channelRead0(@Nonnull ChannelHandlerContext ctx, @Nonnull Packet packet)` |
| `channelInactive` | `void channelInactive(@Nonnull ChannelHandlerContext ctx)` |
| `exceptionCaught` | `void exceptionCaught(@Nonnull ChannelHandlerContext ctx, @Nonnull Throwable cause)` |