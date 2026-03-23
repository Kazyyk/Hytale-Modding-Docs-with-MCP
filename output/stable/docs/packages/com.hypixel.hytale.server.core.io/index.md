---
title: "com.hypixel.hytale.server.core.io"
kind: "package"
package: "com.hypixel.hytale.server.core.io"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "networking"
  - "io"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.io`

Server-side networking infrastructure. Manages network connections, packet handling, serialization, protocol versioning, connection statistics, and transport binding (TCP/QUIC).

## Types

| Type | Kind | Description |
|---|---|---|
| [NetworkSerializable](NetworkSerializable.md) | interface | Generic self-serialization interface for converting objects to packets. |
| [NetworkSerializer](NetworkSerializer.md) | interface | Functional interface for external object-to-packet conversion. |
| [NetworkSerializers](NetworkSerializers.md) | interface | Container for shared `NetworkSerializer` instances (e.g., `Box` to `Hitbox`). |
| [PacketHandler](PacketHandler.md) | class | Abstract base for connection handlers managing channels, ping, timeouts, and packets. |
| [PacketStatsRecorderImpl](PacketStatsRecorderImpl.md) | class | Per-packet-ID send/receive statistics with min/max/avg and sliding window metrics. |
| [ProtocolVersion](ProtocolVersion.md) | class | Immutable CRC-based protocol version identifier. |
| [ServerManager](ServerManager.md) | class | Core plugin managing transport binding, listeners, and sub-packet handler registration. |
