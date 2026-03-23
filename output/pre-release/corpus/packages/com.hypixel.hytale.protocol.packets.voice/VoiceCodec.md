# VoiceCodec

Type: enum | Package: com.hypixel.hytale.protocol.packets.voice | Extends: java.lang.Enum

public enum VoiceCodec

Enumerates the audio codecs supported by the voice chat system.

## Enum Constants

- Opus | 0

## Methods


public int getValue()

Returns the integer wire value of this codec.


public static VoiceCodec fromValue(int value)

Returns the `VoiceCodec` for the given wire value. Throws `ProtocolException` if the value is out of range.

## Related Types

- VoiceConfig -- references this enum for codec selection

Also in this package: RelayedVoiceData, VoiceConfig, VoiceData

Complete API:
  public int getValue()
  public static VoiceCodec fromValue(int value)

Fields:
public static final VoiceCodec[] VALUES
private final int value
