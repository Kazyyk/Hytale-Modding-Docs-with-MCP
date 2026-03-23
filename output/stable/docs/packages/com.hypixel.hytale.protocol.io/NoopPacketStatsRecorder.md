---
title: "NoopPacketStatsRecorder"
kind: "class"
package: "com.hypixel.hytale.protocol.io"
fqcn: "com.hypixel.hytale.protocol.io.NoopPacketStatsRecorder"
api_surface: false
extends: ~
implements: ["PacketStatsRecorder"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "io"
  - "class"
---

**Package:** `com.hypixel.hytale.protocol.io`

```java
final class NoopPacketStatsRecorder implements PacketStatsRecorder
```

No-op implementation of [PacketStatsRecorder](PacketStatsRecorder.md) that discards all recorded data and returns zero values from all accessors.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `recordSend(int packetId, int uncompressedSize, int compressedSize)` |
| `` | `void` | `recordReceive(int packetId, int uncompressedSize, int compressedSize)` |
| `` | `PacketStatsRecorder.PacketStatsEntry` | `getEntry(int packetId)` |
