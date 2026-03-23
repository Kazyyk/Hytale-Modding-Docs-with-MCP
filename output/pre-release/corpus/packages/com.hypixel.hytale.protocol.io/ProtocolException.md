# ProtocolException

Type: class | Package: com.hypixel.hytale.protocol.io | Extends: RuntimeException

public class ProtocolException extends RuntimeException

Runtime exception thrown when protocol-level errors occur during packet serialization, deserialization, compression, or validation.

Also in this package: NoopPacketStatsRecorder, PacketIO, PacketStatsEntry, PacketStatsRecorder, RecentStats, ValidationResult, VarInt

Complete API:
  public static ProtocolException arrayTooLong(String fieldName, int actual, int max)
  public static ProtocolException stringTooLong(String fieldName, int actual, int max)
  public static ProtocolException dictionaryTooLarge(String fieldName, int actual, int max)
  public static ProtocolException bufferTooSmall(String fieldName, int required, int available)
  public static ProtocolException invalidVarInt(String fieldName)
  public static ProtocolException negativeLength(String fieldName, int value)
  public static ProtocolException invalidOffset(String fieldName, int offset, int bufferLength)
  public static ProtocolException unknownPolymorphicType(String typeName, int typeId)
  public static ProtocolException duplicateKey(String fieldName, Object key)
  public static ProtocolException invalidEnumValue(String enumName, int value)
  public static ProtocolException arrayTooShort(String fieldName, int actual, int min)
  public static ProtocolException stringTooShort(String fieldName, int actual, int min)
  public static ProtocolException dictionaryTooSmall(String fieldName, int actual, int min)
  public static ProtocolException valueOutOfRange(String fieldName, Object value, double min, double max)
  public static ProtocolException valueBelowMinimum(String fieldName, Object value, double min)
  public static ProtocolException valueAboveMaximum(String fieldName, Object value, double max)
