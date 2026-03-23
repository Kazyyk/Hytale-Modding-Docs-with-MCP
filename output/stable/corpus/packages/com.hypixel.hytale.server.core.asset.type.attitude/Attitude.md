# Attitude

Type: enum | Package: com.hypixel.hytale.server.core.asset.type.attitude | Implements: Supplier

public enum Attitude implements Supplier<String>

Enumeration with values: `IGNORE`, `HOSTILE`, `NEUTRAL`, `FRIENDLY`, `REVERED`.

## Enum Constants

- IGNORE | is ignoring the target
- HOSTILE | is hostile towards the target
- NEUTRAL | is neutral towards the target
- FRIENDLY | is friendly towards the target
- REVERED | reveres the target

## Accessors

- get() | String | Accessor method.

Complete API:
  public String get()

Fields:
public static final EnumCodec<Attitude> CODEC
public static final Attitude[] VALUES
private final String description
