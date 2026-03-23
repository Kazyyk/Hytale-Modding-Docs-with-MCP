# PacketStatsRecorder

Type: interface | Package: com.hypixel.hytale.protocol.io

public interface PacketStatsRecorder

Defines the contract for recording packet send/receive statistics including sizes (compressed and uncompressed) and counts.

## Fields

- static | AttributeKey<PacketStatsRecorder> | CHANNEL_KEY | Netty channel attribute key
- static | PacketStatsRecorder | NOOP | No-op implementation

## Methods

- void recordSend(int packetId, int uncompressedSize, int compressedSize)
- void recordReceive(int packetId, int uncompressedSize, int compressedSize)
- PacketStatsRecorder.PacketStatsEntry getEntry(int packetId)

## Inner Types

### PacketStatsEntry


public interface PacketStatsRecorder.PacketStatsEntry

Per-packet statistics entry with send/receive counts, min/max/avg sizes, and recent stats.

### RecentStats


public record PacketStatsRecorder.RecentStats(int count, long uncompressedTotal, long compressedTotal, int uncompressedMin, int uncompressedMax, int compressedMin, int compressedMax)

Rolling window of recent packet statistics.
