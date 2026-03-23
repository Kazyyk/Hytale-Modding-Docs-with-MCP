# EventData

Type: record | Package: com.hypixel.hytale.server.core.ui.builder

public record EventData(Map<String, String> events)

Record holding a string-to-string map of UI event data. Used by UIEventBuilder to attach key-value metadata to event bindings. Supports fluent `append` and `put` for building the map.

## Record Components

- events | Map<String, String> | The underlying event data map.

## Constructors

- EventData() | Creates an empty event data map.

## Methods

- append(String key, String value) | EventData | Adds a key-value pair and returns this instance.
- append(String key, @Nonnull T enumValue) | EventData | Adds an enum's name as the value.
- put(String key, String value) | EventData | Puts a key-value pair into the map.
- of(@Nonnull String key, @Nonnull String value) | EventData | Static. Creates an `EventData` with a single entry.

Also in this package: UICommandBuilder, UIEventBuilder

Complete API:
  public EventData append(String key, String value)
  public EventData append(String key, T enumValue)
  public EventData put(String key, String value)
  public static EventData of(String key, String value)
