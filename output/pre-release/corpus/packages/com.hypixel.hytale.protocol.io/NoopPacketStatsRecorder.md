# NoopPacketStatsRecorder

Type: class | Package: com.hypixel.hytale.protocol.io | Implements: PacketStatsRecorder

final class NoopPacketStatsRecorder implements PacketStatsRecorder

No-op implementation of PacketStatsRecorder that discards all recorded data and returns zero values from all accessors.

## Methods

- void recordSend(int packetId, int uncompressedSize, int compressedSize)
- void recordReceive(int packetId, int uncompressedSize, int compressedSize)
- PacketStatsRecorder.PacketStatsEntry getEntry(int packetId)
