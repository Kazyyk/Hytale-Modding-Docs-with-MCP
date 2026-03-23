# AbstractBan

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.ban | Implements: Ban

abstract class AbstractBan implements Ban

## Fields

- protected final UUID target
- protected final UUID by
- protected final Instant timestamp
- protected final Optional<String> reason

## Methods

- @Override public UUID getTarget()
- @Override public UUID getBy()
- @Override public Instant getTimestamp()
- @Nonnull @Override public Optional<String> getReason()
- @Nonnull @Override public JsonObject toJsonObject()

Known subclasses: InfiniteBan, TimedBan

Also in this package: Ban, BanParser, InfiniteBan, TimedBan

Complete API:
  public UUID getTarget()
  public UUID getBy()
  public Instant getTimestamp()
  public Optional<String> getReason()
  public JsonObject toJsonObject()

Fields:
protected final UUID target
protected final UUID by
protected final Instant timestamp
protected final Optional<String> reason
