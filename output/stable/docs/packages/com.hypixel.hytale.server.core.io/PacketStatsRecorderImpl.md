---
title: "PacketStatsRecorderImpl"
kind: "class"
package: "com.hypixel.hytale.server.core.io"
fqcn: "com.hypixel.hytale.server.core.io.PacketStatsRecorderImpl"
api_surface: false
extends: ~
implements:
  - "PacketStatsRecorder"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "networking"
  - "metrics"
  - "packet"
---

**Package:** `com.hypixel.hytale.server.core.io`

```java
public class PacketStatsRecorderImpl implements PacketStatsRecorder
```

Concrete implementation of `PacketStatsRecorder` that tracks per-packet-ID send/receive statistics including counts, compressed/uncompressed byte totals, min/max/average sizes, and recent-30-second sliding window metrics. Supports up to 512 packet IDs.

## Constructors

```java
public PacketStatsRecorderImpl()
```

## Instance Methods

```java
public void recordSend(int packetId, int uncompressedSize, int compressedSize)
```

```java
public void recordReceive(int packetId, int uncompressedSize, int compressedSize)
```

```java
public PacketStatsEntry getEntry(int packetId)
```

## Inner Classes

### PacketStatsEntry

```java
public static class PacketStatsEntry implements PacketStatsRecorder.PacketStatsEntry
```

Per-packet-ID statistics tracker. Thread-safe via atomic integers/longs. Tracks sent and received counts, total bytes (compressed/uncompressed), min/max sizes, rolling averages, and a 30-second recent-activity window.

### SizeRecord

```java
public record SizeRecord(long nanos, int uncompressedSize, int compressedSize)
```

Timestamped record of a single packet's sizes for recent-activity tracking.
