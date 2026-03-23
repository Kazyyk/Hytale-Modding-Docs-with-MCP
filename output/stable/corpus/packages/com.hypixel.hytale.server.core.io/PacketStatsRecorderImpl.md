# PacketStatsRecorderImpl

Type: class | Package: com.hypixel.hytale.server.core.io | Implements: PacketStatsRecorder

public class PacketStatsRecorderImpl implements PacketStatsRecorder

Concrete implementation of `PacketStatsRecorder` that tracks per-packet-ID send/receive statistics including counts, compressed/uncompressed byte totals, min/max/average sizes, and recent-30-second sliding window metrics. Supports up to 512 packet IDs.

## Constructors


public PacketStatsRecorderImpl()

## Instance Methods


public void recordSend(int packetId, int uncompressedSize, int compressedSize)


public void recordReceive(int packetId, int uncompressedSize, int compressedSize)


public PacketStatsEntry getEntry(int packetId)

## Inner Classes

### PacketStatsEntry


public static class PacketStatsEntry implements PacketStatsRecorder.PacketStatsEntry

Per-packet-ID statistics tracker. Thread-safe via atomic integers/longs. Tracks sent and received counts, total bytes (compressed/uncompressed), min/max sizes, rolling averages, and a 30-second recent-activity window.

### SizeRecord


public record SizeRecord(long nanos, int uncompressedSize, int compressedSize)

Timestamped record of a single packet's sizes for recent-activity tracking.
