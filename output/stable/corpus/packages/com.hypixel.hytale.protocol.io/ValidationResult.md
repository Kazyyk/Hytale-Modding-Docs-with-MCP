# ValidationResult

Type: record | Package: com.hypixel.hytale.protocol.io

public record ValidationResult(boolean isValid, @Nullable String error)

Immutable record representing the result of a packet validation check.

## Fields

- public static final | ValidationResult | OK | Singleton for successful validation

## Methods

- public static ValidationResult error(String message)
- public void throwIfInvalid()

Also in this package: NoopPacketStatsRecorder, PacketIO, PacketStatsEntry, PacketStatsRecorder, ProtocolException, RecentStats, VarInt

Complete API:
  public static ValidationResult error(String message)
  public void throwIfInvalid()

Fields:
public static final ValidationResult OK
