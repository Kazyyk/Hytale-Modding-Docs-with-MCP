---
title: "com.hypixel.hytale.protocol.io"
package: "com.hypixel.hytale.protocol.io"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
---

**Package:** `com.hypixel.hytale.protocol.io`

## Interfaces

| Type | Description |
|---|---|
| [PacketStatsRecorder](PacketStatsRecorder.md) | Contract for recording packet send/receive statistics |

## Records

| Type | Description |
|---|---|
| [ValidationResult](ValidationResult.md) | Immutable validation result record |

## Classes

| Type | Description |
|---|---|
| [NoopPacketStatsRecorder](NoopPacketStatsRecorder.md) | No-op PacketStatsRecorder that discards all data |
| [PacketIO](PacketIO.md) | Utility class for packet serialization with Zstd compression |
| [ProtocolException](ProtocolException.md) | Runtime exception for protocol-level errors |
| [VarInt](VarInt.md) | VarInt encoding/decoding for protocol buffers |
