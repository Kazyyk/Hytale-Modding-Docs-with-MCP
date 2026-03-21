---
title: "com.hypixel.hytale.server.core.io.netty"
kind: "package"
package: "com.hypixel.hytale.server.core.io.netty"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "networking"
  - "netty"
  - "io"
---

**Package:** `com.hypixel.hytale.server.core.io.netty`

Netty-based networking infrastructure for the Hytale server. This package contains the channel pipeline setup, packet encoding, rate limiting, latency simulation, and per-player connection handling. All types are internal server implementation details.

## Types

| Type | Kind | Description |
|---|---|---|
| [HytaleChannelInitializer](HytaleChannelInitializer.md) | class | Configures the Netty pipeline for new client connections. |
| [PlayerChannelHandler](PlayerChannelHandler.md) | class | Per-player handler dispatching packets to the game logic. |
| [PacketArrayEncoder](PacketArrayEncoder.md) | class | Encodes batched packet arrays into a single buffer. |
| [RateLimitHandler](RateLimitHandler.md) | class | Enforces per-connection packet rate limits. |
| [LatencySimulationHandler](LatencySimulationHandler.md) | class | Development tool for simulating network latency. |
| [NettyUtil](NettyUtil.md) | class | Static utility methods for Netty channel operations. |
