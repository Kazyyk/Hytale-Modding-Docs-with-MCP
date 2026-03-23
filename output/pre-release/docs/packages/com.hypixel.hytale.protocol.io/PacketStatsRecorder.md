---
title: "PacketStatsRecorder"
kind: "interface"
package: "com.hypixel.hytale.protocol.io"
fqcn: "com.hypixel.hytale.protocol.io.PacketStatsRecorder"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "io"
  - "interface"
---

**Package:** `com.hypixel.hytale.protocol.io`

```java
public interface PacketStatsRecorder
```

Defines the contract for recording packet send/receive statistics including sizes (compressed and uncompressed) and counts.

## Fields

| Modifier | Type | Field | Description |
|---|---|---|---|
| `static` | `AttributeKey<PacketStatsRecorder>` | `CHANNEL_KEY` | Netty channel attribute key |
| `static` | `PacketStatsRecorder` | `NOOP` | No-op implementation |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `recordSend(int packetId, int uncompressedSize, int compressedSize)` |
| `` | `void` | `recordReceive(int packetId, int uncompressedSize, int compressedSize)` |
| `` | `PacketStatsRecorder.PacketStatsEntry` | `getEntry(int packetId)` |

## Inner Types

### PacketStatsEntry

```java
public interface PacketStatsRecorder.PacketStatsEntry
```

Per-packet statistics entry with send/receive counts, min/max/avg sizes, and recent stats.

### RecentStats

```java
public record PacketStatsRecorder.RecentStats(int count, long uncompressedTotal, long compressedTotal, int uncompressedMin, int uncompressedMax, int compressedMin, int compressedMax)
```

Rolling window of recent packet statistics.
