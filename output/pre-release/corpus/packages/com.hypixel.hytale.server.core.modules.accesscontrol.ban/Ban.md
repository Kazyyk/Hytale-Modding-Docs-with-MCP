# Ban

Type: interface | Package: com.hypixel.hytale.server.core.modules.accesscontrol.ban | Implements: AccessProvider

public interface Ban extends AccessProvider

## Methods

- UUID getTarget()
- UUID getBy()
- Instant getTimestamp()
- boolean isInEffect()
- Optional<String> getReason()
- String getType()
- JsonObject toJsonObject()

Known implementors: AbstractBan

Also in this package: AbstractBan, BanParser, InfiniteBan, TimedBan

Complete API:
  UUID getTarget()
  UUID getBy()
  Instant getTimestamp()
  boolean isInEffect()
  Optional<String> getReason()
  String getType()
  JsonObject toJsonObject()
